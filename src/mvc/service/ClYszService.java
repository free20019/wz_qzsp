
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;
import helper.SysHelper;
import helper.SystemConfig;
import helper.Verify;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


/**
 * 车辆运输证service
 * @author Administrator
 *
 */

@Service
public class ClYszService extends MvcService{
	protected Verify v = new Verify();
	protected JdbcTemplate jdbcTemplate = null;
	protected JdbcTemplate jdbcTemplate2 = null;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private MessageClient messageClient = null;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate2() {
		return jdbcTemplate2;
	}

	@Autowired
	public void setJdbcTemplate2(JdbcTemplate jdbcTemplate2) {
		this.jdbcTemplate2 = jdbcTemplate2;
	}

	private JacksonUtil jacksonUtil = JacksonUtil.buildNormalBinder();
	public String test() {
		logger.info(jdbcTemplate+"");
		logger.info(jdbcTemplate2+"");

		return "ok";
	}
	/**
	 * 检测查询的车架号是否被注册
	 */
	public int cjhsfzc(String vin){
		int a = 0;
		String sql = "select count(*) from tb_clsqxx where vin = '"+vin+"' and IS_YX = '0'";
		logger.debug("APP_DEBUG,{}",sql);
		int list = jdbcTemplate.queryForObject(sql, Integer.class);
		if(list>0){
			a = 1;
		}else{
			a = 0;
		}
		return a;
	}
	public String czvin(HttpServletRequest request,String postData){
		logger.debug("APP_DEBUG,{}",postData);
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String vin = String.valueOf(paramMap.get("VIN"));//vin
//		String xm = String.valueOf(paramMap.get("XM"));//姓名
//		String xm = String.valueOf(request.getSession().getAttribute("dbxm"));
		Map<String, Object> map = new HashMap<String, Object>();
		if(vin!=null&&!vin.isEmpty()){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Calendar c = Calendar.getInstance();
	        c.setTime(new Date());
	        c.add(Calendar.YEAR, -1);
	        Date y = c.getTime();
	        String year = format.format(y);
//	        System.out.println("过去一年："+year);
			map.put("type", "0");
			String sql = "select * from JCDATA c where"
					+ "  c.vin=? and jypdrq>to_date('"+year+"','yyyy-mm-dd hh24:mi:ss') and updatetime = (select max(updatetime) from jcdata where vin = ?)";
			logger.debug("APP_DEBUG {} , {} ,{} ",sql,vin,vin);
			System.out.println(sql+" "+vin);
			List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,vin,vin);
			logger.debug("APP_DEBUG {} ",list.size());
			if(list!=null&&list.size()>0){
				if(cjhsfzc(vin)==1){
					map.put("type", "1");
					map.put("info", "该车辆已申请，请勿重复申请！");
					return jacksonUtil.toJson(map);
				}else{
					int count = cx_last_gps(list.get(0).get("CARNO").toString());
					if(count>0){
						map.put("type", "0");
						map.put("data" , list);
						return jacksonUtil.toJson(map);
					}else{
						map.put("type", "1");
						map.put("info", "该车未安装卫星定位装置，请安装卫星定位装置后再进行车辆运输证申请!");
						return jacksonUtil.toJson(map);
					}
				}
			}else{
				map.put("type", "1");
				map.put("info", "无检测记录，车辆识别代号有误或尚未进行综合检测！（检测站信息详见首页右侧）");
				return jacksonUtil.toJson(map);
			}
		}else{
			map.put("type", "1");
			map.put("info", "姓名或车架号不能为空");
			return jacksonUtil.toJson(map);
		}
	}
	public int cx_last_gps(String cphm){
		int count = 0;
		String sql = "select * from TB_WYC_GPS where vehicle_no = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,cphm);
		System.out.println(sql+" "+cphm);
		if(list!=null&&list.size()>0){
			count=1;
		}
		return count;
	}
	//查询车牌号码是否重复
	public int findcphm(String cphm){
		String sql = "select count(*) from tb_clsqxx where cphm='"+cphm+"' and is_yx = '0'";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	/**
	 * 车辆运输证文本内容提交
	 */
	public String clyszwnnr(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		/**
		 * 根据用户的姓名和车架号查询该车的具体信息
		 * 其中用户不可更改的信息只验证查询出来的内容进行验证符不符合条件
		 * 用户可以更改的信息根据页面传过来的内容验证符不符合条件
		 * 全部都符合条件则把页面传过来的内容插入表中
		 * 即完成车辆的申请操作
		 */
		String xm = String.valueOf(paramMap.get("jdcsyr"));//姓名
		if(!v.isUSERName(xm)){
			return "{\"info\":\"姓名填写错误\"}";
		}
		String vin = String.valueOf(paramMap.get("CLSBDH"));//vin
		if(!v.isCLSBM(vin)){
			return "{\"info\":\"车辆识别代号\"}";
		}
		int count = cjhsfzc(vin);
		logger.info(count+"");
		if(count>0){
			return "{\"info\":\"该车架号已申请，请勿重复申请！\"}";
		}
		String jyqy = String.valueOf(paramMap.get("GSD"));//经营区域
		if(!v.isUSERName(jyqy)){
			return "{\"info\":\"申请经营区域填写错误\"}";
		}
		String cphm =String.valueOf(paramMap.get("CPHM"));	//车牌号码
		if(!v.isCPHM(cphm)){
			return "{\"info\":\"车牌号码格式填写错误\"}";
		}
		if(!cphm.equals("浙C#")){
			int cp = findcphm(cphm);
			if(cp>0){
				return "{\"info\":\"该车牌已注册,请更换车牌注册\"}";
			}
		}
		String hdzkw =String.valueOf(paramMap.get("HDZKW"));	//核定载客位
		if(!v.isHDZKW(hdzkw)){
			return "{\"info\":\"核定载客位不符合条件,无法提交申请\"}";
		}
		String rllx =String.valueOf(paramMap.get("RLLX"));//车辆燃油类型
		if(!v.isCLLX(rllx)){
			return "{\"info\":\"车辆燃油类型不符合条件,无法提交申请\"}";
		}
		String clzj = String.valueOf(paramMap.get("ZJ"));	//车辆轴距
		String xhlc =String.valueOf(paramMap.get("XHLC")).equals("null")?"":String.valueOf(paramMap.get("XHLC"));	//续航里程
		String clgzje =String.valueOf(paramMap.get("CLGZJE"));//价格与计税
		if(rllx.equals("新能源")){
			if(!v.isXNYC(clzj)&&!v.isXHLC(xhlc)&&!v.isJGYJS1(clgzje)){
				return "{\"info\":\"车辆轴距和续航里程和价格（计税）都不符合条件，无法提交申请\"}";
			}
		}else{
			if((!v.isFXNYC(clzj)||!v.isJGYJS(clgzje))&&!v.isJGYJS1(clgzje)){
				return "{\"info\":\"车辆轴距与价格（计税）都不符合条件，无法申请\"}";
			}
		}
		String cllx = String.valueOf(paramMap.get("CLLX"));//车辆类型
		if(!v.isCLPP(cllx)){
			return "{\"info\":\"车辆类型不符合条件，无法申请\"}";
		}
		String fdjh = String.valueOf(paramMap.get("FDJH"));//发动机号
		if(!v.isCLPP(fdjh)){
			return "{\"info\":\"发动机号输入错误，无法申请\"}";
		}
		String ppxh = String.valueOf(paramMap.get("PPXH"));//车辆品牌型号
		logger.info(ppxh);
		if(!v.isCLPP(ppxh)){
			return "{\"info\":\"品牌型号不符合条件，无法申请\"}";
		}
		String[] szs = ppxh.split(";");
		String pp="",xh="";
		if(szs.length>1){
			pp = szs[0];
			xh = szs[1];
		}else{
			pp = szs[0];
		}
		String clys = String.valueOf(paramMap.get("CLYS"));//车辆颜色
		if(!v.isCLPP(clys)){
			return "{\"info\":\"发动机号输入错误，无法申请\"}";
		}
		String chec = String.valueOf(paramMap.get("CHEC"));//车长
		if(!v.isCLCKG(chec)){
			return "{\"info\":\"车辆长度不符合条件，无法申请\"}";
		}
		String chek = String.valueOf(paramMap.get("CHEK"));//车宽
		if(!v.isCLCKG(chek)){
			return "{\"info\":\"车辆宽度不符合条件，无法申请\"}";
		}
		String cheg = String.valueOf(paramMap.get("CHEG"));//车高
		if(!v.isCLCKG(cheg)){
			return "{\"info\":\"车辆高度不符合条件，无法申请\"}";
		}
		String zll = String.valueOf(paramMap.get("ZLL"));//总质量
		if(!v.isXHLC(zll)){
			return "{\"info\":\"总质量（重量）不符合条件，无法申请\"}";
		}
		String pjjl = String.valueOf(paramMap.get("PDJL"));//技术评定结论
		if(!v.isUSERName(pjjl)){
			return "{\"info\":\"技术评定结论不符合条件，无法申请\"}";
		}
		String pdjg = String.valueOf(paramMap.get("PDJG"));//评定机构
		if(!v.isCLPP(pdjg)){
			return "{\"info\":\" 评定机构不符合条件，无法申请\"}";
		}
		String pdyxqz = String.valueOf(paramMap.get("PDYXQZ"));//技术等级评定有效期止
		try {
			if(pdyxqz.length()>0){
			}else{
				return "{\"info\":\" 技术等级评定有效期止不符合条件，无法申请\"}";
			}
		} catch (Exception e) {
			logger.error("app_error,{}",e);
			return "{\"info\":\" 技术等级评定有效期止不符合条件，无法申请\"}";
		}
		Object djzdjrq = null;//车辆初次登记日期
		logger.info(paramMap.get("JDCZCRQ")+"");
		if(paramMap.get("JDCZCRQ")==""){
			djzdjrq = "";
		}else{
			djzdjrq = String.valueOf(paramMap.get("JDCZCRQ"));
			String[] rq = djzdjrq.toString().split("-");
			String b = rq[1];
			String c = rq[2];
			if(b.length()==1){
				b = "0"+b;
			}
			if(c.length()==1){
				c = "0"+c;
			}
			djzdjrq = rq[0]+"-"+b+"-"+c;
		}
		if(!"浙C#".equals(cphm)){
			if(!v.isRQZZ(djzdjrq.toString())){
				return "{\"info\":\"机动车注册日期不满足注册日起5年以内的条件，无法申请。\"}";
			}
		}
		String bxgs = String.valueOf(paramMap.get("DSZZRXBXQX"));//保险公司
		if(!v.isUSERName(bxgs)){
			return "{\"info\":\"保险公司填写错误，请重新填写\"}";
		}
		String mzbe = String.valueOf(paramMap.get("DSZZRXBXED"));//每座保额
		if(!v.isCLCKG(mzbe)){
			return "{\"info\":\"每座保额填写错误，请重新填写\"}";
		}
		String yxqq = String.valueOf(paramMap.get("BXED"));//保险有效期起
		if(!v.isRQ(yxqq)){
			return "{\"info\":\"保险有效期起填写错误，请重新填写\"}";
		}
		String yxqz = String.valueOf(paramMap.get("BXEZ"));//保险有效期止
		if(!v.isRQ(yxqz)){
			return "{\"info\":\"保险有效期止填写错误，请重新填写\"}";
		}
		String tbrq = String.valueOf(paramMap.get("TBRQ"));//投保日期
		if(!v.isRQ(tbrq)){
			return "{\"info\":\"投保日期填写错误，请重新填写\"}";
		}
		String yjdz = String.valueOf(paramMap.get("yjdz"));//是否邮寄
		String province = String.valueOf(paramMap.get("province"));//省
		String city = String.valueOf(paramMap.get("city"));//市
		String dist = String.valueOf(paramMap.get("dist"));//区
		String cyzgzjsdz = String.valueOf(paramMap.get("cyzgzjsdz"));//具体地址
		String SFYJ = "1",YJDZ = "";
		if(yjdz!=null&&yjdz.equals("on")){
			SFYJ = "0";
			YJDZ = province+city+dist+cyzgzjsdz;
		}
		String SQBH = (String)request.getSession().getAttribute("sqbh");
		String dbptid = String.valueOf(request.getSession().getAttribute("dlid"));//代办平台id
		String dbrid = String.valueOf(request.getSession().getAttribute("dbrid"));//代办人id
		String bdbrid = String.valueOf(request.getSession().getAttribute("bdbrid"));//被代办人id
		String jbrxm = String.valueOf(request.getSession().getAttribute("jbrxm"));//经办人姓名
		String sjhm = String.valueOf(request.getSession().getAttribute("sjhm"));
		String type = String.valueOf(paramMap.get("type"));
		String bdbr = "select u.user_name,o.id ids,o.* from tb_user u,tb_owner o where u.owner_id=o.id and u.user_name='"+sjhm+"' and u.is_yx='0'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(bdbr);
		String xb="",csrq="",sfzh="",zjlx="",dz="",sfzdz="";
		if(list!=null&&list.size()==1){
//			xm = String.valueOf(list.get(0).get("XM"));
			xb = String.valueOf(list.get(0).get("XB"));
			csrq = String.valueOf(list.get(0).get("CSRQ"));
			sfzh = String.valueOf(list.get(0).get("ZJHM"));
			zjlx = String.valueOf(list.get(0).get("ZJLX"));
			dz = String.valueOf(list.get(0).get("DZ")).replace("|", "");
			sfzdz = String.valueOf(list.get(0).get("SFZDZ")).replace("|", "");
			sjhm = String.valueOf(list.get(0).get("USER_NAME"));
			bdbrid = String.valueOf(list.get(0).get("ids"));
		}else{
			return "{\"info\":\"资料错误，请稍后重试！\"}";
		}
		logger.info("sqbh   "+SQBH);
		request.getSession().setAttribute("tym_clsqbh", SQBH);
		String sql = "";
		//发动机排量
		String FDJPL = jdbcTemplate.queryForObject("select fdjpl from (select fdjpl from JCDATA t where vin = '"+vin+"'  order by jypdrq desc) where rownum = 1", String.class);
		/**
		 * type=2 平台代办车辆
		 *     =1 个人自己申请车辆
		 *     =3 企业经办人办理自己企业车辆
		 */
		if(type.equals("2")){
			String sqlx = String.valueOf(paramMap.get("type1"));
			String lx = "1";
			if(sqlx.equals("1")){
				lx = "0";
			}
			sql = "update tb_clsqxx set xm='"+xm+"',VIN='"+vin+"',JYQY='"+jyqy+"',CPHM='"+cphm+"',HDZKW='"+hdzkw+"',RLLX='"+rllx+"',CLZJ='"+clzj+"',XHLC='"+xhlc+"',"
					+ "CLGZJE='"+clgzje+"',CLLX='"+cllx+"',FDJH='"+fdjh+"',PPXH='"+pp+"',CLXH='"+xh+"',CPYS='"+clys+"',CSCD='"+chec+"',CSKD='"+chek+"',CSGD='"+cheg+"',ZZL='"+zll+"',JSPDDJ='"+pjjl+"',"
					+ "PDJG='"+pdjg+"',JSDJYXQZ='"+pdyxqz+"',DJZDJRQ='"+djzdjrq+"',XB='"+xb+"',CSRQ='"+csrq+"',ZJHM='"+sfzh+"',ZJLX='"+zjlx+"',DZ='"+dz+"',SFZDZ='"+sfzdz+"',DBPTID='"+dbptid+"',"
					+ "DBRID='"+dbrid+"',owner_id='"+bdbrid+"',SJHM='"+sjhm+"',jbrxm='"+jbrxm+"',jbrsjhm='"+sjhm+"',sqlx='"+lx+"',BXGS='"+bxgs+"'"
					+ ",MZBE='"+mzbe+"',ZRXBXQQ='"+yxqq+"',ZRXBXQZ='"+yxqz+"',TBRQ='"+tbrq+"',SFYJ='"+SFYJ+"',YJDZ='"+YJDZ+"',CLFDJPL='"+FDJPL+"',BJ='2' where SQBH='"+SQBH+"'";
		}else if(type.equals("1")){
			sql = "update tb_clsqxx set xm='"+xm+"',VIN='"+vin+"',JYQY='"+jyqy+"',CPHM='"+cphm+"',HDZKW='"+hdzkw+"',RLLX='"+rllx+"',CLZJ='"+clzj+"',XHLC='"+xhlc+"',"
					+ "CLGZJE='"+clgzje+"',CLLX='"+cllx+"',FDJH='"+fdjh+"',PPXH='"+pp+"',CLXH='"+xh+"',CPYS='"+clys+"',CSCD='"+chec+"',CSKD='"+chek+"',CSGD='"+cheg+"',ZZL='"+zll+"',JSPDDJ='"+pjjl+"',"
					+ "PDJG='"+pdjg+"',JSDJYXQZ='"+pdyxqz+"',DJZDJRQ='"+djzdjrq+"',XB='"+xb+"',CSRQ='"+csrq+"',ZJHM='"+sfzh+"',ZJLX='"+zjlx+"',DZ='"+dz+"',SFZDZ='"+sfzdz+"',"
					+ "owner_id='"+dbptid+"',SJHM='"+sjhm+"',sqlx='0',BXGS='"+bxgs+"'"
					+ ",MZBE='"+mzbe+"',ZRXBXQQ='"+yxqq+"',ZRXBXQZ='"+yxqz+"',TBRQ='"+tbrq+"',SFYJ='"+SFYJ+"',YJDZ='"+YJDZ+"',CLFDJPL='"+FDJPL+"',BJ='2' where SQBH='"+SQBH+"'";
		}else if(type.equals("3")){
			sql = "update tb_clsqxx set xm='"+xm+"',VIN='"+vin+"',JYQY='"+jyqy+"',CPHM='"+cphm+"',HDZKW='"+hdzkw+"',RLLX='"+rllx+"',CLZJ='"+clzj+"',XHLC='"+xhlc+"',"
					+ "CLGZJE='"+clgzje+"',CLLX='"+cllx+"',FDJH='"+fdjh+"',PPXH='"+pp+"',CLXH='"+xh+"',CPYS='"+clys+"',CSCD='"+chec+"',CSKD='"+chek+"',CSGD='"+cheg+"',ZZL='"+zll+"',JSPDDJ='"+pjjl+"',"
					+ "PDJG='"+pdjg+"',JSDJYXQZ='"+pdyxqz+"',DJZDJRQ='"+djzdjrq+"',XB='"+xb+"',CSRQ='"+csrq+"',ZJHM='"+sfzh+"',ZJLX='"+zjlx+"',DZ='"+dz+"',SFZDZ='"+sfzdz+"',"
					+ "DBRID='"+dbrid+"',owner_id='"+dbptid+"',SJHM='"+sjhm+"',jbrxm='"+jbrxm+"',jbrsjhm='"+sjhm+"',sqlx='1',BXGS='"+bxgs+"'"
					+ ",MZBE='"+mzbe+"',ZRXBXQQ='"+yxqq+"',ZRXBXQZ='"+yxqz+"',TBRQ='"+tbrq+"',SFYJ='"+SFYJ+"',YJDZ='"+YJDZ+"',CLFDJPL='"+FDJPL+"',BJ='2' where SQBH='"+SQBH+"'";
		}else{
			return "{\"info\":\"资料错误，请稍后重试！\"}";
		}
//		int c = jdbcTemplate.update(sql,xm,vin,jyqy,cphm,hdzkw,rllx,clzj,xhlc,clgzje,cllx,fdjh,ppxh,clys,chec,chek,cheg,zll,pjjl,
//				pdjg,pdyxqz,djzdjrq,xb,csrq,sfzh,zjlx,dz,sfzdz,dbptid,dbrid,bdbrid,SQBH);
		int c = jdbcTemplate.update(sql);
		if(c!=0){
			jdbcTemplate.update("insert into TB_BGZS (sendtype,title,iid,lx,slevel,scontent) values('1','申报信息提示','15001','1','1','有新网约车申报记录,待审核')");
			return "{\"info\":\"提交成功\"}";
		}else{
			return "{\"info\":\"提交失败，请稍后重试\"}";
		}
	}
	/**
	 * 车辆补充资料
	 */
	public String bczl(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sqbh = String.valueOf(request.getSession().getAttribute("tym_clsqbh"));
		String xm = String.valueOf(paramMap.get("JDCSYR"));//姓名
		if(!v.isUSERName(xm)){
			return "{\"info\":\"姓名填写错误\"}";
		}
		String cphm = String.valueOf(paramMap.get("CPHM"));//车牌号码
		if(!v.isCPHM(cphm)){
			return "{\"info\":\"车牌号码格式填写错误\"}";
		}else if(cphm.equals("浙C#")){
			return "{\"info\":\"车牌号码格式填写错误\"}";
		}
		int cp = bczl_cl(sqbh,cphm);
		if(cp>0){
			return "{\"info\":\"该车牌已注册,请更换车牌注册\"}";
		}
		String jdczcrq = String.valueOf(paramMap.get("JDCZCRQ"));//机动车注册日期
		if(!v.isRQZZ(jdczcrq.toString())){
			return "{\"info\":\"机动车注册日期不符合条件，无法申请\"}";
		}
		String bxgs = String.valueOf(paramMap.get("DSZZRXBXQX"));//保险公司
		if(!v.isUSERName(bxgs)){
			return "{\"info\":\"保险公司填写错误，请重新填写\"}";
		}
		String mzbe = String.valueOf(paramMap.get("DSZZRXBXED"));//每座保额
		if(!v.isCLCKG(mzbe)){
			return "{\"info\":\"每座保额填写错误，请重新填写\"}";
		}
		String yxqq = String.valueOf(paramMap.get("BXED"));//保险有效期起
		if(!v.isRQ(yxqq)){
			return "{\"info\":\"保险有效期起填写错误，请重新填写\"}";
		}
		String yxqz = String.valueOf(paramMap.get("BXEZ"));//保险有效期止
		if(!v.isRQ(yxqz)){
			return "{\"info\":\"保险有效期止填写错误，请重新填写\"}";
		}
		String tbrq = String.valueOf(paramMap.get("TBRQ"));//投保日期
		if(!v.isRQ(tbrq)){
			return "{\"info\":\"投保日期填写错误，请重新填写\"}";
		}
		String yjdz = String.valueOf(paramMap.get("yjdz"));//是否邮寄
		String province = String.valueOf(paramMap.get("province"));//省
		String city = String.valueOf(paramMap.get("city"));//市
		String dist = String.valueOf(paramMap.get("dist"));//区
		String cyzgzjsdz = String.valueOf(paramMap.get("cyzgzjsdz"));//具体地址
		String SFYJ = "1",YJDZ = "";
		if(yjdz!=null&&yjdz.equals("on")){
			SFYJ = "0";
			YJDZ = province+city+dist+cyzgzjsdz;
		}
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_clsqxx where sqbh = '"+sqbh+"'");
		String yxm = "",ycphm="",yjdczcrq="",ybxgs="",ymzbe="",yyxqq="",yyxqz="",ytbrq="",ysfyj="",yyjdz="";
		if(list.size()>0){
			yxm = String.valueOf(list.get(0).get("XM"));
			ycphm = String.valueOf(list.get(0).get("CPHM"));
			yjdczcrq = String.valueOf(list.get(0).get("DJZDJRQ"));
			ybxgs = String.valueOf(list.get(0).get("BXGS"));
			ymzbe = String.valueOf(list.get(0).get("MZBE"));
			yyxqq = String.valueOf(list.get(0).get("ZRXBXQQ"));
			yyxqz = String.valueOf(list.get(0).get("ZRXBXQZ"));
			ytbrq = String.valueOf(list.get(0).get("TBRQ"));
			ysfyj = String.valueOf(list.get(0).get("SFYJ"));
			yyjdz = String.valueOf(list.get(0).get("YJDZ"));
		}
		String ynr = yxm+"|"+ycphm+"|"+yjdczcrq+"|"+ybxgs+"|"+ymzbe+"|"+yyxqq+"|"+yyxqz+"|"+ytbrq+"|"+ysfyj+"|"+yyjdz;
		String xnr = xm+"|"+cphm+"|"+jdczcrq+"|"+bxgs+"|"+mzbe+"|"+yxqq+"|"+yxqz+"|"+tbrq+"|"+SFYJ+"|"+YJDZ;
		String sql = "update tb_clsqxx set xm=?,cphm=?,DJZDJRQ=?,BXGS=?"
				+ ",MZBE=?,ZRXBXQQ=?,ZRXBXQZ=?,TBRQ=?,BCZL='0',BCZLRQ=sysdate,SFYJ=?,YJDZ=?,bj='2',ygjzsyj='2' where sqbh=? ";
		int c = jdbcTemplate.update(sql,xm,cphm,jdczcrq,bxgs,mzbe
				,yxqq,yxqz,tbrq,SFYJ,YJDZ,sqbh);
		if(c!=0){
			String dlid = String.valueOf(request.getSession().getAttribute("dbrid"));
			jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'1',?,?)",ynr,xnr,dlid,sqbh);
			return "{\"info\":\"提交成功\"}";
		}else{
			return "{\"info\":\"提交失败\"}";
		}
	}
	/**
	 * 判断补充资料车牌号码是否存在
	 */
	public int bczl_cl(String sqbh,String cphm){
		String sql = "select count(*) from tb_clsqxx where cphm = '"+cphm+"' and sqbh != '"+sqbh+"' and is_yx ='0'";
		int c = jdbcTemplate.queryForObject(sql, Integer.class);
		return c;
	}
	/**
	 * 个人登录车辆申请记录
	 * @param request
	 * @return
	 */
	public String clsqjl(HttpServletRequest request) {
		DBService d = new DBService();
		String id = String.valueOf(request.getSession().getAttribute("dlid"));
		String sql = "select * from tb_clsqxx where owner_id = '"+id+"' and sqrq in"
				+ " (select max(sqrq) from tb_clsqxx where owner_id = '"+id+"' group by vin)";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("DQZT", d.clzt(list.get(i)));
		}
		return jacksonUtil.toJson(list);
	}
	/**
	 * 企业登录查看车辆申请记录
	 */
	public String clqysqjl(HttpServletRequest request,String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData, new TypeReference<Map<String, Object>>() {});
		int page = Integer.parseInt(paramMap.get("page")+"");
		int pageSize = Integer.parseInt(paramMap.get("pageSize")+"");
		String cphm = String.valueOf(paramMap.get("cphm")).replaceAll(".*([';]+|(--)+).*", " ");
		String blzt = String.valueOf(paramMap.get("blzt")).replaceAll(".*([';]+|(--)+).*", " ");
		DBService d = new DBService();
		String tj = "";
		if(blzt!=null&&!blzt.isEmpty()&&!blzt.equals("0")){
			if(blzt.equals("1")){
				tj += " and  ygjzsyj = '2' ";
			}else if(blzt.equals("2")){
				tj += " and ygjzsyj = '0' ";
			}else if(blzt.equals("3")){
				tj += " and ygjzsyj = '1' ";
			}
		}
		if(cphm!=null&&!cphm.isEmpty()){
			tj += "and cphm like '" +cphm+"'";
		}
		String id = String.valueOf(request.getSession().getAttribute("dlid"));
		String sql = "select (select count(*) from (select * from tb_clsqxx where"
				+ " owner_id = '"+id+"' and sqrq in (select max(sqrq) from tb_clsqxx where owner_id = '"+id+"' group by vin)";
		sql+=tj;
		sql +=")) as count, tt.* from (select t.*, rownum as rn from (select * from tb_clsqxx where"
				+ " owner_id = '"+id+"' and sqrq in (select max(sqrq) from tb_clsqxx where owner_id = '"+id+"' group by vin)";
		sql+=tj;
		sql +=") t where rownum <= "+(page*pageSize)+") tt where tt.rn > "+((page-1)*pageSize);
		System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("DQZT", d.clzt(list.get(i)));
		}
		return jacksonUtil.toJson(list);
	}
}

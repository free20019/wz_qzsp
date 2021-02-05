
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;
import helper.Verify;

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
 * 用户登录service
 * @author Administrator
 *
 */

@Service
public class JsyService extends MvcService{
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

	public String findbdbxx(HttpServletRequest request) {
		String sjhm = String.valueOf(request.getSession().getAttribute("sjhm"));
		String sql = "select * from tb_user u,tb_owner o where u.owner_id =o.id and u.is_yx='0' and user_name = '"+sjhm+"'";
		System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	public int yzjszdabh(String jszh,String dzbh,String sqlx){
		int c = 0;
		int jsz = jdbcTemplate.queryForObject("select count(*) from tb_jsysqxx where is_yx='0' and sqlx = '"+sqlx+"' and JSZH='"+jszh+"'", Integer.class);
		int dabh = jdbcTemplate.queryForObject("select count(*) from tb_jsysqxx where is_yx='0' and sqlx = '"+sqlx+"' and JSZDABH='"+dzbh+"'", Integer.class);
		if(jsz!=0){
			c = 1;
		}
		if(dabh!=0){
			c = 2;
		}
		return c;
	}
	public String jsyxxtj(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sjhm = String.valueOf(request.getSession().getAttribute("sjhm"));//手机号码
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_user u,tb_owner o where u.owner_id=o.id and user_name = '"+sjhm+"' and is_yx='0'");
		String sqbh = String.valueOf(request.getSession().getAttribute("sqbh"));
		String dbptid = String.valueOf(request.getSession().getAttribute("dlid"));//代办平台id
		String dbrid = String.valueOf(request.getSession().getAttribute("dbrid"));//代办人id
		String bdbrid = String.valueOf(request.getSession().getAttribute("bdbrid"));//被代办人id
		String type = String.valueOf(paramMap.get("type"));
		request.getSession().setAttribute("tym_sqbh", sqbh);
		String xm="",xb="",csrq="",sfzh="",zjlx="",dz="",sfzdz="";
		int sqcs = 0, zcs = 0;
		if(list!=null&&list.size()==1){
			xm = String.valueOf(list.get(0).get("XM"));
			xb = String.valueOf(list.get(0).get("XB"));
			csrq = String.valueOf(list.get(0).get("CSRQ")).substring(0, 10);
			sfzh = String.valueOf(list.get(0).get("ZJHM"));
			zjlx = String.valueOf(list.get(0).get("ZJLX"));
			dz = String.valueOf(list.get(0).get("DZ")).replace("|", "");
			sfzdz = String.valueOf(list.get(0).get("SFZDZ")).replace("|", "");
			sqcs = Integer.parseInt(String.valueOf(list.get(0).get("sqcs")));
			zcs = Integer.parseInt(String.valueOf(list.get(0).get("zcs")));
			if(sqcs >= zcs){
				return "{\"info\":\"你已重复提交超过"+zcs+"次无效申请，无法再次提交，详询温州市道路运输管理局审批处。\"}";
			}
		}else{
			return "{\"info\":\"提交失败！\"}";
		}
		String hkjg = String.valueOf(paramMap.get("jiguan"));//户口籍贯
		if(!v.isUSERName(hkjg)){
			return "{\"info\":\"户口籍贯错误\"}";
		}
		String jszh = String.valueOf(paramMap.get("JSZH"));//驾驶证号
		if(!v.isIDCard(jszh)){
			return "{\"info\":\"驾驶证号填写错误\"}";
		}
		String dabh = String.valueOf(paramMap.get("JSZDABH"));//驾驶证档案编号
		if(!v.isDabh(dabh)){
			return "{\"info\":\"机动车驾驶证档案编号填写错误\"}";
		}
		String sqlx = String.valueOf(paramMap.get("SQLX"));//申请类型
		int count = yzjszdabh(jszh, dabh, sqlx);
		if(count==1){
			return "{\"info\":\"驾驶证号已存在，请更换驾驶证号\"}";
		}
		if(count==2){
			return "{\"info\":\"机动车驾驶证档案编号已存在，请更换机动车驾驶证档案编号\"}";
		}
		String lzrq = String.valueOf(paramMap.get("CCLZRQ"));//驾驶证领证日期
		String zjcx = String.valueOf(paramMap.get("ZJCX"));//准驾车型
		if(!v.isCLPP(zjcx)){
			return "{\"info\":\"准驾车型填写错误\"}";
		}
		int c = 0;
		//type=1 个人申请   否则平台代办
		
		if(type.equals("1")){
			String sql = "update tb_jsysqxx set XM=?,ZJHM=?,HKJG=?,JSZH=?,CLJSZRQ='"+lzrq+"'"
					+ ",JSZDABH=?,ZJCX=?,XB=?,CSRQ='"+csrq+"',owner_id=?,sjhm=?,zjlx=?,dz=?,sfzdz=?,sqlx=? where sqbh =?";
//		System.out.println(sql+" "+xm+" "+sfzh+" "+hkjg+" "+jszh+" "+dabh+" "+zjcx+" "+xb+" "+dbptid+" "+dbrid+" "+bdbrid+" "+sjhm+" "+zjlx+" "+dz+" "+sfzdz+" "+sqbh);
			c = jdbcTemplate.update(sql,xm,sfzh,hkjg,jszh,dabh,zjcx,xb,dbptid,sjhm,zjlx,dz,sfzdz,sqlx,sqbh);
		}else{
			String sql = "update tb_jsysqxx set XM=?,ZJHM=?,HKJG=?,JSZH=?,CLJSZRQ='"+lzrq+"'"
					+ ",JSZDABH=?,ZJCX=?,XB=?,CSRQ='"+csrq+"',DBPTID=?,DBRID=?,owner_id=?,sjhm=?,zjlx=?,dz=?,sfzdz=?,sqlx=? where sqbh =?";
//		System.out.println(sql+" "+am+" "+sfzh+" "+hkjg+" "+jszh+" "+dabh+" "+zjcx+" "+xb+" "+dbptid+" "+dbrid+" "+bdbrid+" "+sjhm+" "+zjlx+" "+dz+" "+sfzdz+" "+sqbh);
			c = jdbcTemplate.update(sql,xm,sfzh,hkjg,jszh,dabh,zjcx,xb,dbptid,dbrid,bdbrid,sjhm,zjlx,dz,sfzdz,sqlx,sqbh);
		}
		if(c>0){
			jdbcTemplate.update(" update tb_user set sqcs = sqcs+1 where user_name = ?", sjhm);
			jdbcTemplate.update("insert into TB_BGZS (sendtype,title,iid,lx,slevel,scontent,bj) values('1','申报信息提示','15001','1','1','有新网约车申报记录,待审核','1')");
			return "{\"info\":\"提交成功\"}";
		}else{
			return "{\"info\":\"提交失败\"}";
		}
	}
	public String grtj_dxyz(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String phone = String.valueOf(paramMap.get("phone"));
		if(!v.isLXFS(phone)){
			return "{\"info\":\"手机号码错误\"}";
		}
		String sjhm = String.valueOf(request.getSession().getAttribute("user"));
		if(!phone.equals(sjhm)){
			return "{\"info\":\"手机号码错误\"}";
		}
		String yzm = String.valueOf(paramMap.get("yzm"));
		if(!v.isYZM(yzm)){
			return "{\"info\":\"验证码填写错误\"}";
		}
		Object session_yzm = request.getSession().getAttribute("yzm"); 
		if(null!=session_yzm&&!session_yzm.toString().isEmpty()){
		}else{
			return "{\"info\":\"验证码还未发送\"}";
		}
		String sess_yzm = (String)request.getSession().getAttribute("yzm").toString();
		String yzmfssj = (String)request.getSession().getAttribute("yzmFssj").toString();
		int yzmcs = (Integer)request.getSession().getAttribute("yzmcs");
		if(yzmcs>=3){
			return "{\"info\":\"验证码错误超过3次，请重新获取验证码\"}";
		}
		int yzm_info=captcha_correct(sess_yzm,yzmfssj,yzm);
		if(yzm_info==1){
			request.getSession().setAttribute("yzmcs", yzmcs+1);
			return "{\"info\":\"验证码错误\"}";
		}else if(yzm_info==2){
			request.getSession().setAttribute("yzmcs", yzmcs+1);
			return "{\"info\":\"验证码已过期,请重新获取验证码\"}";
		}
		return "{\"info\":\"验证成功\"}";
	}

	public String jsysqjl(HttpServletRequest request) {
		DBService d = new DBService();
		String sjhm = String.valueOf(request.getSession().getAttribute("user"));
		String sql = "select a.* from (select t.* from TB_JSYSQXX t, tb_user u, tb_owner o"
				+ " where t.owner_id = o.id and u.owner_id = o.id and u.user_name = '"+sjhm+"'"
				+ " order by sqrq desc) a,(select max(sqrq) as sqrq,sqlx from (select t.* from TB_JSYSQXX t,"
				+ " tb_user u, tb_owner o where t.owner_id = o.id and u.owner_id = o.id and u.user_name = '"+sjhm+"'"
				+ " order by sqrq desc) group by sqlx) c where a.sqlx=c.sqlx and a.sqrq=c.sqrq";
		System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("DQZT", d.jsydqzt(list.get(i)));
		}
		return jacksonUtil.toJson(list);
	}
	public int countCphm(String cphm){
		int a = 0;
		String sql = "select * from TB_JBSQ where cphm = ? and is_yx = '0'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, cphm);
		return list.size();
	}
	public String gzjbsq(HttpServletRequest request, String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String CPHM = String.valueOf(paramMap.get("CPHM"));
		String DJRQ = String.valueOf(paramMap.get("DJRQ"));
		String JSZFZJG = String.valueOf(paramMap.get("jszfzjg"));
		String XM = String.valueOf(paramMap.get("XM"));
		String SJHM = String.valueOf(paramMap.get("SJHM"));
		String GZLX = String.valueOf(paramMap.get("GZLX"));
		String GZSJ = String.valueOf(paramMap.get("GZSJ"));
		String SQLX = String.valueOf(paramMap.get("SQLX"));
		String SQBH = String.valueOf(request.getSession().getAttribute("JBSQSQBH"));
		String dlid = String.valueOf(request.getSession().getAttribute("dlid"));
		if(!v.isCPHM(CPHM)){
			return "{\"info\":\"车牌号码错误\"}";
		}
		int a = countCphm(CPHM);
		if(a>0){
			return "{\"info\":\"该车已存在，请更换车牌号码！\"}";
		}
		if(!v.isRQ(DJRQ)){
			return "{\"info\":\"车辆初次登记日期错误\"}";
		}
		if(!JSZFZJG.equals("0")&&!JSZFZJG.equals("1")){
			return "{\"info\":\"车辆所有人类型错误\"}";
		}
		if(!v.isUSERName(XM)){
			return "{\"info\":\"车辆所有人名称错误\"}";
		}
		if(!v.isLXFS(SJHM)){
			return "{\"info\":\"车辆所有人联系电话错误\"}";
		}
		if(!GZLX.equals("天然气")&&!GZLX.equals("液化气")){
			return "{\"info\":\"改装类型错误\"}";
		}
		if(!v.isRQ(GZSJ)){
			return "{\"info\":\"改装时间错误\"}";
		}
		if(!SQLX.equals("0")&&!SQLX.equals("1")){
			return "{\"info\":\"申请类型错误\"}";
		}
		String sql = "update TB_JBSQ set CPHM=?,JCLCCDJRQ=to_date(?,'yyyy-mm-dd'),CLSYRLX=?,XM=?,"
				+ "LXDH=?,GZLX=?,GZSJ=to_date(?,'yyyy-mm-dd'),owner_id=?,CLJBSQLX=? where sqbh = ?";
		int c = jdbcTemplate.update(sql,CPHM,DJRQ,JSZFZJG,XM,SJHM,GZLX,GZSJ,dlid,SQLX,SQBH);
		if(c>0){
			return "{\"info\":\"提交成功\"}";
		}else{
			return "{\"info\":\"提交失败\"}";
		}
	}
	/*查询奖补申请*/
	public String getJbsq(String cphm,String sqlx,String blzt,int page,int pageSize,HttpServletRequest request
			,String stime,String etime,String spsjstime,String spsjetime){
		String dlid = String.valueOf(request.getSession().getAttribute("dlid"));
		String tj = "";
		if(!String.valueOf(cphm).equals("null")){
			tj += " and j.cphm like '%"+cphm+"%'";
		}
		if(!String.valueOf(sqlx).equals("null")&&!String.valueOf(sqlx).equals("全部")){
			tj += " and j.CLJBSQLX = '"+sqlx+"'";
		}
		if(!String.valueOf(blzt).equals("null")&&!String.valueOf(blzt).equals("0")){
			if(blzt.equals("1")){
				tj += " and j.SHZT = '2'";
			}else if(blzt.equals("2")){
				tj += " and j.SHZT = '0'";
			}else if(blzt.equals("3")){
				tj += " and j.SHZT = '1'";
			}
		}
		if(!String.valueOf(spsjstime).equals("null") && spsjstime.length()>3){
			tj += " and j.SHSJ >= to_date('"+spsjstime+" 00:00:00','yyyy-mm-dd hh24:mi:ss')";
		}
		if(!String.valueOf(spsjetime).equals("null") && spsjetime.length()>3){
			tj += " and j.SHSJ < to_date('"+spsjetime+" 23:59:59','yyyy-mm-dd hh24:mi:ss')";
		}
		String sql = "select * from (select ( select count(1) from tb_jbsq j left join (select cphm,max(sqsj) sqsj"
				+ " from tb_jbsq group by cphm) cc on j.cphm = cc.cphm where j.sqsj = cc.sqsj"
				+ " and j.sqsj >= to_date('"+stime+" 00:00:00','yyyy-mm-dd hh24:mi:ss')"
				+ " and j.sqsj < to_date('"+etime+" 23:59:59','yyyy-mm-dd hh24:mi:ss')"
				+ " and owner_id = '"+dlid+"'";
		sql += tj;
		sql += ") c, j.*, rownum rn from ( select j.* from tb_jbsq j left join (select cphm,max(sqsj) sqsj"
				+ " from tb_jbsq group by cphm) cc on j.cphm = cc.cphm where j.sqsj = cc.sqsj"
				+ " and j.sqsj >= to_date('"+stime+" 00:00:00','yyyy-mm-dd hh24:mi:ss')"
				+ " and j.sqsj < to_date('"+etime+" 23:59:59','yyyy-mm-dd hh24:mi:ss')"
				+ " and owner_id = '"+dlid+"'";
		sql += tj;
		sql += " and rownum <= "+(page*pageSize)+" order by j.sqsj desc) j) where rn > "+((page-1)*pageSize);
		System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("TIME", String.valueOf(list.get(i).get("SQSJ")).equals("null")?"":String.valueOf(list.get(i).get("SQSJ")).substring(0, 10));
			list.get(i).put("SHSJ", String.valueOf(list.get(i).get("SHSJ")).equals("null")?"":String.valueOf(list.get(i).get("SHSJ")).substring(0, 10));
			list.get(i).put("LX", String.valueOf(list.get(i).get("CLJBSQLX")).equals("0")?"更新奖补":"改装奖补");
			list.get(i).put("ZT", String.valueOf(list.get(i).get("SHZT")).equals("0")?"审核通过":String.valueOf(list.get(i).get("SHZT")).equals("1")?"审核不通过":"审核中");
		}
		return jacksonUtil.toJson(list);
	}
	public String shnr(Map<String, Object> map){
		String p = "";
		if(String.valueOf(map.get("IS_SFZZZ")).equals("1")){
			p += "<p>身份证或企业营业执照是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_XSZ")).equals("1")){
			p += "<p>行驶证是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_YYZJC")).equals("1")){
			p += "<p>营运证原车是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_YYZXC")).equals("1")){
			p += "<p>营运证新车是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_TZSB")).equals("1")){
			p += "<p>特种设备使用登记证明文件是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_GCFP")).equals("1")){
			p += "<p>车辆购置发票原车是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_GZSFP")).equals("1")){
			p += "<p>车辆购置税缴税发票原车是否匹配(该项不符合)</p>";
		}
		if(String.valueOf(map.get("IS_DJZS")).equals("1")){
			p += "<p>机动车登记证书新车是否匹配(该项不符合)</p>";
		}
		return p;
	}
	public String gxjbsq(HttpServletRequest request, String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String CPHM = String.valueOf(paramMap.get("CPHM"));//车牌
		String CLLX = String.valueOf(paramMap.get("CLLX"));//车辆类型
		String JSZFZJG = String.valueOf(paramMap.get("jszfzjg"));//车辆所有人类型
		String XM = String.valueOf(paramMap.get("XM"));//名称
		String GZSJE = String.valueOf(paramMap.get("GZSJE"));//购税缴税金额（原车）
		String LXDH = String.valueOf(paramMap.get("LXDH"));//联系电话
		String JGCFPJE = String.valueOf(paramMap.get("JGCFPJE"));//购车发票金额（原车）
		String SQLX = String.valueOf(paramMap.get("SQLX"));//申请类型
		String XCLCCDJSJ = String.valueOf(paramMap.get("XCLCCDJSJ"));//初次登记日期（新车）
		String JCLCCDJRQ = String.valueOf(paramMap.get("JCLCCDJRQ"));//初次登记日期（原车）
		String SQBH = String.valueOf(request.getSession().getAttribute("JBSQSQBH"));
		String dlid = String.valueOf(request.getSession().getAttribute("dlid"));
		if(!v.isCPHM(CPHM)){
			return "{\"info\":\"车牌号码错误\"}";
		}
		int a = countCphm(CPHM);
		if(a>0){
			return "{\"info\":\"该车已存在，请更换车牌号码！\"}";
		}
		if(!CLLX.equals("新能源车")&&!CLLX.equals("双燃料车")){
			return "{\"info\":\"车辆类型错误\"}";
		}
		if(!JSZFZJG.equals("0")&&!JSZFZJG.equals("1")){
			return "{\"info\":\"车辆所有人类型错误\"}";
		}
		if(!v.isUSERName(XM)){
			return "{\"info\":\"车辆所有人名称错误\"}";
		}
		if(!v.isBXED(GZSJE)){
			return "{\"info\":\"购税缴税金额（原车）错误\"}";
		}
		if(!v.isBXED(JGCFPJE)){
			return "{\"info\":\"购车发票金额（原车）错误\"}";
		}
		if(!v.isLXFS(LXDH)){
			return "{\"info\":\"联系电话错误\"}";
		}
		if(!SQLX.equals("0")&&!SQLX.equals("1")){
			return "{\"info\":\"申请类型错误\"}";
		}
		if(!v.isRQ(XCLCCDJSJ)){
			return "{\"info\":\"初次登记日期（新车）错误\"}";
		}
		if(!v.isRQ(JCLCCDJRQ)){
			return "{\"info\":\"初次登记日期（原车）错误\"}";
		}
		String sql = "update TB_JBSQ set CPHM=?,CLLX=?,CLSYRLX=?,XM=?,GZSJE=?,LXDH=?,JGCFPJE=?,"
				+ "XCLCCDJSJ=to_date(?,'yyyy-mm-dd'),JCLCCDJRQ=to_date(?,'yyyy-mm-dd'),owner_id=?,CLJBSQLX=? where sqbh = ?";
		int c = jdbcTemplate.update(sql,CPHM,CLLX,JSZFZJG,XM,GZSJE,LXDH,JGCFPJE,XCLCCDJSJ,JCLCCDJRQ,dlid,SQLX,SQBH);
		if(c>0){
			return "{\"info\":\"提交成功\"}";
		}else{
			return "{\"info\":\"提交失败\"}";
		}
	}

	public String getOneJbsq(String bh, HttpServletRequest request) {
		String dlid = String.valueOf(request.getSession().getAttribute("dlid"));
		String sql = "select * from TB_JBSQ where sqbh = ? and owner_id = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, bh, dlid);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("TIME", String.valueOf(list.get(i).get("SQSJ")).equals("null")?"":String.valueOf(list.get(i).get("SQSJ")).substring(0, 10));
			list.get(i).put("LX", String.valueOf(list.get(i).get("CLJBSQLX")).equals("0")?"更新奖补":"改装奖补");
			list.get(i).put("ZT", String.valueOf(list.get(i).get("SHZT")).equals("0")?"审核通过":String.valueOf(list.get(i).get("SHZT")).equals("1")?"审核不通过":"审核中");
			list.get(i).put("NR", shnr(list.get(i)));
		}
		return jacksonUtil.toJson(list);
	}
}

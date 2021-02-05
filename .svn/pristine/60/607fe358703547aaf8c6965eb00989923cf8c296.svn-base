
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;

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
 * 二维码
 * @author Administrator
 *
 */

@Service
public class QrcodeService extends MvcService{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	protected JdbcTemplate jdbcTemplate = null;
	protected JdbcTemplate jdbcTemplate2 = null;

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
	 * 用户登陆
	 * @return
	 */
	public String login(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String code = String.valueOf(paramMap.get("code"));
		Object sessionCodeObject = request.getSession().getAttribute("validateCode");
		String sessionCode = "";
		if(code.length()==0){
			return "{\"info\":\"验证码不能为空\"}";
		}
		if(!code.isEmpty() && null != sessionCodeObject ){
			sessionCode = (String) sessionCodeObject;
			logger.info(code);
			if(!sessionCode.equals(code.toUpperCase())){
				return "{\"info\":\"验证码错误\"}";
			}
		}
		String sql=" select id,sjhm,zjhm,xm from tb_owner where type = '0' and sjhm = ? and mm = ?";
		logger.info(sql+"  "+paramMap.get("n")+"  "+paramMap.get("p"));
		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql,paramMap.get("n"),paramMap.get("p"));
		if(list.size() > 0){
//			String n = paramMap.get("n").toString();
//			String hym = sfxg(n);
			request.getSession().setAttribute("user", String.valueOf(paramMap.get("n")));
			request.getSession().setAttribute("id", list.get(0).get("id")+"");
			request.getSession().setAttribute("yhxm", list.get(0).get("xm"));
				return "{\"info\":\"登陆成功\"}";
		}else{
			return "{\"info\":\"用户名或密码错误\"}";
		}
	}
	/**
	 * 用户登陆后根据用户名查询该用户信息
	 * clsq = 0 当前有申请车辆  =1没有
	 * rysq=0 当前有申请人员 =1没有
	 * @param vehi_no
	 * @return
	 */
	public String findyyxx(String user,String cphm,String id){
		Map<String, Object> map = new HashMap<String, Object>();
		if(user!=null&&user.length()!=0){
			String sql = "select * from tb_owner where id = '"+id+"'";
			logger.info("1   "+sql);
			List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
			map.put("type", "0");
			map.put("data", list);
			String clsq = "select count(*) from tb_clsqxx where owner_id = '"+id+"'";
			int clsq_s = jdbcTemplate.queryForObject(clsq, Integer.class);
			if(clsq_s>0){
				map.put("clsq", "0");
				String clxx = "select * from tb_clsqxx where owner_id = '"+id+"' and cphm like '%"+cphm+"%'  order by sqrq desc limit 0,10 ";
				logger.info(clxx);
				List<Map<String, Object>> cl = jdbcTemplate.queryForList(clxx);
				List<Map<String, Object>> zzjg = clzt(cl);
				map.put("clxx", zzjg);
			}else{
				map.put("clsq", "1");
			}
			String rysq = "select count(*) from tb_jsysqxx where owner_id = '"+id+"'";
			int rysq_s = jdbcTemplate.queryForObject(rysq, Integer.class);
			if(rysq_s>0){
				map.put("rysq", "0");
			}else{
				map.put("rysq", "1");
			}
		}else{
			map.put("type", "1");
			map.put("info", "你未登录");
		}
		return jacksonUtil.toJson(map);
	}
	
	public List<Map<String, Object>> clzt(List<Map<String, Object>> list){
		for(int i=0;i<list.size();i++){
			String type = "未处理";
			if((String)list.get(i).get("YGJCSYJ")!=null&&((String)list.get(i).get("YGJCSYJ")).length()>0){
				if(((String)list.get(i).get("YGJCSYJ")).equals("0")){
					type="审核通过";
				}else if(((String)list.get(i).get("YGJCSYJ")).equals("1")){
					type="审核不通过";
				}
			}
			//车管所初审  成功跳到补充资料界面
			//不通过,跳到未通过界面
			if((String)list.get(i).get("CGSCSYJ")!=null&&((String)list.get(i).get("CGSCSYJ")).length()>0){
				if(!((String)list.get(i).get("CGSCSYJ")).equals("1")){
					//审核通过
					//两个户籍类型户籍类型  前台判断长度大于2  取最后一个字符
					type="补充资料";
				}else{
					//审核不通过
					//三个户籍类型户籍类型  前台判断长度大于3  取最后一个字符
					type="审核未通过";
				}
			}
			//用户补充资料是否成功,成功跳到等待发证界面
			if((String)list.get(i).get("BCZL")!=null&&((String)list.get(i).get("BCZL")).length()>0){
				if(((String)list.get(i).get("BCZL")).equals("0")){
					type="等待发证";
				}
			}
			if(list.get(0).get("YGJZSYJ")!=null&&list.get(0).get("YGJZSYJ").toString().length()>0){
				if(list.get(0).get("YGJZSYJ").toString().equals("0")){
					type="终审通过";
				}else{
					type="终审未通过";
				}
			}
			//车管所审核通过之后,到发证时间,跳到
//			if((list.get(i).get("CGS_XXSZFZRQ")!=null)){
//				Date yszyxqq = (Date)list.get(i).get("CGS_XXSZFZRQ");
//				Date d = new Date();
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				if(d.getTime()>yszyxqq.getTime()){
//					type="发证成功";
//				}
//			}
			list.get(i).put("dq_zt", type);
		}
		return list;
	}

	public Map listPlatform(String id) {
		try {
			String sql = "SELECT JYZMC,GSZCH,JYFW FROM TB_JYZJCXX T1  WHERE "
					+ "   SUBSTRING_INDEX(qrcode, '/' ,'-1') = ?";
			return jdbcTemplate.queryForMap(sql,id);
		} catch (Exception e) {
			logger.error("ERROR listPlatform", e);
			 return null;
		}
	}

	public Map listDriver(String id) {
		try {
			String sql = "SELECT T3.XM,T3.XB,T3.GJ,T3.CSRQ,T1.JSZH,T1.ZJCX,T3.DZ,T1.CLJSZRQ,T1.JSZYXQQ,T1.JSZYXQZ FROM TB_JSYJCXX T1, TB_JSYSQXX T2 , TB_OWNER T3 "
					+ " WHERE T1.OWNER_ID = T2.OWNER_ID "
					+ " AND t1.`OWNER_ID` = t3.`id` AND t2.`OWNER_ID` =  t3.`id` "
					+ " AND SUBSTRING_INDEX(t2.qrcode, '/' ,'-1') = ? and T1.is_yx='0'";
			return jdbcTemplate.queryForMap(sql,id) ;
		} catch (Exception e) {
			logger.error("ERROR listDriver", e);
			 return null;
		}
	}

	public Map listVechicle(String id) {
		try {
			String sql = "SELECT T1.CPHM,T1.CPYS,T1.SSCZ FROM TB_CLJCXX T1, TB_CLSQXX T2 WHERE T1.OWNER_ID = T2.OWNER_ID AND T1.CPHM = T2.CPHM"
					+ " AND SUBSTRING_INDEX(qrcode, '/' ,'-1')= ? and t1.is_yx='0'";
			return  jdbcTemplate.queryForMap(sql,id);
		} catch (Exception e) {
			logger.error("ERROR listDriver", e);
			 return null;
		}
		
		
	}

}

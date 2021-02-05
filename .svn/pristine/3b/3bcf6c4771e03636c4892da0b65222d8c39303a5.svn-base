
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;
import helper.Verify;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户注册service
 * @author Administrator
 *
 */

@Service
public class RegisterService extends MvcService{
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
	 * 个人用户注册
	 * @param postData
	 * @param request
	 * @return
	 */
	public String gryhzc(String postData, HttpServletRequest request) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		//当info=0
		String yzm = String.valueOf(paramMap.get("YZM"));
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
		String sjhm = String.valueOf(paramMap.get("SJHM"));
		logger.info(sjhm);
		if(!v.isLXFS(sjhm)){
			return "{\"info\":\"手机填写错误\"}";
		}
		int sj = phone_only(sjhm);
		if(sj==1){
			return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
		}
		String zjlx =String.valueOf(paramMap.get("ZJLX"));	//证件类型
		if(!v.REGEX_SQLX(zjlx)){
			return "{\"info\":\"证件类型填写错误\"}";
		}
		String zjhm =String.valueOf(paramMap.get("ZJHM"));	//证件号码
		if(zjlx.equals("居民身份证")){
			if(!v.isIDCard(zjhm)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
		}else{
			if(!v.isCLPP(zjhm)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
		}
		if(zjlx.equals("居民身份证")){
			int zjhcf = sfzh_only(zjhm);
			if(zjhcf>0){
				return "{\"info\":\"证件号码重复,请更换证件号\"}";
			}
		}
		
		//判断验证码是否正确
		if(null == request.getSession().getAttribute("yzm") ){
			return "{\"info\":\"验证码错误\"}";
		}
		
		String xm =String.valueOf(paramMap.get("XM"));		//姓名
		if(!v.isUSERName(xm)){
			return "{\"info\":\"姓名填写错误\"}";
		}
		String xb =String.valueOf(paramMap.get("XB"));	//性别
		if(!v.isXB(xb)){
			return "{\"info\":\"性别填写错误\"}";
		}
//		String gj =String.valueOf(paramMap.get("GJ"));	//国籍
//		if(!v.isGJ(gj)){
//			return "{\"info\":\"国籍填写错误\"}";
//		}
		String csrq = String.valueOf(paramMap.get("CSRQ"));
		logger.info(csrq);
		if(zjlx.equals("居民身份证")){
			if(v.isCSRQ(csrq)){
				String zjhm_s = zjhm.substring(6, 14);
				zjhm_s = zjhm_s.substring(0, 4) + "-" + zjhm_s.substring(4, 6) + "-" + zjhm_s.substring(6);
				if(!zjhm_s.equals(zjhm_s)){
					return "{\"info\":\"出生日期与证件号码不一致\"}";
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					long csrq_d = sdf.parse(csrq).getTime();
					long dqrq = new Date().getTime();
					if(csrq_d>dqrq){
						return "{\"info\":\"出生日期填写错误\"}";
					}
				} catch (ParseException e) {
					logger.error("app_error",e);
					return "{\"info\":\"出生日期填写错误\"}";
				}
			}else{
				return "{\"info\":\"出生日期填写错误\"}";
			}
		}
		String mm = String.valueOf(paramMap.get("MM"));
		if(!v.isMM(mm)){
			return "{\"info\":\"密码填写错误\"}";
		}
		String remm = String.valueOf(paramMap.get("reMM"));
		if(!v.isMM(remm)){
			return "{\"info\":\"确认密码填写错误\"}";
		}
		if(!mm.equals(remm)){
			return "{\"info\":\"两次密码不一致,请重新输入\"}";
		}
		String sheng = String.valueOf(paramMap.get("SHENG"));//省
		String shi = String.valueOf(paramMap.get("SHI"));//市
		String qu = String.valueOf(paramMap.get("QU"));//区
		String lxdz =String.valueOf(paramMap.get("LXDZ"));	//联系地址
		String dz = sheng+"|"+shi+"|"+qu+"|"+lxdz;
		if(!v.isLXDZ(dz)){
			return "{\"info\":\"联系地址填写错误\"}";
		}
		String sfzsheng = String.valueOf(paramMap.get("SFZSHENG"));//省
		String sfzshi = String.valueOf(paramMap.get("SFZSHI"));//市
		String sfzqu = String.valueOf(paramMap.get("SFZQU"));//区
		String sfzlxdz =String.valueOf(paramMap.get("SFZDZ"));	//联系地址
		String sfzdz = sfzsheng+"|"+sfzshi+"|"+sfzqu+"|"+sfzlxdz;
		if(!v.isLXDZ(sfzdz)){
			return "{\"info\":\"身份证地址填写错误\"}";
		}
		String zcid = java.util.UUID.randomUUID().toString();
		System.out.println(zcid);
		String jcb = "insert into tb_owner(id,xm,xb,zjlx,zjhm,csrq,dz,sfzdz,type) values('"+zcid+"',?,?,?,?,"+"to_date('"+csrq+"','yyyy-mm-dd')"+",?,?,'0')";
		int count = jdbcTemplate.update(jcb,xm,xb,zjlx,zjhm,dz,sfzdz);
		if (count!=0) {
//			String sql = "select id from tb_owner where zjhm = '"+zjhm+"'";
//			int id = jdbcTemplate.queryForObject(sql, Integer.class);
			System.out.println(zcid);
			String zcid1 = java.util.UUID.randomUUID().toString();
			String yhb = "insert into tb_user(id,user_name,pass_word,owner_id)values('"+zcid1+"','"+sjhm+"','"+mm+zcid1+"','"+zcid+"')";
			System.out.println(yhb);
			int c = jdbcTemplate.update(yhb);
			if(c>0){
				return "{\"info\":\"注册成功\"}";
			}else{
				return "{\"info\":\"注册失败\"}";
			}
		}else{
			return "{\"info\":\"注册失败\"}";
		}
	}

	/**
	 * 企业用户注册
	 */
	public String insert_qyyh(String postData, HttpServletRequest request){

		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		//当info=0
		String sjhm = String.valueOf(paramMap.get("SJHM"));
		logger.info(sjhm);
		if(!v.isLXFS(sjhm)){
			return "{\"info\":\"手机号码填写错误\"}";
		}
		int sj = phone_only(sjhm);
		if(sj==1){
			return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
		}
		String yzm = String.valueOf(paramMap.get("JYZYZM"));
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
		
		String qymc = String.valueOf(paramMap.get("WYCJYZXM"));//企业名称
		if(!v.isCLPP(qymc)){
			return "{\"info\":\"企业名称填写错误\"}";
		}
//		String qy_zjlx = String.valueOf(paramMap.get("zjlx")); //企业证件类型
//		if(!v.isCLPP(qy_zjlx)){
//			return "{\"info\":\"企业证件类型填写错误\"}";
//		}
		String qy_zjhm = String.valueOf(paramMap.get("ZZJGDMZ")); //企业证件号码
		if(!v.isCLPP(qy_zjhm)){
			return "{\"info\":\"企业证件号码填写错误\"}";
		}
		String frxm =String.valueOf(paramMap.get("FRDBXM"));		//法人姓名
		if(!v.isUSERName(frxm)){
			return "{\"info\":\"姓名填写错误\"}";
		}
		String frzjlx =String.valueOf(paramMap.get("ZJLX_FR"));	//法人证件类型
		if(!v.REGEX_SQLX(frzjlx)){
			return "{\"info\":\"证件类型填写错误\"}";
		}
		String frzjhm =String.valueOf(paramMap.get("FRSFZH"));	//法人证件号码
		if(frzjlx.equals("身份证")){
			if(!v.isIDCard(frzjhm)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
		}else{
			if(!v.isCLPP(frzjhm)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
		}
		if(frzjlx.equals("身份证")){
			int zjhcf = sfzh_only(frzjhm);
			if(zjhcf>0){
				return "{\"info\":\"证件号码重复,请更换证件号\"}";
			}
		}
		String sheng = String.valueOf(paramMap.get("SHENG"));//省
		String shi = String.valueOf(paramMap.get("SHI"));//市
		String qu = String.valueOf(paramMap.get("QU"));//区
		String lxdz =String.valueOf(paramMap.get("QYLXDZ"));	//联系地址
		String dz = sheng+"|"+shi+"|"+qu+"|"+lxdz;
		if(!v.isLXDZ(dz)){
			return "{\"info\":\"企业联系地址填写错误\"}";
		}
		String xm =String.valueOf(paramMap.get("XM"));		//姓名
		if(!v.isUSERName(xm)){
			return "{\"info\":\"经办人姓名填写错误\"}";
		}
		String mm = String.valueOf(paramMap.get("JYZPWD"));
		if(!v.isMM(mm)){
			return "{\"info\":\"密码填写错误\"}";
		}
		String remm = String.valueOf(paramMap.get("JYZREPWD"));
		if(!v.isMM(remm)){
			return "{\"info\":\"确认密码填写错误\"}";
		}
		if(!mm.equals(remm)){
			return "{\"info\":\"两次密码不一致,请重新输入\"}";
		}
		String sjsb = request.getSession().getAttribute("zc_sjsb").toString();
		String sjsb1 = request.getSession().getAttribute("zc_sjsb1").toString();
		String jcb = "update tb_owner set QYMC='"+qymc+"',ZJHM='"+qy_zjhm+"',ZJLX='组织机构代码证',XM='"+frxm+"'"
				+ ",FRSFLX='"+frzjlx+"',FRSFZH='"+frzjhm+"',DZ='"+dz+"',TYPE='1' where id ='"+sjsb+"'";
		System.out.println(jcb);
		int count = jdbcTemplate.update(jcb);
		if (count>0) {
//			String sql = "select id from tb_owner where sjsb = '"+sjsb+"'";
//			int id = jdbcTemplate.queryForObject(sql, Integer.class);
			String yhb = "update tb_user set JBRXM=?,USER_NAME=?,PASS_WORD=?,is_admin=?,owner_id=? where id=?";
			int c = jdbcTemplate.update(yhb,xm,sjhm,mm+sjsb1,"0",sjsb,sjsb1);
			if(c>0){
				return "{\"info\":\"注册成功\"}";
			}else{
				jdbcTemplate.update("delete from tb_owner where id='"+sjsb+"'");
				return "{\"info\":\"注册失败\"}";
			}
		}else{
			return "{\"info\":\"注册失败\"}";
		}
	}
	//平台经办人注册
	public String insert_ptjbr(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sjhm = String.valueOf(paramMap.get("SJHM"));
		logger.info(sjhm);
		if(!v.isLXFS(sjhm)){
			return "{\"info\":\"手机号码填写错误\"}";
		}
		int sj = phone_only(sjhm);
		if(sj==1){
			return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
		}
		String yzm = String.valueOf(paramMap.get("JYZYZM"));
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
		String xm =String.valueOf(paramMap.get("XM"));		//姓名
		if(!v.isUSERName(xm)){
			return "{\"info\":\"经办人姓名填写错误\"}";
		}
		String mm = String.valueOf(paramMap.get("JYZPWD"));
		if(!v.isMM(mm)){
			return "{\"info\":\"密码填写错误\"}";
		}
		String remm = String.valueOf(paramMap.get("JYZREPWD"));
		if(!v.isMM(remm)){
			return "{\"info\":\"确认密码填写错误\"}";
		}
		if(!mm.equals(remm)){
			return "{\"info\":\"两次密码不一致,请重新输入\"}";
		}
		String owner_id = request.getSession().getAttribute("zcowner_id").toString();
		String jcb = "insert into tb_user (JBRXM,USER_NAME,PASS_WORD,owner_id) values(?,?,?,?)";
		int count = jdbcTemplate.update(jcb,xm,sjhm,mm,owner_id);
		if (count!=0) {
			return "{\"info\":\"注册成功\"}";
		}else{
			return "{\"info\":\"注册失败\"}";
		}
	}
	//查询所有平台
	public String findptlb(){
		String sql = "select owner_id,jyzmc from tb_jyzjcxx";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	
	//根据组织机构代码和平台名称查询是否有该平台
	public int findptisexist(String owner_id,String zzjgdm,HttpServletRequest request){
		String sql = "select * from tb_owner o,tb_jyzjcxx j where o.id=j.owner_id and j.owner_id=? and o.ZJHM =?";
		System.out.println(sql+" "+owner_id+ "  "+zzjgdm);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,owner_id,zzjgdm);
		if(list!=null&&list.size()>0){
			request.getSession().setAttribute("zcowner_id", list.get(0).get("owner_id").toString());
			return 0;
		}else{
			return 1;
		}
	}
	
	/**
	 * 验证身份证号码是否重复
	 */
		public int sfzh_only(String sfzh){
			String sql = "select count(*) from tb_owner where zjhm ='"+sfzh+"'";
			int count = jdbcTemplate.queryForObject(sql, Integer.class);
			return count;
		}
	/**
	 * 	验证手机号是否唯一
	 */
		public int phone_only(String phone){
			String sql = "select * from tb_user where user_name = '"+phone+"' and is_yx = '0'";
			logger.info(sql);
			List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
			logger.info(list.size()+"");
			int count = 0;
			if(list.size()>0){
				count = 1;
			}
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		/**
		 * 首页忘记密码功能
		 */
		public String wjmm(String postData,HttpServletRequest request){
			int count = 0;
			Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
			String sjhm = String.valueOf(paramMap.get("sjhm"));
			String yzm = String.valueOf(paramMap.get("yzm"));
			String mm = String.valueOf(paramMap.get("mm"));
			String qrmm = String.valueOf(paramMap.get("qrmm"));
			int yzmcs = (Integer)request.getSession().getAttribute("yzmcs");
			String sess_yzm = (String)request.getSession().getAttribute("yzm").toString();
			String yzmfssj = (String)request.getSession().getAttribute("yzmFssj").toString();
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
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机填写错误\"}";
			}
			if(phone_only(sjhm)>1){
				return "{\"info\":\"此手机号码未注册，请注册\"}";
			}
		
			if(!v.isMM(mm)){
				return "{\"info\":\"密码填写错误\"}";
			}
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!mm.equals(qrmm)){
				return "{\"info\":\"两次密码不一致,请重新输入\"}";
			}
			String y_owner = "select * from tb_user where user_name = '"+sjhm+"'";
			List<Map<String, Object>> owner = jdbcTemplate.queryForList(y_owner);
			String y_mm = "",y_id="";
			if(owner.size()>0){
				y_mm = owner.get(0).get("pass_word")==null?"":owner.get(0).get("pass_word").toString();
				y_id = String.valueOf(owner.get(0).get("id"));
			}
			String y_nr = sjhm+"|"+y_mm;
			String sql = "update tb_user set pass_word = ? where user_name = ? and is_yx='0'";
			count = jdbcTemplate.update(sql,mm+String.valueOf(owner.get(0).get("ID")),sjhm);
			if(count!=0){
				String x_nr = sjhm+"|"+mm;
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'0',?,?)",y_nr,x_nr,y_id,y_id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}

}

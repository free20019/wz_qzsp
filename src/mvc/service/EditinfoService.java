
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

import javax.servlet.ServletRequest;
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
public class EditinfoService extends MvcService{
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
	 * 个人信息修改
	 * @param postData
	 * @param request
	 * @return
	 */
	public String gredit(String postData, HttpServletRequest request) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sjhm = String.valueOf(paramMap.get("sjhm"));//手机号码
		String oldsjhm = String.valueOf(paramMap.get("oldsjhm"));//修改手机号前手机号码
		String yzm = String.valueOf(paramMap.get("yzm"));//验证码
		String type = String.valueOf(paramMap.get("type"));//修改类型
		String user = String.valueOf(request.getSession().getAttribute("user"));//原用户名
		String pwd = String.valueOf(request.getSession().getAttribute("pwd"));//原密码
		String id = String.valueOf(String.valueOf(request.getSession().getAttribute("dlid")));//登录owner表id
		
		/**
		 * type=0 个人修改手机号
		 * type=1个人修改密码
		 * type=2个人信息修改
		 */
		if(type.equals("0")){
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"新手机填写错误\"}";
			}
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
			
			if(!v.isLXFS(oldsjhm)){
				return "{\"info\":\"原手机填写错误\"}";
			}
			int sj = phone_only(sjhm);
			if(sj==1){
				return "{\"info\":\"新手机号码已注册,请更换需要修改的手机号\"}";
			}
			String xgsjh = "update tb_user set user_name = ?,bj='2' where user_name = ? and is_yx = '0'";
			int sjh = jdbcTemplate.update(xgsjh,sjhm,oldsjhm);
			if(sjh!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'2',?,?)",oldsjhm,sjhm,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else if(type.equals("1")){
			String oldmm = String.valueOf(paramMap.get("oldmm"));//修改前的原密码
			String newmm = String.valueOf(paramMap.get("newmm"));//修改后密码
			String qrmm = String.valueOf(paramMap.get("qrmm"));//确认密码
			if(!v.isMM(oldmm)){
				return "{\"info\":\"旧密码填写错误\"}";
			}
			if(!oldmm.equals(pwd)){
				return "{\"info\":\"旧密码填写错误\"}";
			}
			if(!v.isMM(newmm)){
				return "{\"info\":\"新密码填写错误\"}";
			}
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!newmm.equals(qrmm)){
				return "{\"info\":\"新密码与确认密码不一致\"}";
			}
			String xggrmm = "update tb_user set pass_word=?,bj='2' where user_name=? and pass_word=? and is_yx='0'";
			int grmm = jdbcTemplate.update(xggrmm,newmm,user,oldmm);
			if(grmm!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'3',?,?)",oldmm,newmm,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else{
			String xm = String.valueOf(paramMap.get("XM"));//姓名
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			String xb = String.valueOf(paramMap.get("XB"));//姓别
			if(!v.isXB(xb)){
				return "{\"info\":\"性别填写错误\"}";
			}
			String zjlx = String.valueOf(paramMap.get("ZJLX"));//证件类型
			if(!v.REGEX_SQLX(zjlx)){
				return "{\"info\":\"证件类型填写错误\"}";
			}
			String zjhm = String.valueOf(paramMap.get("ZJHM"));//证件号码
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
				if(zjhcf>1){
					return "{\"info\":\"证件号码重复,请更换证件号\"}";
				}
			}
			String mm = String.valueOf(paramMap.get("MM"));//密码
			if(!v.isMM(mm)){
				return "{\"info\":\"密码填写错误\"}";
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
			List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_owner where id = '"+id+"'");
			String yxm="",yxb="",yzjlx="",yzjhm="",ydz="",ysfzdz="";
			if(list.size()>0){
				yxm = String.valueOf(paramMap.get("XM"));
				yxb = String.valueOf(paramMap.get("XB"));
				yzjlx = String.valueOf(paramMap.get("ZJLX"));
				yzjhm = String.valueOf(paramMap.get("ZJHM"));
				ydz = String.valueOf(paramMap.get("DZ"));
				ysfzdz = String.valueOf(paramMap.get("SFZDZ"));
			}
			String ynr = yxm+"|"+yxb+"|"+yzjlx+"|"+yzjhm+"|"+ydz+"|"+ysfzdz;
			String xnr = xm+"|"+xb+"|"+zjlx+"|"+zjhm+"|"+dz+"|"+sfzdz;
			String tb_owner = "update tb_owner set XM='"+xm+"',XB='"+xb+"',ZJLX='"+zjlx+"',ZJHM='"+zjhm+"',DZ='"+dz+"',SFZDZ='"+sfzdz+"',bj='2' where id = '"+id+"'";
			int owner = jdbcTemplate.update(tb_owner);
			if(owner!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'4',?,?)",ynr,xnr,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}
	}
	public String QyEdit(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sjhm = String.valueOf(paramMap.get("SJHM"));//手机号码
		String oldsjhm = String.valueOf(paramMap.get("oldsjhm"));//修改手机号前手机号码
		String yzm = String.valueOf(paramMap.get("JYZYZM"));//验证码
		String type = String.valueOf(paramMap.get("type"));//修改类型
		String user = String.valueOf(request.getSession().getAttribute("user"));//原用户名
		String id = String.valueOf(String.valueOf(request.getSession().getAttribute("dlid")));//登录owner表id
		if(!v.isLXFS(sjhm)){
			return "{\"info\":\"手机号码填写错误\"}";
		}
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
		int sj = phone_only(sjhm);
		if(sj>1){
			return "{\"info\":\"新手机号码已注册,请更换需要修改的手机号\"}";
		}
		if(type.equals("0")){
			
			if(!v.isLXFS(oldsjhm)){
				return "{\"info\":\"原手机填写错误\"}";
			}
			String xgsjh = "update tb_user set user_name = ?,bj='2' where user_name = ? and is_yx = '0'";
			int sjh = jdbcTemplate.update(xgsjh,sjhm,oldsjhm);
			if(sjh!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'5',?,?)",oldsjhm,sjhm,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		
		}else if(type.equals("1")){
			String zjhm = String.valueOf(paramMap.get("zjhm"));//经办人身份证号
			if(!v.isIDCard(zjhm)){
				return "{\"info\":\"身份证号码填写错误\"}";
			}
			int sf = jbrsfzh_only(zjhm);
			if(sf>1){
				return "{\"info\":\"身份证号码已存在，请更换身份证号码！\"}";
			}
			String xm = String.valueOf(paramMap.get("xm"));//经办人姓名
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			String mm = String.valueOf(paramMap.get("mm"));//密码
			if(!v.isMM(mm)){
				return "{\"info\":\"密码填写错误\"}";
			}
			String qrmm = String.valueOf(paramMap.get("qrmm"));//确认密码
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!mm.equals(qrmm)){
				return "{\"info\":\"两次密码不一致,请重新输入\"}";
			}
			String yzjhm="",yxm="",ymm="";
			List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_user where user_name = '"+sjhm+"'");
			if(list.size()>0){
				yzjhm = String.valueOf(list.get(0).get("JBRSFZH"));
				yxm = String.valueOf(list.get(0).get("JBRXM"));
				ymm = String.valueOf(list.get(0).get("PASS_WORD"));
			}
			String ynr = yzjhm+"|"+yxm+"|"+ymm;
			String xnr = zjhm+"|"+xm+"|"+mm;
			String jbrxx = "update tb_user set jbrsfzh = ?,jbrxm = ?,pass_word = ?,bj='2' where user_name = ?";
			int jbr = jdbcTemplate.update(jbrxx,zjhm,xm,mm,sjhm);
			if(jbr!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'6',?,?)",ynr,xnr,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else{
			String qymc = String.valueOf(paramMap.get("WYCJYZXM"));//企业名称
			if(!v.isCLPP(qymc)){
				return "{\"info\":\"企业名称填写错误\"}";
			}
			String zjlx = String.valueOf(paramMap.get("zjlx"));//企业证件类型
			if(!v.isCLPP(zjlx)){
				return "{\"info\":\"企业证件类型填写错误\"}";
			}
			String zjhm = String.valueOf(paramMap.get("ZZJGDMZ"));//企业证件号码
			if(!v.isCLPP(zjhm)){
				return "{\"info\":\"企业证件号码填写错误\"}";
			}
			String xm = String.valueOf(paramMap.get("FRDBXM"));//法人姓名
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			String zjlx_fr = String.valueOf(paramMap.get("ZJLX_FR"));//法人身份类型
			if(!v.REGEX_SQLX(zjlx_fr)){
				return "{\"info\":\"证件类型填写错误\"}";
			}
			String zjhm_fr = String.valueOf(paramMap.get("FRSFZH"));//法人证件号码
			if(zjlx_fr.equals("居民身份证")){
				if(!v.isIDCard(zjhm_fr)){
					return "{\"info\":\"证件号码填写错误\"}";
				}
			}else{
				if(!v.isCLPP(zjhm_fr)){
					return "{\"info\":\"证件号码填写错误\"}";
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
			List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_owner where id = '"+id+"'");
			String yqymc="",yzjlx="",yzjhm="",yxm="",yfrsflx="",yfasfzh="",ydz="";
			if(list.size()>0){
				yqymc = String.valueOf(paramMap.get("QYMC"));
				yzjlx = String.valueOf(paramMap.get("ZJLX"));
				yzjhm = String.valueOf(paramMap.get("ZJHM"));
				yxm = String.valueOf(paramMap.get("XM"));
				yfrsflx = String.valueOf(paramMap.get("FRSFLX"));
				yfasfzh = String.valueOf(paramMap.get("FRSFZH"));
				ydz = String.valueOf(paramMap.get("DZ"));
			}
			String qyxgxx = "update tb_owner set QYMC = ?,ZJLX = ?,ZJHM = ?,XM = ?,FRSFLX = ?,FRSFZH = ?,DZ = ?,bj='2' where id ='"+id+"'";
			int qyxg = jdbcTemplate.update(qyxgxx,qymc,zjlx,zjhm,xm,zjlx_fr,zjhm_fr,dz);
			if(qyxg!=0){
				String ynr = yqymc+"|"+yzjlx+"|"+yzjhm+"|"+yxm+"|"+yfrsflx+"|"+yfasfzh+"|"+ydz;
				String xnr = qymc+"|"+zjlx+"|"+zjhm+"|"+xm+"|"+zjlx_fr+"|"+zjhm_fr+"|"+dz;
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'7',?,?)",ynr,xnr,id,id);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}
	}
	public String addqyjbr(String postData,HttpServletRequest request,String type){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sfzh = String.valueOf(paramMap.get("ZZJGDMZ"));
		String sjs = String.valueOf(request.getSession().getAttribute("qyjbr_sjs"));
		String id = String.valueOf(String.valueOf(request.getSession().getAttribute("dlid")));//登录owner表id
		if(!v.isIDCard(sfzh)){
			return "{\"info\":\"证件号码填写错误\"}";
		}
		String xm = String.valueOf(paramMap.get("XM"));
		if(!v.isUSERName(xm)){
			return "{\"info\":\"经办人姓名填写错误\"}";
		}
		String sjhm = String.valueOf(paramMap.get("SJHM"));
		logger.info(sjhm);
		if(!v.isLXFS(sjhm)){
			return "{\"info\":\"手机号码填写错误\"}";
		}
		int sj = phone_only(sjhm);
		String mm = String.valueOf(paramMap.get("JYZPWD"));
		String qrmm = String.valueOf(paramMap.get("JYZREPWD"));
		if(!v.isMM(mm)){
			return "{\"info\":\"密码填写错误\"}";
		}
		if(!v.isMM(qrmm)){
			return "{\"info\":\"确认密码填写错误\"}";
		}
		if(!mm.equals(qrmm)){
			return "{\"info\":\"两次密码不一致,请重新输入\"}";
		}
		String sql = "";
		String sjh = String.valueOf(paramMap.get("user"));
		if(type.equals("0")){
			if(sj==1){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			sql = "update tb_user set jbrsfzh =?,jbrxm =?,user_name =?,pass_word =?,owner_id='"+id+"' where id ='"+sjs+"'";
		}else{
			if(sj>1){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			sql = "update tb_user set jbrsfzh =?,jbrxm =?,user_name =?,pass_word =? where user_name ='"+sjh+"' and is_yx='0'";
		}
		int count = jdbcTemplate.update(sql,sfzh,xm,sjhm,mm);
		if(count!=0){
			String xnr = sfzh+"|"+xm+"|"+sjhm+"|"+mm+"|"+id;
			if(type.equals("0")){
				jdbcTemplate.update("insert into tb_czrz (XNR,XGLX,XGR,XGJLID) values (?,'8',?,?)",xnr,id,sjs);
			}else{
				List<Map<String, Object>> list =jdbcTemplate.queryForList("select * from tb_user  where user_name ='"+sjh+"' and is_yx='0'");
				String ysfzh="",yxm="",ysjhm="",ymm="";
				if(list.size()>0){
					ysfzh = String.valueOf(list.get(0).get("JBRSFZH"));
					yxm = String.valueOf(list.get(0).get("JBRXM"));
					ysjhm = String.valueOf(list.get(0).get("USER_NAME"));
					ymm = String.valueOf(list.get(0).get("PASS_WORD"));
				}
				String ynr = ysfzh+"|"+yxm+"|"+ysjhm+"|"+ymm;
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'9',?,?)",ynr,xnr,id,sjs);
			}
			return "{\"info\":\"添加成功\"}";
		}else{
			return "{\"info\":\"添加失败\"}";
		}
	}
	/**
	 * 企业删除经办人
	 */
	public String QyDel(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String SJHM = String.valueOf(paramMap.get("SJHM"));
		String sql = "update tb_user set is_yx = '1',bj='2' where user_name = ?";
		int count = jdbcTemplate.update(sql,SJHM);
		if(count!=0){
			String id = String.valueOf(request.getSession().getAttribute("dbrid"));
			jdbcTemplate.update("insert into tb_czrz (XGLX,XGR,XGJLID) values ('10',?,?)",id,SJHM);
			return "{\"info\":\"解除成功\"}";
		}else{
			return "{\"info\":\"解除失败\"}";
		}
	}
	
	/**
	 * 平台修改经办人信息
	 */
	public String PtEdit(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String sjhm = String.valueOf(paramMap.get("SJHM"));//手机号码
		String oldsjhm = String.valueOf(paramMap.get("oldsjhm"));//修改手机号前手机号码
		String yzm = String.valueOf(paramMap.get("yzm"));//验证码
		String type = String.valueOf(paramMap.get("type"));//修改类型
		String user = String.valueOf(request.getSession().getAttribute("user"));//原用户名
		String pwd = String.valueOf(request.getSession().getAttribute("pwd"));//原密码
		String id = String.valueOf(String.valueOf(request.getSession().getAttribute("dlid")));//登录owner表id
		
		/**
		 * type=0 个人修改手机号
		 * type=1个人修改密码
		 * type=2个人信息修改
		 */
		if(type.equals("0")){
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"新手机填写错误\"}";
			}
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
			
			if(!v.isLXFS(oldsjhm)){
				return "{\"info\":\"原手机填写错误\"}";
			}
			int sj = phone_only(sjhm);
			if(sj==1){
				return "{\"info\":\"新手机号码已注册,请更换需要修改的手机号\"}";
			}
			String xgsjh = "update tb_user set user_name = ?,bj='2' where user_name = ? and is_yx = '0'";
			int sjh = jdbcTemplate.update(xgsjh,sjhm,oldsjhm);
			if(sjh!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'11',?,?)",oldsjhm,sjhm,id,sjhm);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else if(type.equals("1")){
			String oldmm = String.valueOf(paramMap.get("oldmm"));//修改前的原密码
			String newmm = String.valueOf(paramMap.get("newmm"));//修改后密码
			String qrmm = String.valueOf(paramMap.get("qrmm"));//确认密码
			if(!v.isMM(oldmm)){
				return "{\"info\":\"旧密码填写错误\"}";
			}
			if(!oldmm.equals(pwd)){
				return "{\"info\":\"旧密码填写错误\"}";
			}
			if(!v.isMM(newmm)){
				return "{\"info\":\"新密码填写错误\"}";
			}
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!newmm.equals(qrmm)){
				return "{\"info\":\"新密码与确认密码不一致\"}";
			}
			String xggrmm = "update tb_user set pass_word=?,bj='2' where user_name=? and pass_word=? and is_yx='0'";
			int grmm = jdbcTemplate.update(xggrmm,newmm,user,oldmm);
			if(grmm!=0){
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'12',?,?)",oldmm,newmm,id,sjhm);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else{
			String sfzh = String.valueOf(paramMap.get("sfzh"));
			String xm = String.valueOf(paramMap.get("xm"));
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机号码错误\"}";
			}
			if(!user.equals(sjhm)){
				return "{\"info\":\"手机号码错误\"}";
			}
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
			if(!v.isIDCard(sfzh)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			String xnr = sfzh+"|"+xm;
			String jbrxx = "update tb_user set jbrsfzh = ?,jbrxm = ?,bj='2' where user_name =? and is_yx='0'";
			int jbr = jdbcTemplate.update(jbrxx,sfzh,xm,sjhm);
			if(jbr!=0){
				List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_user where user_name ='"+sjhm+"' and is_yx='0'");
				String ysfzh = "",yxm = "";
				if(list.size()>0){
					ysfzh = String.valueOf(list.get(0).get("JBRSFZH"));
					yxm = String.valueOf(list.get(0).get("JBRXM"));
				}
				String ynr = ysfzh+"|"+yxm;
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'13',?,?)",ynr,xnr,id,sjhm);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}
	}
	/**
	 * 平台增删改查经办人操作
	 * type = 0 查询  1增加   2修改  3删除
	 */
	public String PtJbr(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String id = String.valueOf(String.valueOf(request.getSession().getAttribute("dlid")));//登录owner表id
		String type = String.valueOf(paramMap.get("type"));//类型
		String xm = String.valueOf(paramMap.get("xm"));//姓名
		String sjhm = String.valueOf(paramMap.get("SJHM"));//手机号码
		String mm = String.valueOf(paramMap.get("mm"));//密码
		String qrmm = String.valueOf(paramMap.get("qrmm"));//确认密码
		if(type.equals("0")){
			String find = "select * from tb_user where owner_id = '"+id+"' and is_admin = '1' and is_yx = '0'";
			List<Map<String, Object>> list = jdbcTemplate.queryForList(find);
			return jacksonUtil.toJson(list);
		}else if(type.equals("1")){
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机号码错误\"}";
			}
			int sj = phone_only(sjhm);
			if(sj==1){
				return "{\"info\":\"新手机号码已注册,请更换需要修改的手机号\"}";
			}
			if(!v.isMM(mm)){
				return "{\"info\":\"密码填写错误\"}";
			}
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!mm.equals(qrmm)){
				return "{\"info\":\"密码与确认密码不一致\"}";
			}
			String zcid = java.util.UUID.randomUUID().toString();
			String add = "insert into tb_user (id,user_name,pass_word,jbrxm,owner_id) values(?,?,?,?,?)";
			int count = jdbcTemplate.update(add,zcid,sjhm,mm,xm,id);
			if(count!=0){
				String xnr = sjhm+"|"+mm+"|"+xm+"|"+id;
				jdbcTemplate.update("insert into tb_czrz (XNR,XGLX,XGR,XGJLID) values (?,'14',?,?)",xnr,id,sjhm);
				return "{\"info\":\"添加成功\"}";
			}else{
				return "{\"info\":\"添加失败\"}";
			}
		}else if(type.equals("2")){
			String oldsjhm = String.valueOf(paramMap.get("oldsjhm"));
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机号码错误\"}";
			}
			int sj = phone_only(sjhm);
			if(sj>1){
				return "{\"info\":\"新手机号码已注册,请更换需要修改的手机号\"}";
			}
			if(!v.isMM(mm)){
				return "{\"info\":\"密码填写错误\"}";
			}
			if(!v.isMM(qrmm)){
				return "{\"info\":\"确认密码填写错误\"}";
			}
			if(!mm.equals(qrmm)){
				return "{\"info\":\"密码与确认密码不一致\"}";
			}
			String edit = "update tb_user set user_name =?, pass_word =?, jbrxm =?, owner_id =?,bj='2' where user_name =? and is_yx='0'";
			int count = jdbcTemplate.update(edit,sjhm,mm,xm,id,oldsjhm);
			if(count!=0){
				List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tb_user where user_name ='"+sjhm+"' and is_yx='0'");
				String ysjhm="",ymm="",yxm="",yid="";
				if(list.size()>0){
					ysjhm = String.valueOf(list.get(0).get("USER_NAME"));
					ymm = String.valueOf(list.get(0).get("PASS_WORD"));
					yxm = String.valueOf(list.get(0).get("JBRXM"));
					yid = String.valueOf(list.get(0).get("OWNER_ID"));
				}
				String ynr = ysjhm+"|"+ymm+"|"+yxm+"|"+yid;
				String xnr = sjhm+"|"+mm+"|"+xm+"|"+id;
				jdbcTemplate.update("insert into tb_czrz (YNR,XNR,XGLX,XGR,XGJLID) values (?,?,'15',?,?)",ynr,xnr,id,sjhm);
				return "{\"info\":\"修改成功\"}";
			}else{
				return "{\"info\":\"修改失败\"}";
			}
		}else if(type.equals("3")){
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机号码错误\"}";
			}
			String sql = "update tb_user set is_yx = '1',bj='2' where user_name = ?";
			System.out.println(sql+"  "+sjhm);
			int count = jdbcTemplate.update(sql,sjhm);
			if(count!=0){
				jdbcTemplate.update("insert into tb_czrz (XGLX,XGR,XGJLID) values ('16',?,?)",id,sjhm);
				return "{\"info\":\"解除成功\"}";
			}else{
				return "{\"info\":\"解除失败\"}";
			}
		}
		return "{\"info\":\"失败\"}";
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
	 * 验证身份证号码是否重复
	 */
		public int sfzh_only(String sfzh){
			String sql = "select count(*) from tb_owner where zjhm ='"+sfzh+"'";
			int count = jdbcTemplate.queryForObject(sql, Integer.class);
			return count;
		}
	/**
	 * 验证经办人身份证号码是否重复
	 */
	public int jbrsfzh_only(String sfzh){
		String sql = "select count(*) from tb_user where jbrsfzh ='"+sfzh+"'";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	
	/**
	 * 平台代办驾驶员根据证件号码查询是否存在该人员
	 */
	public String findzjhm(String zjhm){
		String sql = "select * from tb_user u,tb_owner o where u.owner_id=o.id and o.zjhm =?";
		System.out.println(sql +"  "+zjhm);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,zjhm);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("CSRQ", String.valueOf(list.get(i).get("CSRQ")).length()>10?String.valueOf(list.get(i).get("CSRQ")).substring(0, 10):String.valueOf(list.get(i).get("CSRQ")));
		}
		return jacksonUtil.toJson(list);
	}
	/**
	 * 个人驾驶证、运输证代办，
	 * type=0 代办用户不存在，添加账号
	 *     =1 代办用户存在，修改账号
	 *     =2代办用户存在，不修改
	 */
	public String grjszdb(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String type = String.valueOf(paramMap.get("type"));
		String zjlx = String.valueOf(paramMap.get("pt_gryszdb_zjlx"));//证件类型
		String zjhm = String.valueOf(paramMap.get("pt_gryszdb_zjhm"));//证件号码
		String sjhm = String.valueOf(paramMap.get("pt_grjsyzdb_sjhm"));//手机号码
		String xm = String.valueOf(paramMap.get("pt_grjsyzdb_jsyxm"));//姓名
		String xb = String.valueOf(paramMap.get("pt_grjsyzdb_xb"));//性别
		String csrq = String.valueOf(paramMap.get("pt_grjsyzdb_csrq"));//出生日期
		String sheng = String.valueOf(paramMap.get("pt_grjsyzdb_SHENG"));//省
		String shi = String.valueOf(paramMap.get("pt_grjsyzdb_SHI"));//市
		String qu = String.valueOf(paramMap.get("pt_grjsyzdb_QU"));//区
		String lxdz =String.valueOf(paramMap.get("pt_grjsyzdb_LXDZ"));	//联系地址
		String dz = sheng+"|"+shi+"|"+qu+"|"+lxdz;
		String sfzsheng = String.valueOf(paramMap.get("pt_grjsyzdb_SFZSHENG"));//省
		String sfzshi = String.valueOf(paramMap.get("pt_grjsyzdb_SFZSHI"));//市
		String sfzqu = String.valueOf(paramMap.get("pt_grjsyzdb_SFZQU"));//区
		String sfzlxdz =String.valueOf(paramMap.get("pt_grjsyzdb_SFZDZ"));	//联系地址
		String sfzdz = sfzsheng+"|"+sfzshi+"|"+sfzqu+"|"+sfzlxdz;
		String xgqzjhm = String.valueOf(paramMap.get("xgqzjhm"));//修改前的证件号码
		request.getSession().setAttribute("sjhm", sjhm);
		request.getSession().setAttribute("dbxm", xm);
		if(type.equals("0")||type.equals("1")){
			if(!v.REGEX_SQLX(zjlx)){
				return "{\"info\":\"证件类型填写错误\"}";
			}
			if(zjlx.equals("居民身份证")){
				if(!v.isIDCard(zjhm)){
					return "{\"info\":\"证件号码填写错误\"}";
				}
			}else{
				if(!v.isCLPP(zjhm)){
					return "{\"info\":\"证件号码填写错误\"}";
				}
			}
			if(!v.isUSERName(xm)){
				return "{\"info\":\"姓名填写错误\"}";
			}
			if(!v.isXB(xb)){
				return "{\"info\":\"性别填写错误\"}";
			}
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
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"手机填写错误\"}";
			}
			if(!v.isLXDZ(dz)){
				return "{\"info\":\"联系地址填写错误\"}";
			}
			if(!v.isLXDZ(sfzdz)){
				return "{\"info\":\"身份证地址填写错误\"}";
			}
		}else if(type.equals("2")){
			String bdbrid = jdbcTemplate.queryForObject("select id from tb_user where user_name = '"+sjhm+"' and is_yx = '0'", String.class);
			request.getSession().setAttribute("bdbrid", bdbrid);
			return "{\"info\":\"申请代办成功\"}";
		}else{
			return "{\"info\":\"申请代办失败，请重新填写\"}";
		}
		if(type.equals("0")){
			int zjhcf = sfzh_only(zjhm);
			if(zjhcf>0){
				return "{\"info\":\"证件号码已存在,请更换证件号\"}";
			}
			int sj = phone_only(sjhm);
			if(sj>0){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			String zcid = UUID.randomUUID().toString();
			String zcid1 = UUID.randomUUID().toString();
			String jcb = "insert into tb_owner(id,xm,xb,zjlx,zjhm,csrq,dz,sfzdz,type) values('"+zcid+"',?,?,?,?,"+"to_date('"+csrq+"','yyyy-mm-dd')"+",?,?,'0')";
			int count = jdbcTemplate.update(jcb,xm,xb,zjlx,zjhm,dz,sfzdz);
			if (count!=0) {
//				String sql = "select id from tb_owner where zjhm = '"+zjhm+"'";
//				String id = jdbcTemplate.queryForObject(sql, String.class);
				String yhb = "insert into tb_user(id,user_name,owner_id)values(?,?,?)";
				int c = jdbcTemplate.update(yhb,zcid1,sjhm,zcid);
				if(c>0){
//					String bdbrid = jdbcTemplate.queryForObject("select id from tb_user where user_name = '"+sjhm+"' and is_yx = '0'", String.class);
					request.getSession().setAttribute("bdbrid", zcid1);
					return "{\"info\":\"申请代办成功\"}";
				}else{
					return "{\"info\":\"申请代办失败\"}";
				}
			}else{
				return "{\"info\":\"申请代办失败\"}";
			}
		}else if(type.equals("1")){
			String bdbrid = jdbcTemplate.queryForObject("select id from tb_user where user_name = '"+sjhm+"' and is_yx = '0'", String.class);
			request.getSession().setAttribute("bdbrid", bdbrid);
			int zjhcf = sfzh_only(zjhm);
			if(zjhcf>1){
				return "{\"info\":\"证件号码已存在,请更换证件号\"}";
			}
			int sj = phone_only(sjhm);
			if(sj>1){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			String jcb = "update tb_owner set xm =?,xb =?,zjlx =?,zjhm =?,csrq =to_date('"+csrq+"','yyyy-mm-dd'),dz =?,sfzdz =?,type ='0',bj='2' where zjhm =?";
			int count = jdbcTemplate.update(jcb,xm,xb,zjlx,zjhm,dz,sfzdz,xgqzjhm);
			if (count!=0) {
				String sql = "select id from tb_owner where zjhm = '"+zjhm+"'";
				String id = jdbcTemplate.queryForObject(sql, String.class);
				String yhb = "update tb_user set user_name =? where owner_id =?";
				int c = jdbcTemplate.update(yhb,sjhm,id);
				if(c>0){
					return "{\"info\":\"申请代办成功\"}";
				}else{
					return "{\"info\":\"申请代办失败\"}";
				}
			}else{
				return "{\"info\":\"申请代办失败\"}";
			}
		}
		return "{\"info\":\"申请代办失败，请重试\"}";
	}
	/**
	 * 平台代办企业运输证根据证件号码查询是否存在该企业
	 */
	public String findqyzjhm(String zjhm){
		String sql = "select * from tb_user u,tb_owner o where u.owner_id=o.id and o.zjhm =? and is_admin='0'";
		List list = jdbcTemplate.queryForList(sql,zjhm);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 平台运输证代办，
	 * type=0 代办用户不存在，添加账号
	 *     =1 代办用户存在，修改账号
	 *     =2代办用户存在，不修改
	 */
	public String ptdbqy(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String type = String.valueOf(paramMap.get("type"));
		String zjlx = String.valueOf(paramMap.get("pt_qyyszdb_zjlx"));//证件类型
		String zjhm = String.valueOf(paramMap.get("pt_qyyszdb_zzjgdmzh"));//证件号码
		String qymc = String.valueOf(paramMap.get("pt_qyyszdb_qymc"));//企业名称
		String xm = String.valueOf(paramMap.get("pt_qyyszdb_frxm"));//法人姓名
		String fz_sfzh = String.valueOf(paramMap.get("pt_qyyszdb_frzjhm"));//法人身份证号
		String jbrxm = String.valueOf(paramMap.get("pt_qyyszdb_jbrxm"));//经办人姓名
		String sjhm = String.valueOf(paramMap.get("pt_qyyszdb_jbrsjhm"));//经办人手机号
		String sheng = String.valueOf(paramMap.get("pt_qyyszdb_SHENG"));//省
		String shi = String.valueOf(paramMap.get("pt_qyyszdb_SHI"));//市
		String qu = String.valueOf(paramMap.get("pt_qyyszdb_QU"));//区
		String lxdz = String.valueOf(paramMap.get("pt_qyyszdb_LXDZ"));//具体地址
		String dz = sheng+"|"+shi+"|"+qu+"|"+lxdz;
		String dbqy_zj = String.valueOf(request.getSession().getAttribute("dbqy_zj"));
		String dbqy_zj1 = String.valueOf(request.getSession().getAttribute("dbqy_zj1"));
		String xgqzjhm = String.valueOf(paramMap.get("xgqzjhm"));//修改前证件号码
		String xgqsjhm = String.valueOf(paramMap.get("xgqsjhm"));//修改前手机号码
		request.getSession().setAttribute("sjhm", sjhm);
		request.getSession().setAttribute("dbxm", xm);
		if(type.equals("0")||type.equals("1")){
			if(!v.isUSERName(zjlx)){
				return "{\"info\":\"证件类型填写错误\"}";
			}
			if(!v.isCLPP(zjhm)){
				return "{\"info\":\"证件号码填写错误\"}";
			}
			if(!v.isCLPP(qymc)){
				return "{\"info\":\"企业名称填写错误\"}";
			}
			if(!v.isUSERName(xm)){
				return "{\"info\":\"法定代表人姓名填写错误\"}";
			}
			if(!v.isIDCard(fz_sfzh)){
				return "{\"info\":\"法定代表人身份证号填写错误\"}";
			}
			if(!v.isUSERName(jbrxm)){
				return "{\"info\":\"企业联系人姓名填写错误\"}";
			}
			if(!v.isLXFS(sjhm)){
				return "{\"info\":\"企业联系人手机号码填写错误\"}";
			}
			if(!v.isLXDZ(dz)){
				return "{\"info\":\"联系地址填写错误\"}";
			}
		}else if(type.equals("2")){
			return "{\"info\":\"申请代办成功\"}";
		}else{
			return "{\"info\":\"申请代办失败，请重新填写\"}";
		}
		if(type.equals("0")){
			int zjhcf = sfzh_only(zjhm);
			if(zjhcf>0){
				return "{\"info\":\"证件号码已存在,请更换证件号\"}";
			}
			int sj = phone_only(sjhm);
			if(sj>0){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			String owner = "update tb_owner set ZJLX=?,ZJHM=?,QYMC=?,FRXM=?,FRSFZH=?,DZ=?,type='1' where id=?";
			int count = jdbcTemplate.update(owner,zjlx,zjhm,qymc,xm,fz_sfzh,dz,dbqy_zj);
			if (count!=0) {
//				String sql = "select id from tb_owner where SJSB = '"+dbqy_zj+"'";
//				String id = jdbcTemplate.queryForObject(sql, String.class);
				String yhb = "update tb_user set user_name =? , owner_id =?,jbrxm =?,is_admin='0' where id=?";
				int c = jdbcTemplate.update(yhb,sjhm,dbqy_zj,jbrxm,dbqy_zj1);
				if(c>0){
					return "{\"info\":\"申请代办成功\"}";
				}else{
					return "{\"info\":\"申请代办失败\"}";
				}
			}else{
				return "{\"info\":\"申请代办失败\"}";
			}
		}else if(type.equals("1")){
			int zjhcf = sfzh_only(zjhm);
			if(zjhcf>1){
				return "{\"info\":\"证件号码已存在,请更换证件号\"}";
			}
			int sj = phone_only(sjhm);
			if(sj>1){
				return "{\"info\":\"该手机已注册,请更换手机号注册\"}";
			}
			String owner = "update tb_owner set ZJLX=?,ZJHM=?,QYMC=?,FRXM=?,FRSFZH=?,DZ=?,bj='2' where zjhm=?";
			int count = jdbcTemplate.update(owner,zjlx,zjhm,qymc,xm,fz_sfzh,dz,xgqzjhm);
			if (count!=0) {
				String sql = "select id from tb_owner where zjhm = '"+xgqzjhm+"'";
				String id = jdbcTemplate.queryForObject(sql, String.class);
				String yhb = "update tb_user set user_name =? , owner_id =?,jbrxm =?,is_admin='0',bj='2' where user_name=?";
				int c = jdbcTemplate.update(yhb,sjhm,id,jbrxm,xgqsjhm);
				if(c>0){
					return "{\"info\":\"申请代办成功\"}";
				}else{
					return "{\"info\":\"申请代办失败\"}";
				}
			}else{
				return "{\"info\":\"申请代办失败\"}";
			}
		}
		return "{\"info\":\"申请代办失败\"}";
	}
}

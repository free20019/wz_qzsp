package mvc.controllers;

import helper.QrCode;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.service.CommonService;
import mvc.service.RegisterService;
import mvc.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/register")         

/**
 * 车辆用户登陆action
 * @author Administrator
 *
 */

public class RegisterAction {
	private RegisterService registerService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	@Autowired
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	private CommonService commonService;
	
	public CommonService getCommonService() {
		return commonService;
	}
	@Autowired
	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}
	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * 发送短信
	 * 所有类型短信一分钟只能发送一次
	 * @param request
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/dxfs")
	@ResponseBody
	public String dx(HttpServletRequest request,@RequestParam("postData") String postData) {
		String msg = commonService.fsdx(postData,request);
		logger.info("APP_INFO:{},{}",postData,msg);
		return  msg;
	}
	
	/**
	 * 个人用户注册
	 * @param request
	 * @param postData
	 * @return
	 * 0验证码未发送
	 * 1正确
	 * 2验证码错误
	 */
	@RequestMapping(value = "/insert_gruser")
	@ResponseBody
	public String insert_user(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg=registerService.gryhzc(postData,request);
		logger.info("APP_INFO:{},{}",postData,msg);
		return msg;
	}
	
	/**
	 * 企业用户注册
	 * @param request
	 * @param postData
	 * @return
	 * 0验证码未发送
	 * 1正确
	 * 2验证码错误
	 */
	@RequestMapping(value = "/insert_qyyh")
	@ResponseBody
	public String insert_qyyh(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg=registerService.insert_qyyh(postData,request);
		logger.info("APP_INFO:{},{}",postData,msg);
		return msg;
	}
	/**
	 * 平台经办人用户注册
	 * @param request
	 * @param postData
	 * @return
	 * 0验证码未发送
	 * 1正确
	 * 2验证码错误
	 */
	@RequestMapping(value = "/insert_ptjbr")
	@ResponseBody
	public String insert_ptjbr(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg=registerService.insert_ptjbr(postData,request);
		logger.info("APP_INFO:{},{}",postData,msg);
		return msg;
	}
	/**
	 * 查询所有平台
	 * 注册平台经办人时使用
	 */
	@RequestMapping("/findptlb")
	@ResponseBody
	public String findptlb(){
		String msg = registerService.findptlb();
		return msg;
	}
	
	/**
	 * 根据平台id和组织机构代码查询是否存在该平台
	 */
	@RequestMapping("/findptisexist")
	@ResponseBody
	public String findptisexist(@RequestParam("owner_id") String owner_id,
			@RequestParam("zzjgdm") String zzjgdm,HttpServletRequest request){
		int a = registerService.findptisexist(owner_id, zzjgdm, request);
		return "{\"info\":\""+a+"\"}";
	}
	
	/**
	 * 忘记密码
	 * @param request
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/wjmm")
	@ResponseBody
	public String wjmm(HttpServletRequest request,@RequestParam("postData") String postData) {
		String msg = registerService.wjmm(postData,request);
		logger.info("APP_INFO:{},{}",postData,msg);
		return  msg;
	}
}

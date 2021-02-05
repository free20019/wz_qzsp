package mvc.controllers;

import helper.QrCode;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
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
@RequestMapping(value="/user")         

/**
 * 车辆用户登陆action
 * @author Administrator
 *
 */

public class UserAction {
	private UserService userService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * 用户登陆
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
		msg = userService.login(postData, request);
		request.getSession().setAttribute("validateCode","");
		logger.info("APP_INFO:{},{}",postData,msg);
		return msg;
	}
	/**
	 * 个人用户登录后个人信息
	 */
	@RequestMapping("/grdlxx")
	@ResponseBody
	public String grdlxx(HttpServletRequest request){
		String msg = userService.grdlxx(request);
		return msg;
	}
	/**
	 * 平台用户登录后平台信息
	 */
	@RequestMapping("/ptdlxx")
	@ResponseBody
	public String ptdlxx(HttpServletRequest request){
		String msg = userService.ptdlxx(request);
		return msg;
	}
	/**
	 * 企业登录管理员登陆后根据管理员查询该企业的经办人
	 */
	@RequestMapping("/qygljbr")
	@ResponseBody
	public String qygljbr(HttpServletRequest request){
		String msg = userService.qygljbr(request);
		return msg;
	}
	/**
	 * 用户登陆后查询用户审核信息
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/findyyxx")
	@ResponseBody
	public String findyyxx(HttpServletRequest request,@RequestParam("cphm") String cphm) {
		String user = (String)request.getSession().getAttribute("user");
		String id = String.valueOf(request.getSession().getAttribute("id"));
		String msg = userService.findyyxx(user,cphm,id);
		logger.info("APP_INFO:{}",msg);
		return msg;
	}
	/**
	 * 从session中获取用户信息，用来在用户添加车辆时将姓名放在查询姓名栏中
	 * 个人申请使用
	 */
	@RequestMapping("/findyhxm")
	@ResponseBody
	public String findyhxm(HttpServletRequest request){
		String yhxm = (String)request.getSession().getAttribute("yhxm");
		return "{\"info\":\""+yhxm+"\"}";
	}
	
	/**
	 * 已登陆心跳
	 */
	@RequestMapping(value = "/xt1")
	@ResponseBody
	public String xt(HttpServletRequest request) {
		String msg = "{}";
		String user = "";
		if(request.getSession().getAttribute("user") == null){
			user = (String)request.getSession().getAttribute("user");
			if(null!=user){
				TimeOutMap.map.put("null", System.currentTimeMillis());
			}
		}
//		if(null == request.getSession().getAttribute("user")){
//			return "{\"code\":510}";
//			
//		}else{
//			String user = (String)request.getSession().getAttribute("user");
//			if(user.isEmpty()){
//				return "{\"code\":510}";
//			}
//		}
		return user;
	}
	/**
	 * 非登陆心跳
	 */
	@RequestMapping(value = "/xt2")
	@ResponseBody
	public String xt2(HttpServletRequest request) {
		String msg = "{}";
		Object userObject = request.getSession().getAttribute("user");
		if(null == userObject){
			msg = "{\"code\":510}";
		}else{
			String user = (String)userObject;
			if(user.isEmpty()){
				msg = "{\"code\":510}";
			}else{
				msg = "{\"code\":520}";
			}
		}
		return msg;
	}
	/**
	 * 退出
	 */
	@RequestMapping(value = "/logout")
	@ResponseBody
	public String logout(HttpServletRequest request) {
		String msg = "{}";
		String user = (String)request.getAttribute("user");
//		userService.logout(user);
		request.getSession().removeAttribute("user");
		return msg;
	}
	/**
	 * 首页右边内容
	 */
	@RequestMapping("/indexinfo")
	@ResponseBody
	public String indexinfo(){
		String msg = userService.indexinfo();
		return msg;
	}
	/**
	 * 通知通告
	 */
	@RequestMapping("/findzcfg")
	@ResponseBody
	public String findzcfg(){
		String msg = userService.findzcfg();
		return msg;
	}
	@RequestMapping("findtp")
	@ResponseBody
	public String findtp(){
		String msg = userService.findtp();
		return msg;
	}
	@RequestMapping(value="/pic")
	public synchronized void getPic(HttpServletRequest request,
			HttpServletResponse response,@RequestParam("id") String id){
		userService.getFile(request, response,id);
	}
	@RequestMapping("/findtzgg")
	@ResponseBody
	public String findtzgg(){
		String msg = userService.findtzgg();
		return msg;
	}
	@RequestMapping("/tzggsession")
	@ResponseBody
	public String tzggsession(@RequestParam("info") String info,HttpServletRequest request){
		request.getSession().setAttribute("tzggsession", info);
		System.out.println(request.getSession().getAttribute("tzggsession"));
		return "{\"info\":\""+info+"\"}";
	}
	@RequestMapping("/tzggjtnr")
	@ResponseBody
	public String tzggjtnr(HttpServletRequest request){
		String tzggsession = String.valueOf(request.getSession().getAttribute("tzggsession"));
		String msg = userService.tzggjtnr(tzggsession);
		return msg;
	}
	@RequestMapping("/fjfile")
	public synchronized void getfjfile(HttpServletRequest request,
			HttpServletResponse response,@RequestParam("id") String id){
		userService.getfjfile(request, response,id);
	}
}

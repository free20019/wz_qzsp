package mvc.controllers;

import helper.QrCode;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.service.EditinfoService;
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
@RequestMapping(value="/EditInfo")         

/**
 * 个人、企业、平台修改信息和企业、平台增删改经办人Action
 * @author Administrator
 *
 */

public class EditinfoAction {
	private EditinfoService editinfoService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public EditinfoService getEditinfoService() {
		return editinfoService;
	}
	@Autowired
	public void setEditinfoService(EditinfoService editinfoService) {
		this.editinfoService = editinfoService;
	}

	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/gredit")
	@ResponseBody
	public String gredit(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
		msg = editinfoService.gredit(postData, request);
		return msg;
	}
	@RequestMapping("/QyEdit")
	@ResponseBody
	public String qyedit(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.QyEdit(postData, request);
		return msg;
	}
	/**
	 * 企业添加经办人
	 * @param request
	 * @param postData
	 * @return
	 */
	@RequestMapping("/addqyjbr")
	@ResponseBody
	public String addqyjbr(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.addqyjbr(postData, request,"0");
		return msg;
	}
	/**
	 * 企业修改经办人
	 * @param request
	 * @param postData
	 * @return
	 */
	@RequestMapping("/editqyjbr")
	@ResponseBody
	public String editqyjbr(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.addqyjbr(postData, request,"1");
		return msg;
	}
	/**
	 * 企业删除经办人
	 * @param request
	 * @param postData
	 * @return
	 */
	@RequestMapping("/QyDel")
	@ResponseBody
	public String QyDel(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.QyDel(postData,request);
		return msg;
	}
	@RequestMapping("/PtEdit")
	@ResponseBody
	public String PtEdit(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.PtEdit(postData, request);
		return msg;
	}
	@RequestMapping("PtJbr")
	@ResponseBody
	public String PtJbr(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.PtJbr(request,postData);
		return msg;
	}
	@RequestMapping("findzjhm")
	@ResponseBody
	public String findzjhm(HttpServletRequest request,@RequestParam("zjhm") String zjhm){
		String msg = editinfoService.findzjhm(zjhm);
		return msg;
	}
	@RequestMapping("/grjszdb")
	@ResponseBody
	public String grjszdb(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.grjszdb(postData,request);
		return msg;
	}
	@RequestMapping("/findqyzjhm")
	@ResponseBody
	public String findqyzjhm(HttpServletRequest request,@RequestParam("zjhm") String zjhm){
		String msg = editinfoService.findqyzjhm(zjhm);
		return msg;
	}
	@RequestMapping("/ptdbqy")
	@ResponseBody
	public String ptdbqy(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = editinfoService.ptdbqy(postData,request);
		return msg;
	}
}

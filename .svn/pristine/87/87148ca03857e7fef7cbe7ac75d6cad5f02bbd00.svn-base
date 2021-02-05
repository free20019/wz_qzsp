package mvc.controllers;

import helper.QrCode;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.service.CommonService;
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
@RequestMapping(value="/upload")         

/**
 * 图片提交action
 * @author Administrator
 *
 */

public class uplodeAction {
	private CommonService commonService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public CommonService getCommonService() {
		return commonService;
	}
	@Autowired
	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}
	/**
	 * 保存图片企业用户注册
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/upload_qyzc")
	@ResponseBody
	public String upload_qyzc(HttpServletRequest request,HttpServletResponse response) {
		String msg = "";
	  logger.info(msg);
	  msg = commonService.upload(request, response,"0");
	  return msg;
	}
	/**
	 * 企业管理员添加经办人
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/upload_tjjbr")
	@ResponseBody
	public String upload_tjjbr(HttpServletRequest request,HttpServletResponse response) {
		String msg = "";
	  logger.info(msg);
	  msg = commonService.upload(request, response,"1");
	  return msg;
	}
	/**
	 * 驾驶员证提交
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/upload_rytj")
	@ResponseBody
	public String upload_rytj(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "2");
		return msg;
	}
	/**
	 * 车辆运输证提交../../../clyszsq/upload_bczl
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/upload_ysztj")
	@ResponseBody
	public String upload_ysztj(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "3");
		return msg;
	}
	/**
	 * 车辆补充资料提交../../../clyszsq/upload_bczl
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/upload_bczl")
	@ResponseBody
	public String upload_bczl(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "4");
		return msg;
	}
	/**
	 * 平台代办企业账号，增加组织机构代码证
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/uploadqydb")
	@ResponseBody
	public String uploadqydb(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "5");
		return msg;
	}
	/**
	 * 车辆添加时需要裁剪图片，将base64编码上传，转成图片
	 */
	@RequestMapping("/base64")
	@ResponseBody
	public String base64(HttpServletRequest request,HttpServletResponse response,@RequestParam("postData") String postData){
		String msg = commonService.base64(request, response, postData);
		return msg;
	}

	/**
	 * 改装奖补申请
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/upload_gzjbsq")
	@ResponseBody
	public String upload_gzjbsq(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "6");
		return msg;
	}
	/**
	 * 更新奖补申请
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/upload_gxjbsq")
	@ResponseBody
	public String upload_gxjbsq(HttpServletRequest request,HttpServletResponse response){
		String msg = commonService.upload(request, response, "7");
		return msg;
	}
}

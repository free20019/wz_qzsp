package mvc.controllers;

import helper.DownloadAct;
import helper.QrCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.service.CommonService;
import mvc.service.UserService;
import mvc.service.ZxzcUplodeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/zxzcupload")         

/**
 * 图片提交action
 * @author Administrator
 *
 */

public class ZxzcuplodeAction {
	private ZxzcUplodeService zxzcUplodeService;
	private DownloadAct downloadAct = new DownloadAct();
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ZxzcUplodeService getZxzcUplodeService() {
		return zxzcUplodeService;
	}
	@Autowired
	public void setZxzcUplodeService(ZxzcUplodeService zxzcUplodeService) {
		this.zxzcUplodeService = zxzcUplodeService;
	}
	
	/**
	 * 所有注册注销记录
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/zc")
	@ResponseBody
	public String zc(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
	  logger.info(msg);
	  msg = zxzcUplodeService.zc(request, postData,"0");
	  return msg;
	}
	
	/**
	 * 查询记录导出
	 * @param postData
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value = "/dc")
	@ResponseBody
	public String zcexcel(@RequestParam("postData") String postData,HttpServletRequest request,HttpServletResponse response) throws IOException {
		String a[] = {"公司名称","姓名","身份证","手机号码","车牌号码","业务类型","审核状态","注册时间","注册审核时间","注销时间","注销审核时间","备注"};//导出列明
		String b[] = {"COMPANY","JSYXM","JSYSFZH","JSYSJHM","CPHM","SQLX","YWTYPE","ZCSJ","ZCSHSJ","ZXSJ","ZXSHSJ","BZ"};//导出map中的key
		String gzb = "注册注销信息表";//导出sheet名和导出的文件名
		String msg = zxzcUplodeService.zcexcel(request, postData);
		List<Map<String, Object>>list = downloadAct.parseJSON2List(msg);//导出的数据
		downloadAct.download(request,response,a,b,gzb,list);
		return null;
	}
	
	/**
	 * 注销的记录
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/zxcx")
	@ResponseBody
	public String zxcx(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
	  logger.info(msg);
	  msg = zxzcUplodeService.zxcx(request, postData);
	  return msg;
	}
	
	/**
	 * 插入企业用户注册信息
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insert(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
	  logger.info(msg);
	  msg = zxzcUplodeService.insert(request, postData);
	  return msg;
	}
	
	/**
	 * 保存图片企业用户注册
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/upload_zc")
	@ResponseBody
	public String upload_zc(HttpServletRequest request,HttpServletResponse response) {
		String msg = "";
	  logger.info(msg);
	  msg = zxzcUplodeService.upload_zc(request, response,"0");
	  return msg;
	}
	/**
	 * 保存图片企业用户注销
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/upload_zx")
	@ResponseBody
	public String upload_zx(HttpServletRequest request,HttpServletResponse response) {
		String msg = "";
	  logger.info(msg);
	  msg = zxzcUplodeService.upload_zc(request, response,"1");
	  return msg;
	}
}

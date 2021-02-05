package mvc.controllers;

import helper.QrCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.dao.DownloadAct;
import mvc.service.DBService;
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
@RequestMapping(value="/db")         

/**
 * 平台代办action
 * @author Administrator
 *
 */

public class DBAction {
	private DBService dbService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public DBService getDbService() {
		return dbService;
	}
	@Autowired
	public void setDbService(DBService dbService) {
		this.dbService = dbService;
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
	@RequestMapping(value = "/dbjsycx")
	@ResponseBody
	public String dbjsycx(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
		msg = dbService.dbjsycx(request,postData);
		return msg;
	}
	/**
	 * 驾驶员excle导出
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/dbjsycxexcle")
	@ResponseBody
	public String dbjsycxexcle(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("postData") String postData) throws IOException{
		String a[] = {"驾驶员姓名","手机号码","代办人","办理状态"};//导出列明
		String b[] = {"XM","SJHM","JBRXM","DQZT"};//导出map中的key
		String gzb = "办理中驾驶员证";//导出sheet名和导出的文件名
		String msg = dbService.dbjsycx(request,postData);
		List<Map<String, Object>>list = DownloadAct.parseJSON2List2(msg);
		DownloadAct.download(request,response,a,b,gzb,list);
		return null;
	}
	@RequestMapping("/tym")
	@ResponseBody
	public String tym(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = dbService.tym(postData,request);
		return msg;
	}
	@RequestMapping("/tbsh")
	@ResponseBody
	public String tbsh(HttpServletRequest request){
		String msg = dbService.tbsh(request);
		return msg;
	}
	@RequestMapping("/ksyyzm")
	@ResponseBody
	public String ksyyzm(HttpServletRequest request){
		String msg = dbService.ksyyzm(request);
		return msg;
	}
	@RequestMapping("/ksjg")
	@ResponseBody
	public String ksjg(HttpServletRequest request){
		String msg = dbService.ksjg(request);
		return msg;
	}
	@RequestMapping(value = "/dbclyszcx")
	@ResponseBody
	public String dbclyszcx(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
		msg = dbService.dbclyszcx(request,postData);
		return msg;
	}
	/**
	 * 运输证excle导出
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/dbclyszcxexcle")
	@ResponseBody
	public String dbclyszcxexcle(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("postData") String postData) throws IOException{
		String a[] = {"车牌号码","车辆所有人","手机号码","代办人","办理状态"};//导出列明
		String b[] = {"CPHM","XM","SJHM","DBRXM","DQZT"};//导出map中的key
		String gzb = "办理中运输证";//导出sheet名和导出的文件名
		String msg = dbService.dbclyszcx(request,postData);
		List<Map<String, Object>>list = DownloadAct.parseJSON2List2(msg);
		DownloadAct.download(request,response,a,b,gzb,list);
		return null;
	}
	@RequestMapping(value = "/cl_tym")
	@ResponseBody
	public String cl_tym(@RequestParam("postData") String postData,HttpServletRequest request) {
		String msg = "";
		msg = dbService.cl_tym(postData,request);
		return msg;
	}
	@RequestMapping(value = "/tbsh_cl")
	@ResponseBody
	public String tbsh_cl(HttpServletRequest request) {
		String msg = "";
		msg = dbService.tbsh_cl(request);
		return msg;
	}
	@RequestMapping(value = "/cl_last_gps")
	@ResponseBody
	public String cl_last_gps(HttpServletRequest request) {
		String msg = "";
		msg = dbService.cl_last_gps(request);
		return msg;
	}
	@RequestMapping(value = "/cx_last_gps")
	@ResponseBody
	public String cx_last_gps(@RequestParam("cphm") String cphm) {
		String msg = "";
		msg = dbService.cx_last_gps(cphm);
		return msg;
	}
}

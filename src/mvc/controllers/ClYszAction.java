package mvc.controllers;

import helper.QrCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.dao.DownloadAct;
import mvc.service.ClYszService;
import mvc.service.JsyService;
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
@RequestMapping(value="/clysz")         

/**
 * 车辆用户登陆action
 * @author Administrator
 *
 */

public class ClYszAction {
	private ClYszService clYszService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public ClYszService getClYszService() {
		return clYszService;
	}
	@Autowired
	public void setClYszService(ClYszService clYszService) {
		this.clYszService = clYszService;
	}

	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * 查询车辆vin
	 */
	@RequestMapping("czvin")
	@ResponseBody
	public String czvin(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = clYszService.czvin(request,postData);
		return msg;
	}
	/**
	 * 车辆资料提交
	 */
	@RequestMapping("clyszwnnr")
	@ResponseBody
	public String clyszwnnr(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = clYszService.clyszwnnr(request,postData);
		return msg;
	}
	/**
	 * 车辆补充资料
	 */
	@RequestMapping("bczl")
	@ResponseBody
	public String bczl(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = clYszService.bczl(request,postData);
		return msg;
	}
	/**
	 * 个人登录车辆申请记录
	 */
	@RequestMapping("clsqjl")
	@ResponseBody
	public String clsqjl(HttpServletRequest request){
		String msg = clYszService.clsqjl(request);
		return msg;
	}
	/**
	 * 企业登录车辆申请记录
	 */
	@RequestMapping("qyclsqjl")
	@ResponseBody
	public String qyclsqjl(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = clYszService.clqysqjl(request,postData);
		return msg;
	}
	@RequestMapping("qyclsqjlexcle")
	@ResponseBody
	public String qyclsqjlexcle(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("postData") String postData) throws IOException{
		String a[] = {"车牌号码","经办人","办理状态"};//导出列明
		String b[] = {"CPHM","JBRXM","DQZT"};//导出map中的key
		String gzb = "办理中车辆";//导出sheet名和导出的文件名
		String msg = clYszService.clqysqjl(request,postData);
		List<Map<String, Object>>list = DownloadAct.parseJSON2List2(msg);
		DownloadAct.download(request,response,a,b,gzb,list);
		return null;
	}
}

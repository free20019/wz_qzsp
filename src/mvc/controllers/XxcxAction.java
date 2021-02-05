package mvc.controllers;

import helper.QrCode;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.service.UserService;
import mvc.service.XxcxService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/xxcx")         

/**
 * 车辆用户登陆action
 * @author Administrator
 *
 */

public class XxcxAction {
	private XxcxService xxcxService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public XxcxService getXxcxService() {
		return xxcxService;
	}
	@Autowired
	public void setXxcxService(XxcxService xxcxService) {
		this.xxcxService = xxcxService;
	}

	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * 平台查询
	 */
	@RequestMapping("/ptxx")
	@ResponseBody
	public String ptxx(HttpServletRequest request){
		String msg = xxcxService.ptxx();
		return msg;
	}
	/**
	 * 平台具体信息查询
	 */
	@RequestMapping("/ptjtxx")
	@ResponseBody
	public String ptjtxx(@RequestParam("ptmc") String ptmc){
		String msg = xxcxService.ptjtxx(ptmc);
		return msg;
	}
	/**
	 * 驾驶员资格证信息查询
	 */
	@RequestMapping("/jsyjtxx")
	@ResponseBody
	public String jsyjtxx(@RequestParam("zjhm") String zjhm){
		String msg = xxcxService.jsyjtxx(zjhm);
		return msg;
	}
	/**
	 * 车辆信息查询
	 */
	@RequestMapping("/cljtxx")
	@ResponseBody
	public String cljtxx(@RequestParam("cphm") String cphm){
		String msg = xxcxService.cljtxx(cphm);
		return msg;
	}
	/**
	 * 监测站信息查询
	 */
	@RequestMapping("/cczxx")
	@ResponseBody
	public String cczxx(@RequestParam("vin") String vin){
		String msg = xxcxService.cczxx(vin);
		return msg;
	}
	/**
	 * GPS信息查询
	 */
	@RequestMapping("/gpsxx")
	@ResponseBody
	public String gpsxx(@RequestParam("cphm") String cphm){
		String msg = xxcxService.gpsxx(cphm);
		return msg;
	}
	/**
	 * 初审功过车辆查询
	 */
	@RequestMapping("/cstg")
	@ResponseBody
	public String cstg(@RequestParam("cphm") String cphm){
		String msg = xxcxService.cstgcl(cphm);
		return msg;
	}
}

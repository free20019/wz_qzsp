package mvc.controllers;

import helper.QrCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.dao.DownloadAct;
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
@RequestMapping(value="/jsy")         

/**
 * 车辆用户登陆action
 * @author Administrator
 *
 */

public class JsyAction {
	private JsyService jsyService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public JsyService getJsyService() {
		return jsyService;
	}
	@Autowired
	public void setJsyService(JsyService jsyService) {
		this.jsyService = jsyService;
	}

	public String yhhc = "";
	
	public String getYhhc() {
		return yhhc;
	}
	public void setYhhc(String yhhc) {
		this.yhhc = yhhc;
	}
	/**
	 * 平台代办根据手机号码查询被代办用户的信息
	 */
	@RequestMapping("findbdbxx")
	@ResponseBody
	public String findbdbxx(HttpServletRequest request){
		String msg = jsyService.findbdbxx(request);
		return msg;
	}
	/**
	 * 驾驶员资料提交
	 */
	@RequestMapping("jsyxxtj")
	@ResponseBody
	public String jsyxxtj(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = jsyService.jsyxxtj(postData,request);
		return msg;
	}
	/**
	 * 个人资料提交短信验证
	 */
	@RequestMapping("grtj_dxyz")
	@ResponseBody
	public String grtj_dxyz(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = jsyService.grtj_dxyz(request,postData);
		return msg;
	}
	/**
	 * 个人账号驾驶员登录，查询自己最后一次申请记录
	 */
	@RequestMapping("jsysqjl")
	@ResponseBody
	public String jsysqjl(HttpServletRequest request){
		String msg = jsyService.jsysqjl(request);
		return msg;
	}
	/**
	 * 改装奖补申请
	 * */
	@RequestMapping("/gzjbsq")
	@ResponseBody
	public String gzjbsq(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = jsyService.gzjbsq(request,postData);
		return msg;
	}
	/**
	 * 查询奖补申请
	 * */
	@RequestMapping("/getJbsq")
	@ResponseBody
	public String getJbsq(HttpServletRequest request,String cphm,String sqlx,String blzt
			,int page,int pageSize,String stime,String etime,String spsjstime,String spsjetime){
		String msg = jsyService.getJbsq(cphm,sqlx,blzt,page,pageSize,request,stime,etime,spsjstime,spsjetime);
		return msg;
	}
	@RequestMapping("getJbsqexcle")
	@ResponseBody
	public String getJbsqexcle(HttpServletRequest request,
			HttpServletResponse response
			,String cphm,String sqlx,String blzt,int page,int pageSize,String stime,String etime,String spsjstime,String spsjetime) throws IOException{
		String a[] = {"车牌号码","申请时间","车辆所有人","联系电话","奖补类型","奖补金额","审核时间","办理状态"};//导出列明
		String b[] = {"CPHM","TIME","XM","LXDH","LX","JBJE","SHSJ","ZT"};//导出map中的key
		String gzb = "出租车奖补申请";//导出sheet名和导出的文件名
		String msg = jsyService.getJbsq(cphm,sqlx,blzt,page,pageSize,request,stime,etime,spsjstime,spsjetime);
		List<Map<String, Object>>list = DownloadAct.parseJSON2List2(msg);
		DownloadAct.download(request,response,a,b,gzb,list);
		return null;
	}
	/**
	 * 更新奖补申请
	 * */
	@RequestMapping("/gxjbsq")
	@ResponseBody
	public String gxjbsq(HttpServletRequest request,@RequestParam("postData") String postData){
		String msg = jsyService.gxjbsq(request,postData);
		return msg;
	}
	@RequestMapping("/getOneJbsq")
	@ResponseBody
	public String getOneJbsq(HttpServletRequest request,String bh){
		String msg = jsyService.getOneJbsq(bh,request);
		return msg;
	}
}

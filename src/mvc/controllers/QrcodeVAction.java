package mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import mvc.service.QrcodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QrcodeVAction {
	private QrcodeService qrcodeService;
	public QrcodeService getQrcodeService() {
		return qrcodeService;
	}
	@Autowired
	public void setQrcodeService(QrcodeService qrcodeService) {
		this.qrcodeService = qrcodeService;
	}
	
	/**
	 * 车辆信息查询
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/v/{id}")
	public String qrCode(HttpServletRequest request,@PathVariable ("id") String id, Model model) {
		model.addAllAttributes(qrcodeService.listVechicle(id));
		return "qv";
	}
	/**
	 * 司机信息查询
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/d/{id}")
	public String qrCode2(HttpServletRequest request,@PathVariable ("id") String id, Model model) {
		model.addAllAttributes(qrcodeService.listDriver(id));
		return "qd";
	}
	
	/**
	 * 平台信息查询
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/p/{id}")
	public String qrCode33(HttpServletRequest request,@PathVariable ("id") String id, Model model) {
		model.addAllAttributes(qrcodeService.listPlatform(id));
		return "qp";
	}
}

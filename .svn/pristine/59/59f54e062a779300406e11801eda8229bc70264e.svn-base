package mvc.controllers;

import helper.QrCode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.cache.TimeOutMap;
import mvc.dao.DownloadAct;
import mvc.service.DBService;
import mvc.service.UserService;
import mvc.service.verifiService;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timevale.esso.model.QueryUserInfoResult;
import com.timevale.esso.service.EssoService;
import com.timevale.esso.service.impl.EssoServiceImpl;

@Controller
@RequestMapping(value="/verifi")         

/**
 * 平台代办action
 * @author Administrator
 *
 */

public class verifiAction {
	private verifiService verifiService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public verifiService getVerifiService() {
		return verifiService;
	}
	@Autowired
	public void setVerifiService(verifiService verifiService) {
		this.verifiService = verifiService;
	}
	HostnameVerifier hv = new HostnameVerifier() {  
        public boolean verify(String urlHostName, SSLSession session) {  
            System.out.println("Warning: URL Host: " + urlHostName + " vs. "  
                               + session.getPeerHost());  
            return true;  
        }  
    };  
      
    private static void trustAllHttpsCertificates() throws Exception {  
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];  
        javax.net.ssl.TrustManager tm = new miTM();  
        trustAllCerts[0] = tm;  
        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext  
                .getInstance("SSL");  
        sc.init(null, trustAllCerts, null);  
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc  
                .getSocketFactory());  
    }  
  
    static class miTM implements javax.net.ssl.TrustManager,  
            javax.net.ssl.X509TrustManager {  
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {  
            return null;  
        }  
  
        public boolean isServerTrusted(  
                java.security.cert.X509Certificate[] certs) {  
            return true;  
        }  
  
        public boolean isClientTrusted(  
                java.security.cert.X509Certificate[] certs) {  
            return true;  
        }  
  
        public void checkServerTrusted(  
                java.security.cert.X509Certificate[] certs, String authType)  
                throws java.security.cert.CertificateException {  
            return;  
        }  
  
        public void checkClientTrusted(  
                java.security.cert.X509Certificate[] certs, String authType)  
                throws java.security.cert.CertificateException {  
            return;  
        }  
    } 
	/**
	 * 企业对接
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping("/compVerification")
	public String verification(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String redirectUrl = "";
		String ssotoken = request.getParameter("ssotoken");
		System.out.println("ssotoken = " + ssotoken);
		String gotoUrl = request.getQueryString();
		if (null != gotoUrl && !gotoUrl.trim().equals("")) {
			// 清理事项地址前的“goto=”标识
			gotoUrl = gotoUrl.substring(5);
			System.out.println("登录后跳转到： " + gotoUrl);
		}
		try {
			trustAllHttpsCertificates();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		HttpsURLConnection.setDefaultHostnameVerifier(hv);  
		// 2.验证获取到的法人信息数据包的有效性
		EssoService ssoService = new EssoServiceImpl();
		// 初始化项目 初始化一次就可以
		ssoService.initProject("1111564175", "40b7297768e1ba6b802e3ee6b2b7c647", "");
		QueryUserInfoResult result = ssoService.queryUserInfo(ssotoken);
		// 第二步：通过ssotoken来验证获取到的法人信息数据包的有效性,并解析出法人信息
		Map<?, ?> legalInfo = null;
		if (0 == result.getErrCode()) {
			legalInfo = result.getInfo();
		}
		// 验证失败，跳转登录失败的页面
		if (null == legalInfo || result.getErrCode() != 0) {
//			redirectUrl = "fail.html";
		} else {
			// 验证成功
			legalInfo = result.getInfo();
			System.out.println("政务服务网登录账号信息=" + legalInfo);
			// 第三步：获取政务服务网账户标识与自建系统中关联项信息，请以政务服务网中的userId作为用户关联项
			// 企业名称
			String companyName = legalInfo.get("CompanyName").toString();
			if (null != companyName) {
				System.out.println("企业名称 = " + companyName);
			}

			// 机构代码号
			String orgNumber = null;
			Object orgNumberObj = legalInfo.get("OrganizationNumber");
			if (null != orgNumberObj) {
				orgNumber = orgNumberObj.toString();
				System.out.println("机构代码号 = " + orgNumber);
			}
			if(orgNumber!=null&&orgNumber.length()>0){
				int a = verifiService.finduser(orgNumber,request);
				if(a == 0){
					return "redirect:/app/html/userInfo/qyInfo.html";
				}else{
					request.setAttribute("companyName", String.valueOf(companyName));
					request.setAttribute("orgNumber", String.valueOf(orgNumber));
					request.setAttribute("type", 0);
					return "forward:/app/html/zcxx/zctx1.jsp";
				}
			}else {
				return "forward:/logerr.jsp";
			}
		}
		return "forward:/logerr.jsp";
	}
	@RequestMapping(value = "/perVerification")
	public String verfication(@RequestParam("ticket") String ticket,HttpServletRequest request) {
		System.out.println("$$$$$$$$$         "+ticket);
		String msg = verifiService.verfication(ticket);
		System.out.println("@@@@@@@   "+msg);
		JSONObject o = JSONObject.fromObject(msg);
		if(o.getString("type").equals("0")){
			if(o.getString("html").equals("0")){
				verifiService.login(o.getString("user"),o.getString("pwd"), request);
				return "redirect:/app/html/userInfo/grInfo.html";
			}else{
				JSONObject data = JSONObject.fromObject(o.getString("data"));
				System.out.println("****     "+data);
				request.setAttribute("sex", data.getString("sex"));
				request.setAttribute("username", data.getString("username"));
				request.setAttribute("sjhm", data.getString("mobile"));
				request.setAttribute("zjhm", data.getString("idnum"));
				request.setAttribute("type", 1);
				return "forward:/app/html/zcxx/zctx.jsp";
			}
		}else{
			request.setAttribute("errmsg", o.getString("info"));
			return "forward:/logerr.jsp";
		}
	}
}

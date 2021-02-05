package mvc.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Router implements Filter {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public void destroy() {

	}
	
	
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		Enumeration names = request.getParameterNames();
		StringBuffer output = new StringBuffer();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			output.append(name + "=");
			String values[] = request.getParameterValues(name);
			for (int i = 0; i < values.length; i++) {
				if (i > 0) {
					output.append("' ");
				}
				output.append(values[i]);
			}
			if (names.hasMoreElements()) {
				output.append("&");
			}
		}
		request.setAttribute("postLog", output); 
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control","no-cache");

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		String user = "asd";
		String contextPath = request.getRequestURL().toString();
//		String origin = request.getHeader("Origin");
//		response.setHeader("Access-Control-Allow-Origin", origin == null ? "*"
//				: origin);
//		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		String method = request.getMethod();
		// if(method.toUpperCase().equals("OPTIONS")){
		// response.setHeader("Access-Control-Allow-Origin", "*");
		// response.setHeader("Access-Control-Allow-Credentials", "true");
		// }
//		if (null == user && !method.toUpperCase().equals("OPTIONS")) {
//			if (contextPath.indexOf("/common/login") >= 0
//					|| contextPath.indexOf("/common/logout") >= 0
//					|| contextPath.indexOf("/login.html") >= 0
//					|| contextPath.indexOf("/index.html") >= 0
//					|| contextPath.indexOf("/demo.html") >= 0
//					|| contextPath.indexOf("/imgs/") >= 0
//					|| contextPath.indexOf("/app/") >= 0
//					|| contextPath.indexOf("/resources/") >= 0
//					|| contextPath.indexOf("/libs/") >= 0) {
//
//			} else {
//				// PrintWriter p = response.getWriter();
//				// p.write("{\"code\":300}");
//				// p.flush();
//				// p.close();
//				response.sendRedirect("/");
//				return;
//			}
//
//		}
		try {
			arg2.doFilter(arg0, arg1);
		} catch (IOException e) {
			logger.error("maybe client abort1");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("maybe client abort2");
		}
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
}

package mvc.listener;
import java.util.HashMap;  
import java.util.Map;  
  

import javax.servlet.http.HttpSession;  
import javax.servlet.http.HttpSessionAttributeListener;  
import javax.servlet.http.HttpSessionBindingEvent;  
import javax.servlet.http.HttpSessionEvent;  
import javax.servlet.http.HttpSessionListener;  
  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  
  
/** 
 * @Description: session监听器 用户唯一登录，后登陆挤掉先登录的 
 * @author whl 
 * @date 2014-10-21 
 */  
  
public class SessionListener implements HttpSessionListener,  
        HttpSessionAttributeListener {  
  
	private Logger logger = LoggerFactory.getLogger(this.getClass());
    // 保存当前登录的所有用户  
    public static Map<String, HttpSession> loginUser = new HashMap<String, HttpSession>();  
  
    // 用这个作为session中的key  
    public static String SESSION_LOGIN_NAME = "user";  
  
    // 执行setAttribute的时候, 当这个属性本来不存在于Session中时, 调用这个方法.  
    @Override  
    public void attributeAdded(HttpSessionBindingEvent se) {  
    	logger.info("attributeAdded:"+se.getName()+","+se.getValue());
        // 如果添加的属性是用户名, 则加入map中  
        if (se.getName().equals(SESSION_LOGIN_NAME)) {  
           String u = (String) se.getValue();  
            HttpSession session = loginUser.remove(u);  
            if (session != null) {  
            	logger.info(session.getId());
            	if(!se.getSession().getId().equals(session.getId())){
            		session.removeAttribute("user");  
            	}
            }  
            loginUser.put(u, se.getSession());  
        }  
  
    }  
  
    // 当执行removeAttribute时调用的方法  
    @Override  
    public void attributeRemoved(HttpSessionBindingEvent se) {  
        // 如果移除的属性是用户名, 则从map中移除  
    	logger.info("attributeRemoved:"+se.getName()+","+se.getValue()+","+se.getSession().getId());  
        if (se.getName().equals(SESSION_LOGIN_NAME)) {  
            try {  
            	if(null  != se.getSession().getAttribute("user")){
            		String u = (String) se.getSession().getAttribute("user");  
            		loginUser.remove(u);  
            	}
            } catch (Exception e) {  
            	logger.error("app_error:",e);  
            }  
        }  
    }  
  
    // 当执行setAttribute时 ,如果这个属性已经存在, 覆盖属性的时候, 调用这个方法  
    @Override  
    public void attributeReplaced(HttpSessionBindingEvent se) {  
        // 如果改变的属性是用户名, 则跟着改变map  
    	logger.info("attributeReplaced:"+se.getName()+","+se.getValue());  
        if (se.getName().equals(SESSION_LOGIN_NAME)) {  
  
            String u = (String) se.getValue();  
            HttpSession session = loginUser.remove(u);  
            /*if (session != null) { 
                session.removeAttribute("user"); 
            }*/  
            loginUser.put(u, se.getSession());  
        }  
    }  
  
    // session创建时调用这个方法  
    @Override  
    public void sessionCreated(HttpSessionEvent se) {  
    	logger.debug("SessionListener........session创建-----"  
                + se.getSession().getId());  
    }  
  
    // Session失效或者过期的时候调用的这个方法,  
    @Override  
    public void sessionDestroyed(HttpSessionEvent se) {  
        // 如果session超时, 则从map中移除这个用户  
        try {  
            String u = (String) se.getSession().getAttribute("user");  
            loginUser.remove(u);  
        } catch (Exception e) {  
        	logger.error("app_error:",e); 
        }  
    }  
  
}  

package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 平台代办service
 * @author Administrator
 *
 */

@Service
public class verifiService extends MvcService{

	protected JdbcTemplate jdbcTemplate = null;
	protected JdbcTemplate jdbcTemplate2 = null;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private MessageClient messageClient = null;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate2() {
		return jdbcTemplate2;
	}

	@Autowired
	public void setJdbcTemplate2(JdbcTemplate jdbcTemplate2) {
		this.jdbcTemplate2 = jdbcTemplate2;
	}

	private JacksonUtil jacksonUtil = JacksonUtil.buildNormalBinder();
	public String test() {
		logger.info(jdbcTemplate+"");
		logger.info(jdbcTemplate2+"");
		return "";
	}
	public String cl_last_gps(HttpServletRequest request){
		String cphm = String.valueOf(request.getSession().getAttribute("tym_cphm"));
		String sql = "select * from TB_WYC_GPS where vehicle_no = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,cphm);
		System.out.println(sql+" "+cphm);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list!=null&&list.size()>0){
			map.put("type", "1");
		}else{
			map.put("type", "0");
		}
		return jacksonUtil.toJson(map);
	}

	public int finduser(String orgNumber, HttpServletRequest request) {
		String sql = "select * from tb_owner where zjhm = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql ,orgNumber);
		if(list.size()>0){
			String id = String.valueOf(list.get(0).get("id"));
			String sql1="select u.user_name,o.id,u.id ids,o.xm,u.jbrxm from tb_user u,tb_owner o"
					+ " where u.owner_id=o.id and type = '1' and u.is_yx='0' and o.id = '"+id+"' and is_admin = '0'";
			System.out.println(sql1);
			List <Map<String, Object>> list1=jdbcTemplate.queryForList(sql1);
			logger.info("#####login:size {} , {} ,{} \t",list1.size() );
			request.getSession().setAttribute("user", list1.get(0).get("user_name"));
			request.getSession().setAttribute("sjhm", list1.get(0).get("user_name"));
			request.getSession().setAttribute("pwd", list1.get(0).get("pass_word"));
			request.getSession().setAttribute("dlid", list1.get(0).get("id"));
			request.getSession().setAttribute("dbrid", list1.get(0).get("ids"));
			request.getSession().setAttribute("bdbrid", list1.get(0).get("id"));
			request.getSession().setAttribute("xm", list1.get(0).get("xm"));
			request.getSession().setAttribute("jbrxm", list1.get(0).get("jbrxm"));
			return 0;
		}else{
			return 1;
		}
	}
	public String verfication(String ticket){
		Map<String, Object> map = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = sdf.format(new Date());
		System.out.println(time);
//		String url = "https://puser.zjzwfw.gov.cn/sso/servlet/simpleauth";
		String url = "https://appapi.zjzwfw.gov.cn/sso/servlet/simpleauth";
		String md = Md5("wzczcsbfwwzczcsbfwpwd"+time);
		String data = "method=ticketValidation&servicecode=wzczcsbfw&time="+time+"&sign="+md+"&st="+ticket+"&datatype=json";
		String result = analysis(url, data);
		System.out.println(result.substring(1, result.length()-1).replace("\\", ""));
		JSONObject o = JSONObject.fromObject(result.substring(1, result.length()-1).replace("\\", ""));
		String json = o.getString("result");
		System.out.println(json);
		if(json.equals("0")){
			String newdata = "method=getUserInfo&servicecode=wzczcsbfw&time="+time+"&sign="+md+"&token="+o.getString("token")+"&datatype=json";
			String jg = analysis(url, newdata);
			String sjson = jg.substring(1, jg.length()-1).replace("\\", "");
			JSONObject jo = JSONObject.fromObject(sjson);
			if(jo.getString("result").equals("0")){
				map.put("type", "0");
				Map<String, String> map1 = new HashMap<String, String>();
				map1.put("sex", jo.getString("sex"));
				map1.put("username", jo.getString("username"));
				map1.put("mobile", jo.getString("mobile"));
				map1.put("idnum", jo.getString("idnum"));
				System.out.println("!!!!!  "+jo);
				System.out.println("!!!!   "+map1);
				map.put("data", map1);
				String sql = "select user_name,pass_word from tb_owner o,tb_user u where o.id=u.owner_id and zjhm = '" + jo.getString("idnum") +"' and type = '0'";
				System.out.println(sql);
				List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
				if(list.size()>0){
					map.put("html", "0");//代表用户存在返回登陆后的界面
					map.put("user", list.get(0).get("user_name"));
					map.put("pwd", list.get(0).get("pass_word"));
				}else{
					map.put("html", "1");//代表用户不存在返回注册页面
				}
			}else{
				map.put("type", "1");
				map.put("info", jo.getString("errmsg"));
			}
		}else{
			map.put("type", "1");
			map.put("info", o.getString("errmsg"));
		}
		System.out.println("###  "+map);
		return jacksonUtil.toJson(map);
	}
	/**
	 * 用户登陆
	 * @return
	 */
	public String login(String user,String pwd,HttpServletRequest request){
//		String sql=" select id,sjhm,zjhm,xm from tb_owner where type = '0' and sjhm = ? and mm = ?";
//		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql,user,pwd);
//		logger.info("#####login:size {} , {} ,{} \t",list.size() , user ,pwd);
//		if(list.size() > 0){
////			String n = paramMap.get("n").toString();
////			String hym = sfxg(n);
//			request.getSession().setAttribute("user", list.get(0).get("sjhm"));
//			request.getSession().setAttribute("id", list.get(0).get("id"));
//			request.getSession().setAttribute("yhxm", list.get(0).get("xm"));
//			request.getSession().setAttribute("zjhm", list.get(0).get("zjhm"));
//				return "{\"info\":\"登陆成功\"}";
//		}else{
//			return "{\"info\":\"用户名或密码错误\"}";
//		}
		String sql1="select u.user_name,o.id,u.id ids,o.xm,u.jbrxm from tb_user u,tb_owner o"
				+ " where u.owner_id=o.id and type = '0' and u.is_yx='0' and user_name = ? and pass_word = ?";
		System.out.println(sql1);
		List <Map<String, Object>> list1=jdbcTemplate.queryForList(sql1,user,pwd);
		logger.info("#####login:size {} , {} ,{} \t",list1.size() );
		request.getSession().setAttribute("user", list1.get(0).get("user_name"));
		request.getSession().setAttribute("sjhm", list1.get(0).get("user_name"));
		request.getSession().setAttribute("pwd", list1.get(0).get("pass_word"));
		request.getSession().setAttribute("dlid", list1.get(0).get("id"));
		request.getSession().setAttribute("dbrid", list1.get(0).get("ids"));
		request.getSession().setAttribute("bdbrid", list1.get(0).get("id"));
		request.getSession().setAttribute("xm", list1.get(0).get("xm"));
		request.getSession().setAttribute("jbrxm", list1.get(0).get("jbrxm"));
		return "{\"info\":\"登陆成功\"}";
	}
	public String Md5(String data){
		String result = "";  
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			md5.update((data).getBytes("UTF-8"));  
			byte b[] = md5.digest();  
			int i;  
			StringBuffer buf = new StringBuffer("");  
			
			for(int offset=0; offset<b.length; offset++){
				i = b[offset];
				if(i<0){  
					i+=256;  
				}
				if(i<16){  
					buf.append("0");  
				}  
				buf.append(Integer.toHexString(i));  
			}  
			
			result = buf.toString();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("result = " + result);  
		return result;
	}
	public String analysis(String url,String data){
		String result = "";
		try {
			// str = "http://huochechacha.com:7000";
			URL url1 = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty(
					"User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1096.1 Safari/536.6");
	//		conn.setRequestProperty("content-type",
	//				"application/json;charset=UTF-8");
	
			conn.setRequestProperty("Accept", "*/*");
			conn.setDoOutput(true); // 需要输出
			// conn.setDoInput(true); //需要输入
			DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
			// dos.writeBytes(message);
			dos.write(data.getBytes("utf-8"));
			// // dos.writeUTF(message);
			dos.flush();
			dos.close();
	
			if (conn.getResponseCode() == 302) {
				System.out.println(302);
				// return result;
				return null;
			}
			if (conn.getResponseCode() == 200) {
				// System.out.println(200);
	
				BufferedReader rd = new BufferedReader(new InputStreamReader(
						conn.getInputStream(), "utf-8"));
				StringBuffer sb = new StringBuffer();
				String s = "";
				while ((s = rd.readLine()) != null) {
					sb.append(s);
				}
				// System.out.println(sb);
				if (sb.length() == 0) {
					sb.append("[]");
				}
				result = sb.toString();
				System.out.println(result);
				rd.close();
				conn.disconnect();
	
			}
		} catch (Exception e) {
			e.printStackTrace();
	
		}
		return jacksonUtil.toJson(result);
	}
}

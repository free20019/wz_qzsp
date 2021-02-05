
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户登录service
 * @author Administrator
 *
 */

@Service
public class UserService extends MvcService{

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

		return "ok";
	}
	/**
	 * 用户登陆
	 * @return
	 */
	public String login(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String code = String.valueOf(paramMap.get("code"));
		String type = String.valueOf(paramMap.get("type"));
		Object sessionCodeObject = request.getSession().getAttribute("validateCode");
		String sessionCode = "";
		if(code.length()==0){
			return "{\"info\":\"验证码不能为空\"}";
		}
		if(!code.isEmpty() && null != sessionCodeObject ){
			sessionCode = (String) sessionCodeObject;
			logger.info(code);
			if(!sessionCode.equals(code.toUpperCase())){
				return "{\"info\":\"验证码错误\"}";
			}
		}
		String sql= "";
		if(type.equals("0")){
			sql="select u.user_name,o.id,u.id ids,o.xm,u.jbrxm,u.pass_word from tb_user u,tb_owner o where u.owner_id=o.id and type = '0' and user_name = ? and u.is_yx='0'";
		}else if(type.equals("1")){
			sql="select u.user_name,o.id,u.id ids,o.xm,u.jbrxm,u.pass_word from tb_user u,tb_owner o where u.owner_id=o.id and type = '1' and user_name = ? and u.is_yx='0'";
		}else if(type.equals("2")){
			sql="select u.user_name,o.id,u.id ids,o.xm,u.jbrxm,u.pass_word from tb_user u,tb_owner o,tb_jyzjcxx j where u.owner_id=o.id and o.id=j.owner_id and type = '2' and user_name = ? and u.is_yx='0'";
		}
		System.out.println(sql);
		String n = (String) paramMap.get("n");
		String p = (String) paramMap.get("p");
		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql,n);
		logger.info("#####login:size {} , {} ,{} \t",list.size() , n ,p);
		if(list.size() > 0){
			System.out.println(String.valueOf(list.get(0).get("PASS_WORD"))+"   "+p+"  "+String.valueOf(list.get(0).get("ID")));
			if(String.valueOf(list.get(0).get("PASS_WORD")).equals(p+String.valueOf(list.get(0).get("IDS")))){
				request.getSession().setAttribute("user", n);
				request.getSession().setAttribute("sjhm", n);
				request.getSession().setAttribute("pwd", p);
				request.getSession().setAttribute("dlid", list.get(0).get("id"));
				request.getSession().setAttribute("dbrid", list.get(0).get("ids"));
				request.getSession().setAttribute("bdbrid", list.get(0).get("id"));
				request.getSession().setAttribute("xm", list.get(0).get("xm"));
				request.getSession().setAttribute("jbrxm", list.get(0).get("jbrxm"));
				return "{\"info\":\"登陆成功\"}";
			}else {
				return "{\"info\":\"用户名或密码错误\"}";
			}
		}else{
			return "{\"info\":\"用户名或密码错误\"}";
		}
	}
	/**
	 * 个人用户登录后查询个人信息
	 */
	public String grdlxx(HttpServletRequest request){
		String user = String.valueOf(request.getSession().getAttribute("user"));
		String sql = "select * from tb_user u,tb_owner o where u.owner_id=o.id and u.user_name = '"+user+"'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 平台登录后查询平台信息
	 */
	public String ptdlxx(HttpServletRequest request){
		String user = String.valueOf(request.getSession().getAttribute("user"));
		String sql = "select * from tb_user u,tb_owner o,tb_jyzjcxx j where u.owner_id=o.id"
				+ " and o.id = j.owner_id and u.user_name = '"+user+"'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 企业登录管理员登陆后根据管理员查询该企业的经办人
	 * @param request
	 * @return
	 */
	public String qygljbr(HttpServletRequest request){
		String dlid = String.valueOf(request.getSession().getAttribute("dlid"));
		String sql = "select * from tb_user where owner_id = '"+dlid+"' and is_admin='1' and is_yx = '0'";
		System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 用户登陆后根据用户名查询该用户信息
	 * clsq = 0 当前有申请车辆  =1没有
	 * rysq=0 当前有申请人员 =1没有 =2当前有申请人员且审核不通过
	 * @param vehi_no
	 * @return
	 */
	public String findyyxx(String user,String cphm,String id){
		Map<String, Object> map = new HashMap<String, Object>();
		if(user!=null&&user.length()!=0){
			String sql = "select * from tb_owner where id = '"+id+"'";
			logger.info("1   "+sql);
			List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
			map.put("type", "0");
			map.put("data", list);
			String clsq = "select count(*) from tb_clsqxx where owner_id = '"+id+"'";
			int clsq_s = jdbcTemplate.queryForObject(clsq, Integer.class);
			if(clsq_s>0){
				map.put("clsq", "0");
				String clxx = "select * from tb_clsqxx where owner_id = '"+id+"' and cphm like '%"+cphm+"%' and sqrq in (select max(sqrq) from tb_clsqxx group by cphm) limit 0,10";
				logger.info("@@@@   "+clxx);
				List<Map<String, Object>> cl = jdbcTemplate.queryForList(clxx);
				List<Map<String, Object>> zzjg = clzt(cl);
				map.put("clxx", zzjg);
			}else{
				map.put("clsq", "1");
			}
			String rysq = "select count(*) from tb_jsysqxx where owner_id = '"+id+"'";
			int rysq_s = jdbcTemplate.queryForObject(rysq, Integer.class);
			if(rysq_s>0){
//				map.put("rysq", "0");
				int rysq_yx = 0;
				int rysq_wx = 0;
				int rysq_bnsq = 0;
				rysq_yx = jdbcTemplate.queryForObject("select count(*) from tb_jsysqxx where owner_id = '"
							+id+"' and IS_YX = '0'", Integer.class);
				rysq_wx = jdbcTemplate.queryForObject("select count(*) from tb_jsysqxx where owner_id = '"
						+id+"' and IS_YX = '1'", Integer.class);
				rysq_bnsq = jdbcTemplate.queryForObject("select count(*) from tb_jsysqxx where owner_id = '"
						+id+"' and IS_YX = '2'", Integer.class);
				if(rysq_yx>0){
					map.put("rysq", "0");
					return jacksonUtil.toJson(map);
				}
				if(rysq_wx>0){
					map.put("rysq", "2");
					return jacksonUtil.toJson(map);
				}
				if (rysq_bnsq>0) {
					map.put("rysq", "2");
					return jacksonUtil.toJson(map);
				}
			}else{
				map.put("rysq", "1");
			}
		}else{
			map.put("type", "1");
			map.put("info", "你未登录");
		}
		return jacksonUtil.toJson(map);
	}
	
	public List<Map<String, Object>> clzt(List<Map<String, Object>> list){
		logger.info("车辆info"+list);
		for(int i=0;i<list.size();i++){
			String type = "未处理";
			if((String)list.get(i).get("YGJCSYJ")!=null&&((String)list.get(i).get("YGJCSYJ")).length()>0){
				if(((String)list.get(i).get("YGJCSYJ")).equals("0")){
					type="审核通过";
				}else if(((String)list.get(i).get("YGJCSYJ")).equals("1")){
					type="审核不通过";
				}
			}
			//车管所初审  成功跳到补充资料界面
			//不通过,跳到未通过界面
			if((String)list.get(i).get("CGSCSYJ")!=null&&((String)list.get(i).get("CGSCSYJ")).length()>0){
				if(!((String)list.get(i).get("CGSCSYJ")).equals("1")){
					//审核通过
					//两个户籍类型户籍类型  前台判断长度大于2  取最后一个字符
					type="补充资料";
				}else{
					//审核不通过
					//三个户籍类型户籍类型  前台判断长度大于3  取最后一个字符
					type="审核未通过";
				}
			}
			//用户补充资料是否成功,成功跳到等待发证界面
			if((String)list.get(i).get("BCZL")!=null&&((String)list.get(i).get("BCZL")).length()>0){
				if(((String)list.get(i).get("BCZL")).equals("0")){
					type="等待发证";
				}
			}
			if(list.get(0).get("YGJZSYJ")!=null&&list.get(0).get("YGJZSYJ").toString().length()>0){
				if(list.get(0).get("YGJZSYJ").toString().equals("0")){
					type="终审通过";
				}else{
					type="终审未通过";
				}
			}
			list.get(i).put("dq_zt", type);
		}
		return list;
	}

	public String indexinfo() {
		String sql = "select * from tb_index_info where is_del = '0' order by add_time desc";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 通知通告
	 * @return
	 */
	public String findzcfg(){
		String sql = "select * from TB_TZGG where is_del = '0' and type = '2' order by fssj desc";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 图片
	 * @param request
	 * @param response
	 */
	public String findtp(){
		String sql = "select * from TB_TZGG where is_del = '0' and type = '0' order by fssj desc";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	public void getFile(HttpServletRequest request, HttpServletResponse response,String id) {
		try {
			if (null != id && !id.isEmpty()) {
				List<Map<String, Object>> list = null;
				list = jdbcTemplate
						.queryForList("select fjaddress from TB_TZGG where id = ?",id);
				if (list.size() == 1) {
					String path = (String) list.get(0).get("FJADDRESS");
					logger.info(path);
					File pf = new File(path);
					FileInputStream fin = new FileInputStream(pf);
					ServletOutputStream fout = response.getOutputStream();
					byte bts[] = new byte[fin.available()];
					fin.read(bts);
					fout.write(bts);
					fin.close();
					fout.close();
				}
			}
		} catch (Exception e) {
			logger.error("app_error", e);
		}
	}
	public String findtzgg(){
		String sql = "select * from TB_TZGG where is_del = '0' and type = '1' order by fssj desc";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}

	public String tzggjtnr(String tzggsession) {
		String sql = "select * from TB_TZGG where is_del = '0' and id = '"+tzggsession+"'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	public void getfjfile(HttpServletRequest request, HttpServletResponse response,String id) {
		 // 下载本地文件
        // 读到流中
        List<Map<String, Object>> list = null;
		String tzggsession = String.valueOf(request.getSession().getAttribute("tzggsession"));
		list = jdbcTemplate
				.queryForList("select fjaddress,fjname from TB_TZGG where id = ?",tzggsession);
		InputStream inStream = null;
		String pash = String.valueOf(list.get(0).get("FJADDRESS")).replace("\\\\", "\\").split(";")[Integer.parseInt(id)];
		System.out.println(pash);
		String kzm = pash.split("\\.")[1];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String fileName = String.valueOf(list.get(0).get("FJNAME")).split(";")[Integer.parseInt(id)]+"."+kzm; // 文件的默认保存名
		System.out.println(fileName);
        try {
			inStream = new FileInputStream(pash);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}// 文件的存放路径
        // 设置输出的格式
        response.reset();
        response.setContentType("bin");
        try {
			response.addHeader("Content-Disposition", "attachment; filename=\"" + new String(fileName.getBytes("UTF-8"),"ISO8859-1") + "\"");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//		try {
//			if (null != id && !id.isEmpty()) {
//				List<Map<String, Object>> list = null;
//				String tzggsession = String.valueOf(request.getSession().getAttribute("tzggsession"));
//				list = jdbcTemplate
//						.queryForList("select fjaddress from TB_TZGG where id = ?",tzggsession);
//				if (list.size() == 1) {
//					String path = String.valueOf(list.get(0).get("FJADDRESS")).replace("\\\\", "\\").split(";")[Integer.parseInt(id)];
//					logger.info(path);
//					File pf = new File(path);
//					FileInputStream fin = new FileInputStream(pf);
//					ServletOutputStream fout = response.getOutputStream();
//					byte bts[] = new byte[fin.available()];
//					fin.read(bts);
//					fout.write(bts);
//					fin.close();
//					fout.close();
//				}
//			}
//		} catch (Exception e) {
//			logger.error("app_error", e);
//		}
	}
}

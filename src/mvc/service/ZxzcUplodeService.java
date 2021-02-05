package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;
import helper.SystemConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class ZxzcUplodeService{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private Random random = new Random();
	protected JdbcTemplate jdbcTemplate = null;
	protected JdbcTemplate jdbcTemplate2 = null;
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


	public String zc(HttpServletRequest request, String postData,
			String string) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String jsyname = String.valueOf(paramMap.get("jsyname"));
		String zjhm = String.valueOf(paramMap.get("zjhm"));
		String bzzt = String.valueOf(paramMap.get("bzzt"));
		int page = Integer.parseInt(paramMap.get("page")+"");
		int pageSize = Integer.parseInt(paramMap.get("pagesize")+"");
		
		//当前用户
		String user = request.getSession().getAttribute("user").toString();
		//企业名称
		String str ="select v.qymc,v.id from TB_USER t, TB_OWNER v where t.owner_id = v.id and t.user_name = '"+user+"' and is_yx = 0";
		List <Map<String, Object>> list1=jdbcTemplate.queryForList(str);
		String companyid = list1.get(0).get("ID").toString();
		request.getSession().setAttribute("companyid", companyid);
		
		String tj ="";
		if(jsyname!=null&&!jsyname.isEmpty()){
			tj +="and t1.jsyxm like '%"+jsyname+"%'";
		}
		if(zjhm!=null&&!zjhm.isEmpty()){
			tj +="and t1.jsysfzh like '%"+zjhm+"%'";
		}
		if(bzzt!=null&&!bzzt.isEmpty()){
			if (bzzt.equals("1")) {
				tj +="and t1.sqlx ='0' and t1.ywtype = '0'";
			}else if(bzzt.equals("2")){
				tj +="and t1.sqlx ='0' and t1.ywtype = '2'";
			}else if(bzzt.equals("3")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '0'";
			}else if(bzzt.equals("4")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '2'";
			}else if(bzzt.equals("5")){
				tj +="and t1.sqlx ='0' and t1.ywtype = '1'";
			}else if(bzzt.equals("6")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '1'";
			}else {
				tj +="";
			}
		}
		String sql ="select (select count(*) from (select * from TB_XYCZCGL t1 where 1 = 1 and companyid ='"+companyid+"'";
		sql += tj;
		sql +=	")) as count, tt.* from (select t.*, rownum as rn from (select * from TB_XYCZCGL t1 where 1 = 1 and companyid ='"+companyid+"'";
		sql += tj;
		sql +="  order by case when t1.zxsj is not null then t1.zxsj when t1.zcsj is not null then t1.zcsj else null end desc ) t where rownum <= " + (page * pageSize)
				+ ") tt where tt.rn > " + ((page - 1) * pageSize);
		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		System.out.println(sql);
		Map<String, Object> m = new HashMap<String, Object>();
		String count;
		if(list.size() == 0){
			count = "0";
		}else{
			count = list.get(0).get("COUNT").toString();
		}
		m.put("datas", list);
		m.put("count", count);
		return jacksonUtil.toJson(m);
	}
	
	public String zcexcel(HttpServletRequest request, String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String jsyname = String.valueOf(paramMap.get("jsyname"));
		String zjhm = String.valueOf(paramMap.get("zjhm"));
		String bzzt = String.valueOf(paramMap.get("bzzt"));
		
		String companyid = request.getSession().getAttribute("companyid").toString();
		
		String tj ="";
		if(jsyname!=null&&!jsyname.isEmpty()){
			tj +="and t1.jsyxm like '%"+jsyname+"%'";
		}
		if(zjhm!=null&&!zjhm.isEmpty()){
			tj +="and t1.jsysfzh like '%"+zjhm+"%'";
		}
		if(bzzt!=null&&!bzzt.isEmpty()){
			if (bzzt.equals("1")) {
				tj +="and t1.sqlx ='0' and t1.ywtype = '0'";
			}else if(bzzt.equals("2")){
				tj +="and t1.sqlx ='0' and t1.ywtype = '2'";
			}else if(bzzt.equals("3")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '0'";
			}else if(bzzt.equals("4")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '2'";
			}else if(bzzt.equals("5")){
				tj +="and t1.sqlx ='0' and t1.ywtype = '1'";
			}else if(bzzt.equals("6")){
				tj +="and t1.sqlx ='1' and t1.ywtype = '1'";
			}else {
				tj +="";
			}
		}
		String sql ="select t1.* from TB_XYCZCGL t1 where 1 = 1 and companyid ='"+companyid+"' ";
		sql += tj;
		sql +=" order by case when t1.zxsj is not null then t1.zxsj when t1.zcsj is not null then t1.zcsj else null end desc";
		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		System.out.println(sql);
		Map<String, Object> m = new HashMap<String, Object>();
		if(list.size() == 0){
		}else{
			for (int i = 0; i < list.size(); i++) {
				//申请类型
				if(list.get(i).get("SQLX").toString().equals("0")){
					list.get(i).put("SQLX","注册");
				}else {
					list.get(i).put("SQLX","注销");
				}
				//审核状态
				if(list.get(i).get("YWTYPE").toString().equals("0")){
					list.get(i).put("YWTYPE","成功");
				}else if(list.get(i).get("YWTYPE").toString().equals("1")){
					list.get(i).put("YWTYPE","失败");
				}else{
					list.get(i).put("YWTYPE","待审核");
				}
				//有效数据
				if(list.get(i).get("IS_YX").toString().equals("0")){
					list.get(i).put("IS_YX","有效");
				}else {
					list.get(i).put("IS_YX","无效");
				}
				//4个时间戳
				if (list.get(i).get("ZCSJ")!= null) {
					list.get(i).put("ZCSJ",changeType(list.get(i).get("ZCSJ").toString()));
				}
				if (list.get(i).get("ZCSHSJ")!= null) {
					list.get(i).put("ZCSHSJ",changeType(list.get(i).get("ZCSHSJ").toString()));		
				}
				if (list.get(i).get("ZXSJ")!= null) {
					list.get(i).put("ZXSJ",changeType(list.get(i).get("ZXSJ").toString()));
				}
				if (list.get(i).get("ZXSHSJ")!= null) {
					list.get(i).put("ZXSHSJ",changeType(list.get(i).get("ZXSHSJ").toString()));
				}
			}
		}
		m.put("datas", list);
		m.put("count", "1");
		return jacksonUtil.toJson(m);
	}
	
	public String changeType(String obj){
        return obj.substring(0,11);
	}

	public String insert(HttpServletRequest request, String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String xm = String.valueOf(paramMap.get("xm"));
		String sfzh = String.valueOf(paramMap.get("sfzh"));
		String sjhm = String.valueOf(paramMap.get("sjhm"));
		String cphm = String.valueOf(paramMap.get("cphm"));
		String zcid = request.getSession().getAttribute("zcid").toString();
		String user = request.getSession().getAttribute("user").toString();
		String type = request.getSession().getAttribute("zczxtype").toString();
		Map <String,Object>map = new HashMap<String,Object>();
		
		//排重复操作  删除插进去的记录
//		String sql1 ="select * from TB_XYCZCGL t where t.jsyxm = '"+xm+"' and t.jsysfzh = '"+sfzh+"' and t.sqlx = '"+type+"' and is_yx = 0";
//		List <Map<String, Object>> list1=jdbcTemplate.queryForList(sql1);
//		logger.info(sql1);
//		logger.info(list1.size()+"");
//		if (list1.size()>0) {
//			jdbcTemplate.update("delete from TB_XYCZCGL where id= '"+zcid+"'");
//			map.put("data", "重复");
//		}else{
			//企业名称
			String sql ="select v.qymc,v.id from TB_USER t, TB_OWNER v where t.owner_id = v.id and t.user_name = '"+user+"' and is_yx = 0";
			List <Map<String, Object>> list=jdbcTemplate.queryForList(sql);
			String companyid = list.get(0).get("ID").toString();
			String qymc = list.get(0).get("QYMC").toString();
			
			//插库操作
			String str = "";
			//type为0时  注册   1时注销
			if(type.equals("0")){
				str="update TB_XYCZCGL set jsyxm = '"+xm+"',company = '"+qymc+"',jsysfzh = '"+sfzh+"',"
						+ "jsysjhm = '"+sjhm+"',cphm ='"+cphm+"',companyid ='"+companyid+"',sqlx ='0',ywtype=2,"
						+ "zcsj=to_date(to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'),'yyyy-mm-dd hh24:mi:ss'), is_yx=0,bj=1  where id = '"+zcid+"'";
			}else {
				str="update TB_XYCZCGL set jsyxm = '"+xm+"',company = '"+qymc+"',jsysfzh = '"+sfzh+"',"
						+ "jsysjhm = '"+sjhm+"',cphm ='"+cphm+"',companyid ='"+companyid+"',sqlx ='1',ywtype=2,"
						+ "zxsj=to_date(to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'),'yyyy-mm-dd hh24:mi:ss'), is_yx=0,bj=1  where id = '"+zcid+"'";
			}
			logger.info(str);
			int count=jdbcTemplate.update(str);
			
			
			//更新表完成后   插入提醒数据操作
			if (count > 0) {
				String ss = "insert into tb_bgzs(sendtype,slevel,title,scontent,iid,lx,bj)"
						+ " values(1,1,'申报信息提示','有巡游车申报记录,待审核',15001,2,1)";
				jdbcTemplate.update(ss);
			}
			map.put("data", "OK");
//		}
        return jacksonUtil.toJson(map);
	}
	

	public String upload_zc(HttpServletRequest request,
		HttpServletResponse response, String type) {
		 String zcid = (System.currentTimeMillis()+"").substring(3);
		 request.getSession().setAttribute("zcid", zcid);
		 request.getSession().setAttribute("zczxtype", type);
    	 jdbcTemplate.update("insert into TB_XYCZCGL(id) values('"+zcid+"')");
		Map <String,Object>map = new HashMap<String,Object>();
		List <String> filenames = new ArrayList<String>();
		logger.info(ServletFileUpload.isMultipartContent(request)+"");
        if (ServletFileUpload.isMultipartContent(request)) {
        	String saveAsFileName = "";
        	logger.info("upload post");
        	 ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
             PrintWriter writer = null;
             response.setContentType("application/json");
             try {
                 List<FileItem> items = uploadHandler.parseRequest(request);
                 String rr = "";
                 for (FileItem item : items) {
            		 if(item.getSize()>10*1024*1000){
            			 rr+=item.getName()+",";
            		 }
            	 }
                 if(!rr.isEmpty()){
                	return "{info:'图片超过10M,无法添加,请选择不超过10M的图片!'}";
                 }
                 for (FileItem item : items) {
                	 logger.info("item.getName",item.getName());
                	 if(item.getName()!=null&&item.getName().length()>0){
                		 if (!item.isFormField()) {
                			 String fp = SystemConfig.uploadPath;
                			 fp=fp.replace("\\", "");
                			 Calendar date = Calendar.getInstance();
             		         File f = new File(fp + File.separator + date.get(Calendar.YEAR)
             		                + File.separator + (date.get(Calendar.MONTH)+1));
                			 
                			 System.out.println(fp);
                			 if(!f.exists()){
                				 f.mkdirs();
                			 }
                			 if(item.getName().isEmpty() || item.getSize()== 0){
                				 continue;
                			 }
                			 saveAsFileName = zcid+item.getFieldName()+item.getName().substring(item.getName().lastIndexOf("."));
                			 File file = new File(f.getAbsolutePath()+"\\"+saveAsFileName);
                			 item.write(file);
            				 String in = f.getAbsolutePath()+"\\"+saveAsFileName;
            				 logger.info(in);
            				 String fisrt = saveAsFileName.split("pic")[1].toString().substring(0,1);
            				 //注销模式
            				 if(type.equals("1")){
            					 if(fisrt.equals("4")){
            						 //巡游车驾驶员电子服务监督卡注销申请表
            						 logger.info("注销模式");
	            					 jdbcTemplate.update("update TB_XYCZCGL set ZX_SQB_PIC = ? where id = ?",new Object[]{in,zcid});
            					 }
            				 //注册模式 - 循环插表
            				 }else {
            					 if(fisrt.equals("1")){
            						 //出租汽车驾驶员从业资格注册登记表
            						 jdbcTemplate.update("update TB_XYCZCGL set ZC_DJPIC = ? where id = ?",new Object[]{in,zcid});
            					 }else if(fisrt.equals("2")){
            						 //经营者签订的劳动合同
            						 jdbcTemplate.update("update TB_XYCZCGL set ZC_XY_PIC1 = ? where id = ?",new Object[]{in,zcid});
            					 }else if(fisrt.equals("3")){
            						 //聘用协议或者经营合同
            						 jdbcTemplate.update("update TB_XYCZCGL set ZC_XY_PIC2 = ? where id = ?",new Object[]{in,zcid});
            					 }
            				 }
                			 filenames.add(saveAsFileName);
                		 }
                	 }
                 }
             } catch (FileUploadException e) {
            	 logger.error("app_error",e);
             } catch (Exception e) {
            	 logger.error("app_error",e);
            	 return "{\"code\":400,\"data\":\""+e.getMessage()+"\"}";
             } finally {
             }
        }
        map.put("data", "OK");
        return jacksonUtil.toJson(map);
	}

	public String zxcx(HttpServletRequest request, String postData) {
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		String id = String.valueOf(paramMap.get("id"));
		request.getSession().setAttribute("zxid", id);
		String sql ="select * from TB_XYCZCGL t where t.id = '"+id+"' and is_yx ='0'";
		List <Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		logger.info(sql);
		Map <String,Object>m = new HashMap<String,Object>();
		m.put("datas", list);
		return jacksonUtil.toJson(m);
	}

}

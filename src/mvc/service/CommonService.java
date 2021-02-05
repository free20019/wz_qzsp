package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;
import helper.SystemConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
import java.util.UUID;

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

import sun.misc.BASE64Decoder;
@Service
public class CommonService extends MvcService{
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

	public String test() {
		logger.info(jdbcTemplate+"");
		logger.info(jdbcTemplate2+"");
		return "ok";
	}
	public String base64(HttpServletRequest request,HttpServletResponse response,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
		System.out.println(String.valueOf(paramMap.get("href")));
		String href = String.valueOf(paramMap.get("href")).split(",")[1].replaceAll(" ", "+");
		String dqsj = (System.currentTimeMillis()+"").substring(3);
		String SQBH = "688"+new StringBuffer(dqsj).reverse().toString()+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        String sjs = System.currentTimeMillis()+""+random.nextInt(10)+""+random.nextInt(10);
        Map<String, Integer> map = new HashMap<String, Integer>();
		if (href == null){
			map.put("type", 1);
		}
		String fp = SystemConfig.uploadPath;
		Calendar date = Calendar.getInstance();
        File file1 = new File(fp + File.separator + date.get(Calendar.YEAR)
                + File.separator + (date.get(Calendar.MONTH)+1));
        String saveAsFileName = sjs+"CLWG";
        if(!file1.exists()){//目录不存在则直接创建
            file1.mkdirs();
        }
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// 解密
			byte[] b = decoder.decodeBuffer(href);
			// 处理数据
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			OutputStream out = new FileOutputStream(file1.getAbsolutePath()+"\\"+saveAsFileName+".jpg");
			int c = jdbcTemplate.update("insert into tb_clsqxx(sqbh,CLWG) values ('"+SQBH+"','"+file1.getAbsolutePath()+"\\"+saveAsFileName+".jpg"+"')");
			out.write(b);
			out.flush();
			out.close();
			if(c>0){
				request.getSession().setAttribute("SQBH", SQBH);
				map.put("type", 0);
			}else{
				map.put("type", 1);
			}
		} catch (Exception e) {
			map.put("type", 1);
		}
		return jacksonUtil.toJson(map);
	}
	
	public String upload(HttpServletRequest request,HttpServletResponse response,String type){
		Map <String,Object>map = new HashMap<String,Object>();
		List <String> filenames = new ArrayList<String>();
		int tp = 0;
        if (ServletFileUpload.isMultipartContent(request)) {
        	String saveAsFileName = "";
        	logger.info("upload post");
        	 ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
             PrintWriter writer = null;
             response.setContentType("application/json");
             try {
//             	writer = response.getWriter();
                 List<FileItem> items = uploadHandler.parseRequest(request);
                 String rr = "";
                 for (FileItem item : items) {
            		 if(item.getSize()>4*1024*1000){
            			 rr+=item.getName()+",";
            		 }
            	 }
                 if(!rr.isEmpty()){
                	return "{info:'图片超过4M,无法添加,请选择不超过4M的图片!'}";
                 }
                 String dqsj = (System.currentTimeMillis()+"").substring(3);
         		 String SQBH = "688"+new StringBuffer(dqsj).reverse().toString()+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
                 String sjs = System.currentTimeMillis()+""+random.nextInt(10)+""+random.nextInt(10);
                 String zcid = java.util.UUID.randomUUID().toString();
                 String zcid1 = java.util.UUID.randomUUID().toString();
                 if(type.equals("0")||type.equals("5")){
                	 jdbcTemplate.update("insert into tb_owner(id) values('"+zcid+"')");
                	 jdbcTemplate.update("insert into tb_user(id) values('"+zcid1+"')");
                 }else if(type.equals("1")){
                	 jdbcTemplate.update("insert into tb_user(id) values('"+zcid1+"')");
                 }else if(type.equals("2")){
                	 jdbcTemplate.update("insert into tb_jsysqxx(sqbh) values ('"+SQBH+"')");
                 }else if(type.equals("3")){
                	 SQBH = String.valueOf(request.getSession().getAttribute("SQBH"));
//                	 jdbcTemplate.update("insert into tb_clsqxx(sqbh) values ('"+SQBH+"')");
                 }else if(type.equals("6")||type.equals("7")){
                	 String id = UUID.randomUUID().toString();
                	 jdbcTemplate.update("insert into TB_JBSQ(sqbh,id) values ('"+SQBH+"','"+id+"')");
                 }
                	 
                for (FileItem item : items) {
                	System.out.println(item);
                	 logger.info(item.getName());
                	 /**
                	  * 提交的时候有图片的才上传保存至数据库
                	  */
                	 if(item.getName()!=null&&item.getName().length()>0){
                		// saveAsFileName = new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(new Date())+Math.abs(random.nextInt());
                		 if (!item.isFormField()) {
                			 String fp = SystemConfig.uploadPath;// request.getSession().getServletContext().getRealPath("/")+"imgs/"+new SimpleDateFormat("yyyyMM").format(new Date())+"/";
//                			 fp=fp.substring(9).replace("\\", "/");
                			 
//                			 File f = new File(fp);
//                			 if(!f.exists()){
//                				 f.mkdirs();
//                			 }
                			 Calendar date = Calendar.getInstance();
                		        File file1 = new File(fp + File.separator + date.get(Calendar.YEAR)
                		                + File.separator + (date.get(Calendar.MONTH)+1));
                		        System.out.println(file1.getAbsolutePath());
                		        if(!file1.exists()){//目录不存在则直接创建
                		            file1.mkdirs();
                		        }
                			 if(item.getName().isEmpty() || item.getSize()== 0){
                				 continue;
                			 }
//                			 if (type.equals("0")||type.equals("1")) {
                			 //图片命名
            				 saveAsFileName = sjs+item.getFieldName()+item.getName().substring(item.getName().lastIndexOf("."));
//							}
                			
                			 File file = new File(file1.getAbsolutePath()+"\\"+saveAsFileName+".tmp");
                			 System.out.println(file);
                			 logger.info(file1.getAbsolutePath()+"\\"+saveAsFileName+".tmp");
                			 item.write(file);
                			 file.renameTo(new File(file1.getAbsolutePath()+"\\"+saveAsFileName));
                			 System.out.println(new File(file1.getAbsolutePath()+"\\"+saveAsFileName));
                			 fp = file1.getAbsolutePath()+"\\";
                			 System.out.println(fp);
//                             jdbcTemplate.update("insert into TB_FILE(shortname,filename,filesize,username,LOCATION)" +
//                             		" values(?,?,?,?,?)"
//                             		 ,new Object[]{saveAsFileName,item.getName(),item.getSize(),username,fp});
                			 //type=0 车辆申请  type=1 人员申请
                			 if(type.equals("0")){
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("zzjgdmz")
 												||fileItem.getFieldName().equals("jbrsfzzm")
 												||fileItem.getFieldName().equals("jbrsfzfm")
 												||fileItem.getFieldName().equals("frsfzzm")
 												||fileItem.getFieldName().equals("frsfzfm")
 												){
 											count++;
 										}
 									}
 									if (count<4) {
										return "{\"code\":400,\"data\":\"图片提交失败\"}";
									}
 									request.getSession().setAttribute("zc_sjsb", zcid);
 									request.getSession().setAttribute("zc_sjsb1", zcid1);
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                					 System.out.println(in);
                    				 if(item.getFieldName().equals("zzjgdmz")){//组织机构代码证
                    					 int a = 0;
                    					 a = jdbcTemplate.update("update tb_owner set ZZJGDMZ = ? where id= ?",new Object[]{in,zcid});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"组织机构代码证图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("jbrsfzzm")){//经办人身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_user set JBRSFZZM = ? where id=?",new Object[]{in,zcid1});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"企业管理员身份证明正面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("jbrsfzfm")){//经办人身份证反面 
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_user set JBRSFZFM =  ?  where id=?",new Object[]{in,zcid1});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"企业管理员身份证明反面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("frsfzzm")){//发人身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_owner set SFZZM = ? where id=?",new Object[]{in,zcid});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"法人或负责人身份证原件正面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("frsfzfm")){//法人身份证反面 
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_owner set SFZFM =  ?  where id=?",new Object[]{in,zcid});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"法人或负责人身份证原件反面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                				
                			 }else if(type.equals("1")){
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("jbrsfzzm")
 												||fileItem.getFieldName().equals("jbrsfzfm")
 												){
 											count++;
 										}
 									}
 									if (count<1) {
										return "{\"code\":400,\"data\":\"图片提交失败\"}";
									}
 									request.getSession().setAttribute("qyjbr_sjs", zcid1);
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("jbrsfzzm")){//经办人身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_user set JBRSFZZM = ? where id=?",new Object[]{in,zcid1});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"经办人身份证正面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("jbrsfzfm")){//经办人身份证反面 
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_user set JBRSFZFM =  ?  where id=?",new Object[]{in,zcid1});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"经办人身份证反面图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }else if(type.equals("2")){
                				 request.getSession().setAttribute("sqbh", SQBH);
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("SFZJ")
 												||fileItem.getFieldName().equals("SFZJFM")
 												||fileItem.getFieldName().equals("JSZJ")
 												||fileItem.getFieldName().equals("ZP")
 												){
 											count++;
 										}
 									}
 									if (count<3) {
										return "{\"code\":400,\"data\":\"图片提交失败\"}";
									}
 									request.getSession().setAttribute("qyjbr_sjs", sjs);
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("SFZJ")){//身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set SFZJ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("SFZJFM")){//身份证反面 
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set SFZJFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（反面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JSZJ")){//驾驶证照片
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set JSZJ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"机动车驾驶证图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XYCCYZGZ")){//巡游车证或者外地网约车
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set QGSC = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"巡游车证或者外地网约车图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("WFZJL")){//无犯罪记录
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set WFZJL = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"巡游车证或者外地网约车图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("WXDJL")){//无吸毒记录
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set WXDJL = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"巡游车证或者外地网约车图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JZZZM")){//居住证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set JZZZM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"浙江省居住证(正面)图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JZZFM")){//居住证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set JZZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"浙江省居住证(反面)图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("ZP")){//二寸照
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_jsysqxx set ZP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"浙江省居住证(反面)图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }else if(type.equals("3")){
                				 request.getSession().setAttribute("sqbh", SQBH);
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("DWBJZZ")
 												||fileItem.getFieldName().equals("CYRZRX")
 												||fileItem.getFieldName().equals("XJDCXSZ")
 												||fileItem.getFieldName().equals("XJDCXSZFM")
 												||fileItem.getFieldName().equals("CLWG")
 												||fileItem.getFieldName().equals("JDCDJZ")
 												||fileItem.getFieldName().equals("CLJSPZ")
 												||fileItem.getFieldName().equals("CLGZFP")
 												||fileItem.getFieldName().equals("CLXMZHJCBG")
 												){
 											count++;
 										}
 									}
 									if (count<8) {
										return "{\"code\":400,\"data\":\"图片提交失败\"}";
									}
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("SFZMJ")){//身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set SFZMJ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("SFZMJFM")){//身份证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set SFZMJFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JDCDJZ")){//机动车登记证书
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set DJZS1 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"机动车登记证书图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JDCDJZ1")){//机动车登记证书
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set DJZS2 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"机动车登记证书图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JDCDJZ2")){//机动车登记证书
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set DJZS3 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"机动车登记证书图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLJSPZ")){//车辆购置税缴税发票
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CLGZSTP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"车辆购置税缴税发票图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLGZFP")){//车辆购置发票
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CLGZFP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"车辆购置税图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLXMZHJCBG")){//车辆性能综合检测报告
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CLXMZHJCBG = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"车辆性能综合检测报告图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("DWBJZZ")){//上传已安装行驶记录功能的车辆卫星定位装置、应急报警装置证明文件图片 上传  
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set DWYJTP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CYRZRX")){//承运人责任险 附件一
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CYRZRX = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CYRZRX2")){//承运人责任险  附件二
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CYRZRX2 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XJDCXSZ")){//新机动车行驶证正面  
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set XJDCXSZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XJDCXSZFM")){//新机动车行驶证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set XJDCXSZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLWG")){//车辆外观
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CLWG = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }else if(type.equals("4")){
                				 request.getSession().setAttribute("sqbh", SQBH);
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("DWBJZZ")
 												||fileItem.getFieldName().equals("CYRZRX")
 												||fileItem.getFieldName().equals("XJDCXSZ")
 												||fileItem.getFieldName().equals("XJDCXSZFM")
 												||fileItem.getFieldName().equals("CLWG")
 												){
 											count++;
 										}
 									}
 									if (count<4) {
										return "{\"code\":400,\"data\":\"图片提交失败\"}";
									}
 									SQBH = String.valueOf(request.getSession().getAttribute("tym_clsqbh"));
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("DWBJZZ")){//上传已安装行驶记录功能的车辆卫星定位装置、应急报警装置证明文件图片 上传  
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set DWYJTP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CYRZRX")){//承运人责任险 附件一
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CYRZRX = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CYRZRX2")){//承运人责任险  附件二
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CYRZRX2 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XJDCXSZ")){//新机动车行驶证正面  
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set XJDCXSZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XJDCXSZFM")){//新机动车行驶证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set XJDCXSZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLWG")){//车辆外观
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update tb_clsqxx set CLWG = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"data\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }else if(type.equals("5")){
                				 fp=fp.replace("\\", "/");
            					 String in = fp+saveAsFileName;
            					 request.getSession().setAttribute("dbqy_zj", zcid);
            					 request.getSession().setAttribute("dbqy_zj1", zcid1);
                				 if(item.getFieldName().equals("CLJSPZ")){//组织机构代码证
                					 int a = 0;
                					 a = jdbcTemplate.update("update tb_owner set ZZJGDMZ = ? where id= ?",new Object[]{in,zcid});
                					 System.out.println("update tb_owner set ZZJGDMZ = '"+in+"' where id= '"+zcid+"'");
                					 if(a==0){
                						 logger.error("app_error---图片插入表中失败"+a);
                		            	 return "{\"code\":400,\"data\":\"组织机构代码证图片提交失败\"}";
                					 } else {
											tp = 1;
										}
                				 }
                			 }else if(type.equals("6")){
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("YYZ")
 												||fileItem.getFieldName().equals("XSZZM")
// 												||fileItem.getFieldName().equals("XSZFM")
 												||fileItem.getFieldName().equals("TZSBZM")
// 												||fileItem.getFieldName().equals("TZSBFM")
 												){
 											count++;
 										}
 									}
 									/*fileItem.getFieldName().equals("SFZJ")
 												||fileItem.getFieldName().equals("SFZJFM")//ZZJGDMZ
 												||*/
 									if (count<2) {
										return "{\"code\":400,\"info\":\"图片提交失败\"}";
									}
 									request.getSession().setAttribute("JBSQSQBH", SQBH);
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("SFZJ")){//身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set SFZZM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("SFZJFM")){//身份证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set SFZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("ZZJGDMZ")){//组织机构代码证
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set YYZZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("YYZ")){//营运证
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JYYZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XSZZM")){//机动车行驶证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JXSZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XSZFM")){//机动车行驶证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JXSZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("TZSBZM")){//特种设备使用登记证明文件图片(正面）
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set TZZMZM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("TZSBFM")){//特种设备使用登记证明文件图片(反面）
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set TZZMFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }else if(type.equals("7")){
                				 try {
                					int count = 0;
 									for (FileItem fileItem : items) {
 										if(fileItem.getFieldName().equals("JDCDJZ")
 												||fileItem.getFieldName().equals("YYZ")
 												||fileItem.getFieldName().equals("YYZYC")
 												||fileItem.getFieldName().equals("CLJSPZ")
 												||fileItem.getFieldName().equals("CLGZFP")
 												||fileItem.getFieldName().equals("XSZZM")
 												){
 											count++;
 										}
 									}
 									if (count<5) {
										return "{\"code\":400,\"info\":\"图片提交失败\"}";
									}
 									request.getSession().setAttribute("JBSQSQBH", SQBH);
                					 fp=fp.replace("\\", "/");
                					 String in = fp+saveAsFileName;
                    				 if(item.getFieldName().equals("SFZJ")){//身份证正面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set SFZZM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("SFZJFM")){//身份证反面
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set SFZFM = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("ZZJGDMZ")){//组织机构代码证
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set YYZZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("YYZ")){//营运证新
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set XYYZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("YYZ1")){//营运证新(若有)
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set XYYZ1 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("YYZYC")){//营运证原车
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JYYZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"身份证原件（正面）图片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLJSPZ")){//车辆购置税缴税发票(原车)
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JGZSFP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("CLGZFP")){//车辆购置发票(原车)
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JGCFP = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("XSZZM")){//机动车行驶证（原车主页和副页的正面）
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set JXSZ = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JDCDJZ")){//机动车登记证书第1、2页
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set XJDCDJZS = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }else if(item.getFieldName().equals("JDCDJZ1")){//机动车登记证书第3、4页(若有)
                    					 int a = 0;
                    					 a =  jdbcTemplate.update("update TB_JBSQ set XJDCDJZS1 = ? where sqbh=?",new Object[]{in,SQBH});
                    					 if(a==0){
                    						 logger.error("app_error---图片插入表中失败"+a);
                    		            	 return "{\"code\":400,\"info\":\"车辆外观照片提交失败\"}";
                    					 } else {
 											tp = 1;
 										}
                    				 }
								} catch (Exception e) {
									logger.error("app_error---图片插入表中失败"+e.getMessage());
           		            	 return "{\"code\":400,\"data\":\"图片提交失败\"}";
								}
                			 }
                			 filenames.add(saveAsFileName);
                		 }
                	 }
                 }
             } catch (FileUploadException e) {
            	 logger.error("app_error",e);
            	 return "{\"code\":400,\"data\":\""+e.getMessage()+"\"}";
             } catch (Exception e) {
            	 logger.error("app_error",e);
            	 return "{\"code\":400,\"data\":\""+e.getMessage()+"\"}";
             } finally {
             }
        }
        if (tp == 0) {
			return "{\"code\":400,\"data\":\"图片提交未提交，请重新提交\"}";
		}
        map.put("data", "OK");
        return jacksonUtil.toJson(map);
	}
	
	
	public void getFile(HttpServletRequest request,HttpServletResponse response){
		try {
			String sqbh =  (String) request.getSession().getAttribute("dj_spbh"); //"658009383553387052";//request.getParameter("sqbh");
        	if(null != sqbh && !sqbh.isEmpty()){
        		List<Map<String, Object>> list = null ;
        		list = jdbcTemplate.queryForList("select scz from tb_cljcxx where  sqbh = '"+sqbh+"' and IS_YX = '0'");
        		logger.info("select scz from tb_cljcxx where  sqbh = '"+sqbh+"' and IS_YX = '0'");
        		String result = "";
        		if(list.size() ==1 ){
        			String path = (String) list.get(0).get("SCZ");
        			logger.info(path);
        			File pf = new File(path);
        			FileInputStream fin = new FileInputStream(pf);
        			ServletOutputStream fout =  response.getOutputStream();
        			byte bts [] = new byte[fin.available()];
        			fin.read(bts);
        			fout.write(bts);
        			fin.close();
        			fout.close();
        		}
        		
        		
//        		result = result.replaceFirst(",", "");
//        		logger.info(result);
//
////                response.setContentType("application/json");
//                writer.print(result);
        	}
		} catch (Exception e) {
			logger.error("app_error",e);
		}
		
	}
	
	public void getFile_jsy(HttpServletRequest request,HttpServletResponse response){
		try {
			String sjhm =  (String) request.getSession().getAttribute("user"); //"658009383553387052";//request.getParameter("sqbh");
        	if(null != sjhm && !sjhm.isEmpty()){
        		List<Map<String, Object>> list = null ;
        		list = jdbcTemplate.queryForList("select ZP from tb_jsyjcxx where  sjhm = '"+sjhm+"' and IS_YX = '0'");
        		System.out.println("select ZP from tb_jsyjcxx where  sjhm = '"+sjhm+"' and IS_YX = '0'");
        		String result = "";
        		if(list.size() ==1 ){
        			String path = (String) list.get(0).get("ZP");
        			logger.info(path);
        			 File pf = new File(path);
        			 FileInputStream fin = new FileInputStream(pf);
        			ServletOutputStream fout =  response.getOutputStream();
        			 byte bts [] = new byte[fin.available()];
        			 fin.read(bts);
        			 fout.write(bts);
        			fin.close();
        			fout.close();
        		}
        	}
		} catch (Exception e) {
			logger.error("app_error",e);
		}
		
	}
	public void getFile_jsy_sqbh(HttpServletRequest request,HttpServletResponse response){
		try {
			String sqbh =  (String) request.getSession().getAttribute("jsysqbh_1"); //"658009383553387052";//request.getParameter("sqbh");
        	if(null != sqbh && !sqbh.isEmpty()){
        		List<Map<String, Object>> list = null ;
        		list = jdbcTemplate.queryForList("select ZP from tb_jsyjcxx where  sqbh = '"+sqbh+"' and IS_YX = '0'");
        		String result = "";
        		if(list.size() ==1 ){
        			String path = (String) list.get(0).get("ZP");
        			logger.info(path);
        			 File pf = new File(path);
        			 FileInputStream fin = new FileInputStream(pf);
        			ServletOutputStream fout =  response.getOutputStream();
        			 byte bts [] = new byte[fin.available()];
        			 fin.read(bts);
        			 fout.write(bts);
        			fin.close();
        			fout.close();
        		}
        	}
		} catch (Exception e) {
			logger.error("app_error",e);
		}
		
	}
	
	public String getFileNameList(HttpServletRequest request,HttpServletResponse response){
//		Map<String,Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String,Object>>() {});
		String ywid  = gP(request,"ywid"); //gP(request,"username");
//		Map  resultMap = new HashMap ();
		List<Map<String, Object>> list = null ;
		String sql = "";
		if(!ywid.isEmpty() && !ywid.isEmpty()){
			sql += " SELECT "+
					"   ywid,filesize,shortname from tb_file where 1=1 ";
			sql+=" and ywid = ? ";
		}
		logger.info(sql);
        list = jdbcTemplate.queryForList(sql,ywid);
        return  jacksonUtil.toJson(list);
	}
	
	
	 private String getMimeType(File file) {
	        String mimetype = "";
	        if (file.exists()) {
	            if (getSuffix(file.getName()).equalsIgnoreCase("png")) {
	                mimetype = "image/png";
	            }else if(getSuffix(file.getName()).equalsIgnoreCase("jpg")){
	                mimetype = "image/jpg";
	            }else if(getSuffix(file.getName()).equalsIgnoreCase("jpeg")){
	                mimetype = "image/jpeg";
	            }else if(getSuffix(file.getName()).equalsIgnoreCase("gif")){
	                mimetype = "image/gif";
	            }else {
	                javax.activation.MimetypesFileTypeMap mtMap = new javax.activation.MimetypesFileTypeMap();
	                mimetype  = mtMap.getContentType(file);
	            }
	        }
	        return mimetype;
	    }

	    private String getSuffix(String filename) {
	        String suffix = "";
	        int pos = filename.lastIndexOf('.');
	        if (pos > 0 && pos < filename.length() - 1) {
	            suffix = filename.substring(pos + 1);
	        }
	        return suffix;
	    }

	    public String getFiles(HttpServletRequest request,
				HttpServletResponse response) {
			String username = (String) request.getSession().getAttribute("user");
//			Map  resultMap = new HashMap ();
			List<Map<String, Object>> list = null ;
			String sql = "";
			if(!username.isEmpty() && !username.isEmpty()){
				sql += " SELECT "+
						"   ywid,filesize,shortname from tb_file where 1=1 ";
				sql+=" and username = ? ";
			}
			logger.info(sql);
	        list = jdbcTemplate.queryForList(sql,username);
	        return  jacksonUtil.toJson(list);
		}


		/**
		 * getParameter
		 * @param request
		 * @param p
		 * @return
		 */
		private String gP(HttpServletRequest request,String p){
			String s = request.getParameter(p);
			if(null != s && !s.isEmpty()){
				s = s.replaceAll(".*([';]+|(--)+).*", " ");
			}else{
				s = "";
			}
			return s;
		}
		
		//发送短信
		public String fsdx(String postData,HttpServletRequest request) {
			String info = "";
			Map<String, Object> paramMap = jacksonUtil.toObject(postData,new TypeReference<Map<String, Object>>() {});
			String phone = String.valueOf(paramMap.get("phone"));
			String type = String.valueOf(paramMap.get("type"));
			logger.info(phone+"   "+type);
//			String tj_time = String.valueOf(paramMap.get("tj_time"));
			if(phone==null&&phone.isEmpty()
					|| type==null&&type.isEmpty()){
				info = "无数据";
			}
			String yzm = "";
			long yzmFssj = 0L;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dqsj = sdf.format(new Date());
			if(request.getSession().getAttribute("yzm") != null){
				yzmFssj = (Long) request.getSession().getAttribute("yzmFssj");
				if(System.currentTimeMillis() - yzmFssj < 1000*60){
					info = "验证码1分钟只发送一次";
					return  "{\"info\":\""+info+"\"}";
				}else{
					int fsyzm = (int)((Math.random()*9+1)*1000);
					String yzm_gs = "验证码："+fsyzm+"，（"+phone+"账号的验证码，请完成验证），3分钟之内有效，如非本人操作，请忽略本短信。";
					
					String dxwgSql = "insert into sms_send_sms (CONTENT,MOBILE,INFORMATIONTYPE,SENDTIME,SENDUSER) values(?,?,?,?,?)";
					int dx = jdbcTemplate.update(dxwgSql, new Object[]{yzm_gs,phone,type.equals("0")?"注册":type.equals("1")?"车辆提交":type.equals("2")?"人员提交":"经营者提交",dqsj,"wyc"});
					
					request.getSession().setAttribute("yzm", fsyzm);
					request.getSession().setAttribute("yzmFssj", System.currentTimeMillis());
					request.getSession().setAttribute("yzmcs", 0);
					request.getSession().setAttribute("yzmsjhm", phone);
					logger.info(request.getSession().getAttribute("yzm")+"  ###");
					if(SystemConfig.dxGateway.equals("jtwx")){
						logger.info(1+"");
						MessageClient.sendMessage2(phone, fsyzm+"");
					}
				}
			}else{
				int fsyzm = (int)((Math.random()*9+1)*1000);
				String yzm_gs = "验证码："+fsyzm+"，（"+phone+"账号的验证码，请完成验证），3分钟之内有效，如非本人操作，请忽略本短信。";
				
				String dxwgSql = "insert into sms_send_sms (CONTENT,MOBILE,INFORMATIONTYPE,SENDTIME,SENDUSER) values(?,?,?,?,?)";
				int dx = jdbcTemplate.update(dxwgSql, new Object[]{yzm_gs,phone,type.equals("0")?"注册":type.equals("1")?"车辆提交":type.equals("2")?"人员提交":"经营者提交",dqsj,"wyc"});
				
				request.getSession().setAttribute("yzm", fsyzm);
				request.getSession().setAttribute("yzmFssj", System.currentTimeMillis());
				request.getSession().setAttribute("yzmcs", 0);
				request.getSession().setAttribute("yzmsjhm", phone);
				if(SystemConfig.dxGateway.equals("jtwx")){
					MessageClient.sendMessage2(phone, fsyzm+"");
				}
			}
			return "{\"info\":\""+info+"\"}";
		}
		
}

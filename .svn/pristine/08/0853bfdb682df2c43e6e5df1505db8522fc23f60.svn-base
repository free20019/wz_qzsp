
package mvc.service;

import helper.JacksonUtil;
import helper.MessageClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
public class DBService extends MvcService{

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
	 * 平台代办驾驶员证查询
	 * @param request
	 * @param postData
	 * @return
	 */
	public String dbjsycx(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData, new TypeReference<Map<String, Object>>() {});
		int page = Integer.parseInt(paramMap.get("page")+"");
		int pageSize = Integer.parseInt(paramMap.get("pageSize")+"");
		String xm = String.valueOf(paramMap.get("xm"));
		String zjhm = String.valueOf(paramMap.get("zjhm"));
		String dbr = String.valueOf(paramMap.get("dbr"));
		String blzt = String.valueOf(paramMap.get("blzt"));
		String id = String.valueOf(request.getSession().getAttribute("dlid"));
		String tj = "";
		if(xm!=null&&!xm.isEmpty()){
			tj += " and j.xm like '%"+xm+"%'";
		}
		if(zjhm!=null&&!zjhm.isEmpty()){
			tj += " and j.zjhm like '%"+zjhm+"%'";
		}
		if(dbr!=null&&!dbr.isEmpty()){
			tj += " and u.jbrxm like '%"+dbr+"%'";
		}
		if(blzt!=null&&!blzt.isEmpty()&&!blzt.equals("0")){
			if(blzt.equals("1")){
				tj += "and (YGJCSYJ = '2' or CGSCSYJ = '2' or ZAFJCSYJ = '2')";
			}else if(blzt.equals("2")){
				tj += " and YGJCSYJ = '0' and CGSCSYJ = '0' and ZAFJCSYJ = '0'";
			}else if(blzt.equals("3")){
				tj += " and ((YGJCSYJ = '1' and  CGSCSYJ != '2' and ZAFJCSYJ != '2')"
				+ " or (YGJCSYJ != '2' and  CGSCSYJ = '1' and ZAFJCSYJ != '2')"
				+ " or (YGJCSYJ != '2' and  CGSCSYJ != '2' and ZAFJCSYJ = '1'))";
			}
		}
		String sql = "select (select count(*) from (select j.* from tb_user u,tb_owner o,tb_jsysqxx j where u.id = j.dbrid and o.id=j.dbptid and o.id = '"+id+"' and sqrq in (select max(sqrq) from tb_jsysqxx group by zjhm,sqlx)";
				sql += tj;
				sql += ")) as count, tt.* from (select t.*, rownum as rn from (select j.*,u.jbrxm from tb_user u,tb_owner o,tb_jsysqxx j where u.id = j.dbrid and o.id=j.dbptid and o.id = '"+id+"' and sqrq in (select max(sqrq) from tb_jsysqxx group by zjhm,sqlx)";
				sql += tj;
				sql += " ) t where rownum <= "+(page*pageSize)+") tt where tt.rn > "+((page-1)*pageSize);
				System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("DQZT", jsydqzt(list.get(i)));
//			list.get(i).put("JBRXM", list.get(i).get(""));
		}
		return jacksonUtil.toJson(list);
	}
	public String jsydqzt(Map<String, Object> map){
		String type="";
		if(map.get("YGJCSYJ")!=null&&map.get("YGJCSYJ").equals("0")&&
				map.get("CGSCSYJ")!=null&&map.get("CGSCSYJ").equals("0")&&
				   map.get("ZAFJCSYJ")!=null&&map.get("ZAFJCSYJ").equals("0")){
					type = "审核通过";
					//3个审核都不为空,但是有一个审核不为0,则审核不通过
		}else if(map.get("YGJCSYJ")!=null&&map.get("YGJCSYJ").toString().equals("2")
				||map.get("CGSCSYJ")!=null&&map.get("CGSCSYJ").toString().equals("2")
						|| map.get("ZAFJCSYJ")!=null&&map.get("ZAFJCSYJ").toString().equals("2")){
			logger.info(2+"");
			if(map.get("YGJCSYJ")!=null&&map.get("YGJCSYJ").toString().equals("2")){
				type+="运管审核中(一)<br>";
			}else{
				type+="运管审核完成(一)<br>";
			}
			if(map.get("CGSCSYJ")!=null&&map.get("CGSCSYJ").toString().equals("2")){
				if(map.get("WXDJL")!=null&&String.valueOf(map.get("WXDJL")).length()>10){
					type+="运管审核中(二)<br>";
				}else{
					type+="公安交管审核中<br>";
				}
			}else{
				if(map.get("WXDJL")!=null&&String.valueOf(map.get("WXDJL")).length()>10){
					type+="运管审核完成(二)<br>";
				}else{
					type+="公安交管审核完成<br>";
				}
			}
			if(map.get("ZAFJCSYJ")!=null&&map.get("ZAFJCSYJ").toString().equals("2")){
				type+="公安治安审核中<br>";
			}else{
				type+="公安治安审核完成<br>";
			}
//			if(!map.get("YGJCSYJ").equals("0")||!map.get("ZAFJCSYJ").equals("0")){
				logger.info(3+"");
//				type = "审核中";
//			}
		}else {
			logger.info(4+"");
			if(map.get("YGJCSYJ")!=null&&map.get("YGJCSYJ").toString().equals("1")){
				type+="运管审核不通过(一)<br>";
			}
			if(map.get("CGSCSYJ")!=null&&map.get("CGSCSYJ").toString().equals("1")){
				if(map.get("WXDJL")!=null&&String.valueOf(map.get("WXDJL")).length()>10){
					type+="运管审核不通过(二)<br>";
				}else{
					type+="公安交管审核不通过<br>";
				}
			}
			if(map.get("ZAFJCSYJ")!=null&&map.get("ZAFJCSYJ").toString().equals("1")){
				type+="公安治安审核不通过<br>";
			}
//			type = "审核不通过";
		}
//		if(map.get("QGKSHG")!=null&&map.get("DSKSHG")!=null){
//			if(map.get("QGKSHG").toString().equals("合格")&&map.get("DSKSHG").toString().equals("合格")){
//				type = "考试合格";
//			}
//		}
		return type;
	}
	/**
	 * 驾驶员证查询，点击查看按钮，根据驾驶员不同的状态跳转不同的页面
	 */
	public String tym(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData, new TypeReference<Map<String, Object>>() {});
		String sqbh = String.valueOf(paramMap.get("sqbh"));
		String sql = "select * from tb_jsysqxx where sqbh = ?";
		System.out.println(sql+ " "+sqbh);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		int c = pdym(list);
		request.getSession().setAttribute("tym_sqbh", list.get(0).get("SQBH"));
		return "{\"info\":\"" + c + "\"}";
	}
	/**
	 * 根据驾驶员的审核及考试信息判断需要跳转的页面
	 * 0 没有申请信息
	 * 1 审核中
	 * 2审核不通过
	 * 3考试预约证明界面
	 * 4考试结果
	 */
	public int pdym(List<Map<String, Object>> list){
		int c = 0;
		if(list.get(0).get("YGJCSYJ")!=null&&list.get(0).get("YGJCSYJ").equals("0")&&
			list.get(0).get("CGSCSYJ")!=null&&list.get(0).get("CGSCSYJ").equals("0")&&
		   list.get(0).get("ZAFJCSYJ")!=null&&list.get(0).get("ZAFJCSYJ").equals("0")){
			//3个审核都通过进入考试 
			c=3;
			logger.info(2+"");
			if(list.get(0).get("DSKSHG")!=null||list.get(0).get("QGKSHG")!=null){
				logger.info(4+"");
				//至少有一科有成绩，进入考试结果界面
				c =4;
			}
			//3个审核都不为空,但是有一个审核不为0,则审核不通过
		}else if(list.get(0).get("YGJCSYJ")!=null&&list.get(0).get("YGJCSYJ").toString().equals("2")
				||list.get(0).get("CGSCSYJ")!=null&&list.get(0).get("CGSCSYJ").toString().equals("2")
						|| list.get(0).get("ZAFJCSYJ")!=null&&list.get(0).get("ZAFJCSYJ").toString().equals("2")){
			logger.info(2+"");
				//审核至少有一项未审核，审核中
			c=1;
		}else {
			logger.info(1+"");
			//至少有一项未审核，正在审核中
			c=2;
		}
		
		return c;
	}
	/**
	 * 审核填报界面判断用户正在审核中还是审核不通过
	 */
	public String tbsh(HttpServletRequest request){
		String sqbh = String.valueOf(request.getSession().getAttribute("tym_sqbh"));
		String sql = "select * from tb_jsysqxx where sqbh = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list!=null&&list.size()==1){
			int c = pdym(list);
			if(c==1){
				map.put("type", "1");
				map.put("nr", "审核中");
			}else if(c==2){
				map.put("type", "2");
				map.put("nr", pdnr(list.get(0)));
			}else{
				map.put("type", "0");
			}
		}else{
			map.put("type", "0");
		}
		return jacksonUtil.toJson(map);
	}
	/**
	 * 审核不通过判断审核不通过内容
	 */
	public String pdnr(Map<String, Object> map){
		String sh = "";
		if(map.get("WXDJL")!=null&&String.valueOf(map.get("WXDJL")).length()>10){
			sh = "运管审核(二)";
		}else{
			sh = "公安交管审核";
		}
		String nr = "";
		String blfz = String.valueOf(map.get("IS_JSY_BLFZ"));//暴力犯罪
		String jjjl = String.valueOf(map.get("IS_JSY_JJJL"));//酒驾记录
//		String blfz = String.valueOf(map.get("is_jsy_blfz"));//巡游车
		String sfztp = String.valueOf(map.get("IS_JSY_SFZTP"));//身份证图片
		String zsfz = String.valueOf(map.get("IS_JSY_ZSFZ"));//肇事犯罪
		String fzjl = String.valueOf(map.get("IS_JSY_FZJL"));//犯罪记录
		String xdjl = String.valueOf(map.get("IS_JSY_XDJL"));//吸毒记录
		String mfjl = String.valueOf(map.get("IS_JSY_MFJL"));//满12分 满分 记录
		String jzz = String.valueOf(map.get("IS_JSY_JZZ"));//本地户籍  居住证
		String jsztp = String.valueOf(map.get("IS_JSY_JSZTP"));//驾驶证图片
		String jszz = String.valueOf(map.get("IS_JSY_JSJL"));//3年驾驶经历
		String txnl = String.valueOf(map.get("IS_JSY_TXNL"));//退休年龄
		String cxjl = String.valueOf(map.get("IS_JSY_CXJL"));//撤销记录
		String zjcx = String.valueOf(map.get("IS_JSY_ZJCX"));//准假车型
		if(blfz.equals("1")){
			nr += "<p>无暴力犯罪记录(该项不符合)公安治安审核</p>";
		}
		if(jjjl.equals("1")){
			nr += "<p>无饮酒后驾驶记录(该项不符合)"+sh+"</p>";
		}
		if(sfztp.equals("1")){
			nr += "<p>身份证与申请信息是否匹配(该项不符合)运管审核(一)</p>";
		}
		if(zsfz.equals("1")){
			nr += "<p>无交通肇事犯罪(该项不符合)公安治安审核</p>";
		}
		if(fzjl.equals("1")){
			nr += "<p>无危险驾驶犯罪记录(该项不符合)公安治安审核</p>";
		}
		if(xdjl.equals("1")){
			nr += "<p>无吸毒记录(该项不符合)公安治安审核</p>";
		}
		if(mfjl.equals("1")){
			nr += "<p>最近连续3个记分周期内无记满12分记录(该项不符合)"+sh+"</p>";
		}
		if(jzz.equals("1")){
			nr += "<p>取得温州市户籍，或者在本市取得浙江省居住证6个月以上(该项不符合)运管审核(一)</p>";
		}
		if(jsztp.equals("1")){
			nr += "<p>驾驶证与申请信息是否匹配(该项不符合)运管审核(一)</p>";
		}
		if(jszz.equals("1")){
			nr += "<p>取得相应准假车型驾驶证，具有3年以上驾驶经历(该项不符合)"+sh+"</p>";
		}
		if(txnl.equals("1")){
			nr += "<p>未达法定退休年龄，取得相应准驾车型机动车驾驶证(该项不符合)运管审核(一)</p>";
		}
		if(cxjl.equals("1")){
			nr += "<p>自申请考试之日前3年内未被撤销出租汽车驾驶员从业资格证的记录(该项不符合)运管审核(一)</p>";
		}
		if(zjcx.equals("1")){
			nr += "<p>驾驶证与申请信息匹配(该项不符合)运管审核(一)</p>";
		}
		return nr;
	}
	/**
	 * 考试预约证明界面判断用户能否进入页面。
	 * 能进入将内容显示页面上，
	 * 不能进入直接返回首页
	 */
	public String ksyyzm(HttpServletRequest request){
		String sqbh = String.valueOf(request.getSession().getAttribute("tym_sqbh"));
		String sql = "select * from tb_jsysqxx where sqbh = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list!=null&&list.size()==1){
			int c = pdym(list);
			if(c==3){
				map.put("type", "1");
				map.put("data", list);
			}else{
				map.put("type", "0");
			}
		}else{
			map.put("type", "0");
		}
		return jacksonUtil.toJson(map);
	}
	/**
	 * 考试结果界面判断用户能否进入页面。
	 * 能进入将内容显示页面上，
	 * 不能进入直接返回首页
	 */
	public String ksjg(HttpServletRequest request){
		String sqbh = String.valueOf(request.getSession().getAttribute("tym_sqbh"));
		String sql = "select * from tb_jsysqxx where sqbh = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list!=null&&list.size()==1){
			int c = pdym(list);
			if(c==4){
				map.put("type", "1");
				map.put("data", list);
			}else{
				map.put("type", "0");
			}
		}else{
			map.put("type", "0");
		}
		return jacksonUtil.toJson(map);
	}
	/**
	 * 平台代办车辆运输证查询
	 * @param request
	 * @param postData
	 * @return
	 */
	public String dbclyszcx(HttpServletRequest request,String postData){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData, new TypeReference<Map<String, Object>>() {});
		int page = Integer.parseInt(paramMap.get("page")+"");
		int pageSize = Integer.parseInt(paramMap.get("pageSize")+"");
		String cphm = String.valueOf(paramMap.get("cphm"));
		String xm = String.valueOf(paramMap.get("xm"));
		String dbr = String.valueOf(paramMap.get("dbr"));
		String zzjgdmz = String.valueOf(paramMap.get("zzjgdmz"));
		String zjhm = String.valueOf(paramMap.get("zjhm"));
		String blzt = String.valueOf(paramMap.get("blzt"));
		String id = String.valueOf(request.getSession().getAttribute("dlid"));
		String tj = "";
		if(cphm!=null&&!cphm.isEmpty()){
			tj += " and j.cphm like '"+cphm+"'";
		}
		if(xm!=null&&!xm.isEmpty()){
			tj += " and j.xm like '"+xm+"'";
		}
		if(zjhm!=null&&!zjhm.isEmpty()){
			tj += " and j.zjhm like '"+zjhm+"'";
		}
		if(zzjgdmz!=null&&!zzjgdmz.isEmpty()){
			tj += " and j.zjhm like '"+zzjgdmz+"'";
		}
		if(dbr!=null&&!dbr.isEmpty()){
			tj += " and u.jbrxm like '"+dbr+"'";
		}
		if(blzt!=null&&!blzt.isEmpty()&&!blzt.equals("0")){
			if(blzt.equals("1")){
				tj += " and (ygjzsyj='0'or ygjzsyj='1') ";
			}else if(blzt.equals("2")){
				tj += " and (nvl(ygjzsyj,'123') ! ='0' and nvl(ygjzsyj,'123') !='1') ";
			}
		}
		String sql = "select (select count(*) from (select j.* from tb_user u,tb_owner o,tb_clsqxx j where o.id = j.dbptid and j.dbrid = u.id and o.id = '"+id+"' and sqrq in (select max(sqrq) from tb_clsqxx where DBPTID = '"+id+"' group by vin)";
				sql += tj;
				sql += ")) as count, tt.* from (select t.*, rownum as rn from (select j.*,u.jbrxm dbrxm from tb_user u,tb_owner o,tb_clsqxx j where o.id = j.dbptid and j.dbrid = u.id and o.id = '"+id+"' and sqrq in (select max(sqrq) from tb_clsqxx where DBPTID = '"+id+"' group by vin)";
				sql += tj;
				sql += " ) t where rownum <= "+(page*pageSize)+") tt where tt.rn > "+((page-1)*pageSize);
				System.out.println(sql);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).put("DQZT", clzt(list.get(i)));
//			list.get(i).put("JBRXM", list.get(i).get(""));
		}
		return jacksonUtil.toJson(list);
	}
	public String clzt(Map<String, Object> map){
			String type = "审核中";
//			if((String)map.get("YGJCSYJ")!=null&&((String)map.get("YGJCSYJ")).length()>0){
//				if(((String)map.get("YGJCSYJ")).equals("0")){
//					type="审核通过";
//				}else if(((String)map.get("YGJCSYJ")).equals("1")){
//					type="审核不通过";
//				}
//			}
			//车管所初审  成功跳到补充资料界面
			//不通过,跳到未通过界面
//			if((String)map.get("CGSCSYJ")!=null&&((String)map.get("CGSCSYJ")).length()>0){
//				if(!((String)map.get("CGSCSYJ")).equals("1")){
//					//审核通过
//					//两个户籍类型户籍类型  前台判断长度大于2  取最后一个字符
//					type="补充资料";
//				}else{
//					//审核不通过
//					//三个户籍类型户籍类型  前台判断长度大于3  取最后一个字符
//					type="审核未通过";
//				}
//			}
			//用户补充资料是否成功,成功跳到等待发证界面
//			if((String)map.get("BCZL")!=null&&((String)map.get("BCZL")).length()>0){
//				if(((String)map.get("BCZL")).equals("0")){
//					type="等待发证";
//				}
//			}
			if(map.get("YGJZSYJ")!=null&&map.get("YGJZSYJ").toString().length()>0){
				if(map.get("YGJZSYJ").toString().equals("0")){
					type="审核通过";
				}else if(map.get("YGJZSYJ").toString().equals("1")){
					type="审核未通过";
				}
			}
		return type;
	}
	/**
	 * 车辆运输证查询，点击查看按钮，根据车辆不同的状态跳转不同的页面
	 */
	public String cl_tym(String postData,HttpServletRequest request){
		Map<String, Object> paramMap = jacksonUtil.toObject(postData, new TypeReference<Map<String, Object>>() {});
		String sqbh = String.valueOf(paramMap.get("sqbh"));
		String sql = "select * from tb_clsqxx where sqbh = ?";
		System.out.println(sql+ " "+sqbh);
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		int c = cl_pdym(list.get(0));
		request.getSession().setAttribute("tym_cphm", list.get(0).get("CPHM"));
		request.getSession().setAttribute("tym_clsqbh", sqbh);
		return "{\"info\":\"" + c + "\"}";
	}
	/**
	 * 业务流程改动，去除车管所审核，运管局初审通过之后，进入变更性质界面，下面增加按钮，直接进入补充资料界面
	 * 根据驾驶员的审核及考试信息判断需要跳转的页面
	 * 0 没有申请信息
	 * 9 初审未审核--
	 * 1 初审通过 ---
	 * 2 初审不通过--
	 * 
//	 * 3 车管所审核通过 进入补充资料  333333
//	 * 4 车管所审核不通过                      444444
	 *  
	 * 5 补充资料成功等待发证 ----
	 * 6 终审通过发证
	 * 7 终审不通过重新补充资料
	 */
	public int cl_pdym(Map<String, Object> map){
		int c = 0;
//		if((String)map.get("YGJCSYJ")!=null&&((String)map.get("YGJCSYJ")).length()>0){
//			if(((String)map.get("YGJCSYJ")).equals("0")){
//				c = 1;
//			}else if(((String)map.get("YGJCSYJ")).equals("1")){
//				c = 2;
//			}else{
//				 c = 9;
//			}
//		}
		//车管所初审  成功跳到补充资料界面
		//不通过,跳到未通过界面
//		if((String)map.get("CGSCSYJ")!=null&&((String)map.get("CGSCSYJ")).length()>0){
//			if(((String)map.get("CGSCSYJ")).equals("0")){
//				c = 3;
//			}else{
//				c = 4;
//			}
//		}
		//用户补充资料是否成功,成功跳到等待发证界面
//		if((String)map.get("BCZL")!=null&&((String)map.get("BCZL")).length()>0){
//			if(((String)map.get("BCZL")).equals("0")){
//				c = 5;
//			}
//		}
		if(map.get("YGJZSYJ")!=null&&map.get("YGJZSYJ").toString().length()>0){
			if(map.get("YGJZSYJ").toString().equals("0")){
				c = 6; 
			}else if(map.get("YGJZSYJ").toString().equals("1")){
				c = 7; 
			}else{
				c=5;
			}
		}
		return c;
	}
	/**
	 * 车辆页面判断车辆状态
	 */
	public String tbsh_cl(HttpServletRequest request){
		String sqbh = String.valueOf(request.getSession().getAttribute("tym_clsqbh"));
		String sql = "select * from tb_clsqxx where sqbh = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,sqbh);
		System.out.println(sql+" "+sqbh);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list!=null&&list.size()==1){
			int c = cl_pdym(list.get(0));
			map.put("info", c);
			map.put("yy", cl_pdnr(list.get(0)));
//			map.put("yy", "<p>1</p><p>2</p><p>3</p>");
			map.put("data", list);
		}else{
			map.put("type", "0");
		}
		return jacksonUtil.toJson(map);
	}
	/**
	 * 车辆进入补充资料界面后，查询该车有无gps记录，没有则无法进入页面
	 */
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
	public String cx_last_gps(String cphm){
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
	/**
	 * 审核不通过判断审核不通过内容
	 */
	public String cl_pdnr(Map<String, Object> map){
		String nr = "";
		String IS_CL_CYC = String.valueOf(map.get("IS_CL_CYC"));//是否为乘用车IS_CL_CYC
		String IS_CL_BSHP = String.valueOf(map.get("IS_CL_BSHP"));//是否为本市号牌车辆IS_CL_BSHP
		String IS_CL_ZWS = String.valueOf(map.get("IS_CL_QZ"));//是否为7座及以下车辆IS_CL_QZ
		String IS_CL_SYNX = String.valueOf(map.get("IS_CL_ZCRQ"));//车辆行驶证载明的初次注册日期至申请时未满4年IS_CL_ZCRQ
		String IS_CL_JSXN = String.valueOf(map.get("IS_CL_JSXN"));//车辆行驶证载明的初次注册车辆技术性能符合运营安全相关标准要求日期至申请时未满4年
		String IS_CL_BZYQ = String.valueOf(map.get("IS_CL_BZYQ"));//车辆技术性能符合运营安全相关标准要求。
		String IS_CL_WXDW = String.valueOf(map.get("IS_QF_WXDW"));//安装具有行驶记录功能的车辆卫星定位装置、应急报警装置。IS_CL_DWZZ
		String IS_CL_JSJG = String.valueOf(map.get("IS_CL_JSJG"));//7.3车辆购置的计税价格≥15 万元的不受车辆轴距参数限制。
		String IS_CL_SFZTP = String.valueOf(map.get("IS_CL_SFZ"));//身份证照片与申请信息匹配
		String IS_CL_DJZTP = String.valueOf(map.get("IS_CL_DJZS"));//登记证书或合格证书与信息匹配
		String IS_CL_GZFPTP = String.valueOf(map.get("IS_CL_GZFP"));//车辆购置发票与申请信息匹配
		String IS_CL_GZSFP = String.valueOf(map.get("IS_CL_GZSFP"));//车辆购置税发票
		String IS_CL_XNY = String.valueOf(map.get("IS_CL_CLZJ"));//7.2新能源车车辆轴距≥2600mm 或者综合工况续航里程达到250 千米以上。
		String IS_CL_FXNY = String.valueOf(map.get("IS_CL_RYZJ"));//7.1燃油车车辆轴距≥2650mm，车辆购置的计税价格≥12万元。
		String IS_CL_JCZM = String.valueOf(map.get("IS_CL_JCZM"));//车辆检测证明与申请人信息是否一致。
		String IS_QF_XXSZ = String.valueOf(map.get("IS_QF_XXSZ"));//新机动车行驶证与申请信息是否匹配
		String IS_QF_ZRX = String.valueOf(map.get("IS_QF_ZRX"));//承运人责任险是否匹配
		if(IS_CL_CYC.equals("1")){
			nr += "<p>是否为乘用车(该项不符合)</p>";
		}
		if(IS_CL_BSHP.equals("1")){
			nr += "<p>是否为本市号牌车辆(该项不符合)</p>";
		}
		if(IS_CL_ZWS.equals("1")){
			nr += "<p>是否为7座及以下乘用车辆(该项不符合)</p>";
		}
		if(IS_CL_SYNX.equals("1")){
			nr += "<p>车辆行驶证载明的初次注册日期至申请时未满4年(该项不符合)</p>";
		}
		if(IS_CL_BZYQ.equals("1")){
			nr += "<p>车辆技术性能符合运营安全相关标准要求。(该项不符合)</p>";
		}
		if(IS_CL_WXDW.equals("1")){
			nr += "<p>已安装具有行驶记录功能的车辆卫星定位装置、应急报警装置。(该项不符合)</p>";
		}
		if(IS_CL_JSJG.equals("1")){
			nr += "<p>车辆购置的计税价格≥15 万元的不受车辆轴距参数限制。(该项不符合)</p>";
		}
		if(IS_CL_SFZTP.equals("1")){
			nr += "<p>身份证与申请人信息是否一致。(该项不符合)</p>";
		}
		if(IS_CL_DJZTP.equals("1")){
			nr += "<p>登记证书/合格证书/一致性证书与申请人信息是否一致。(该项不符合)</p>";
		}
		if(IS_CL_GZFPTP.equals("1")){
			nr += "<p>车辆购置发票是否符合要求。(该项不符合)</p>";
		}
		if(IS_CL_GZSFP.equals("1")){
			nr += "<p>车辆购置税缴税凭证是否符合要求(该项不符合)</p>";
		}
		if(IS_CL_XNY.equals("1")){
			nr += "<p>新能源车车辆轴距≥2600mm 或者综合工况续航里程达到250 千米以上；车辆购置的计税价格≥15万元的不受车辆轴距参数限制。(该项不符合)</p>";
		}
		if(IS_CL_FXNY.equals("1")){
			nr += "<p>燃油车车辆轴距≥2650mm，车辆购置的计税价格≥12万元；车辆购置的计税价格≥15万元的不受车辆轴距参数限制。(该项不符合)</p>";
		}
		if(IS_CL_JCZM.equals("1")){
			nr += "<p>车辆技术性能符合运营安全相关标准要求。(该项不符合)</p>";
		}
		if(IS_QF_XXSZ.equals("1")){
			nr += "<p>新机动车行驶证与申请信息是否匹配。(该项不符合)</p>";
		}
		if(IS_QF_ZRX.equals("1")){
			nr += "<p>承运人责任险是否匹配。(该项不符合)</p>";
		}
		return nr;
	}
}

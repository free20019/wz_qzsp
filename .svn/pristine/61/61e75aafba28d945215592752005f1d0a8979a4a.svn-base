
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
 * 用户登录service
 * @author Administrator
 *
 */

@Service
public class XxcxService extends MvcService{

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
	 * 查询平台信息
	 */
	public String ptxx(){
		String sql = "select JYZMC from tb_jyzjcxx j where is_yx='0'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 查询平台具体信息
	 */
	public String ptjtxx(String ptmc){
		String sql = "select JYZMC,ZZJGDMZH,JYFW,ZCZB,JYXKZH,JYXKZYXQQ,JYXKZYXQZ,TXDZ"
				+ " from tb_jyzjcxx j where j.JYZMC=? and j.is_yx='0'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,ptmc);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 驾驶员资格证信息查询
	 */
	public String jsyjtxx(String zjhm){
		String sql = "select xm,xb,jszh,sqrq"
				+ " from tb_jsysqxx where zjhm = ? and sqrq = (select max(sqrq) from tb_jsysqxx where zjhm = ?)";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,zjhm,zjhm);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 车辆信息查询
	 */
	public String cljtxx(String cphm){
		String sql = "select cphm,xm,PPXH,DJZDJRQ"
				+ " from tb_clsqxx where vin = ? and sqrq = (select max(sqrq) from tb_clsqxx where vin = ?)";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,cphm,cphm);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 检测信息查询
	 */
	public String cczxx(String vin){
		String sql = "select * from JCDATA where vin = ? and UPDATETIME = (select max(UPDATETIME) from JCDATA where vin = ?)";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,vin,vin);
		return jacksonUtil.toJson(list);
	}
	/**
	 * GPS数据查询
	 */
	public String gpsxx(String cphm){
		String sql = "select * from TB_WYC_GPS where vehicle_no = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,cphm);
		return jacksonUtil.toJson(list);
	}
	/**
	 * 初审通过车辆查询
	 */
	public String cstgcl(String cphm){
		String sql = "select * from TB_CLSQXX where cphm = ? and is_yx = '0'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,cphm);
		return jacksonUtil.toJson(list);
	}
}

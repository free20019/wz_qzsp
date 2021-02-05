package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 返回结果帮助类
 *
 */
public class ResultHelper {
	private static Logger logger = LoggerFactory.getLogger(ResultHelper.class);
	/**
	 * 返回结果，不传msg参数给默认值
	 * @param bool
	 * @return
	 */
	public static String getMsg(boolean bool){
		return getMsg(bool,null);
	}
	/**
	 * 返回结果
	 * @param bool
	 * @return
	 */
	public static String getMsg(boolean bool,String text){
		Map<String,Object> resultMap=new HashMap<String,Object>();
		if(bool){
			resultMap.put("status", StaticValues.SUCCESS);
		}else{
			resultMap.put("status",StaticValues.ERROR);
		}
		if(null != text){
			resultMap.put("text", text);
		}
		ObjectMapper mapper=new ObjectMapper();
		 try {
			return mapper.writeValueAsString(resultMap);
		} catch (Exception e) {
			logger.error("app_error",e);
		}
		return null;
	}
	
	/**
	 * 得到空列表集合json串
	 * @return
	 */
	public static  String getEmptyListStr(){
		List<Map<String,Object>> jsonList = new ArrayList<Map<String, Object>>();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("items",jsonList);
		ObjectMapper mapper=new ObjectMapper();
			try {
				return mapper.writeValueAsString(resultMap);
			} catch (Exception e) {
				logger.error("app_error",e);
				return null;
			}
	}
	/**
	 * 得到空对象json串
	 * @return
	 */
	public static  String getEmptyObjectStr(){
		return "{}";
	}
}

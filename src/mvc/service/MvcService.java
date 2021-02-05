package mvc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract  class MvcService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	protected  Map<String, String> genTypeMap(String exp) {
		Map<String,String> typeMap = new HashMap();
		if(exp.trim().isEmpty())return typeMap;
		String patt [] = exp.split("\\|");
		for(int i = 0;i<patt.length;i++){
			String dataType = patt[i].substring(0,1);
			String temp2 [] = patt[i].substring(2).split(",");
			for(String s:temp2){
				typeMap.put(s.trim(), dataType);
			}
		}
		return typeMap;
	}

	protected  Object[] genOcs(Map<String, Object> map2, String cs,
			String exp) {
		Map<String,String> map = genTypeMap(exp);
		List list =new ArrayList();
		String css[] = cs.split(",");
		for(int i=0;i<css.length;i++){
			Object o = null;
			o = map2.get(css[i]);
			try {
				if(map.containsKey(css[i])){
					String dateType = map.get(css[i]);
					if(dateType.toUpperCase().equals("D")){
						Date date = new Date();
						date.setTime((Long)o);
						o = date;
					}
					if(dateType.toUpperCase().equals("F")){
						o = Float.parseFloat((String) o);
					}
				}
			} catch (Exception e) {
				logger.error("app_error",e);
				o=null;
			}
			
			list.add(o);
		}
		return list.toArray();
	}
	
	protected String getPlaceholder(String columns) {
		String placeholder [] = new String [columns.split(",").length];
		Arrays.fill(placeholder,"?");
		String placeholderString = Arrays.toString(placeholder).replaceAll("[\\[\\]]", "");
		return placeholderString;
	}
	
	/**
	 * 判断验证码是否正确
	 * @param sessionYzm
	 * @param frontYzm
	 * @return
	 */
	//0输入正确  1验证码输入错误   2验证码超时
	public int captcha_correct(String sessionYzm,String fssj, String frontYzm){
		int count = 0;
		long l = Long.parseLong(fssj);
		long dq = System.currentTimeMillis() - 1000*60*3;
		if(l>dq){
			if(sessionYzm.equals(frontYzm)){
				count = 0;
			}else{
				count = 1;
			}
		}else{
			count =2;
		}
		return count;
	}
	
}

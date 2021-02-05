package helper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageClient {
	private static Logger  logger = LoggerFactory.getLogger(MessageClient.class);
	public static String sendMessage2(String phone,String message){
		 HttpClient  httpclient = new DefaultHttpClient();
		String flag = "";
		try {
			HttpGet httpget = new HttpGet("http://115.236.61.148:9080/tw/common/dxtestdx?tel="+phone+"&&code="+message);
			System.out.println("executing request " + httpget.getURI());
			HttpResponse response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			System.out.println("--------------------------------------");
			System.out.println(response.getStatusLine());
			if (entity != null) {
				EntityUtils.toString(entity).substring(9);
			}


		}catch(Exception e){
			logger.error("app_error",e);
		}finally {
			httpclient.getConnectionManager().shutdown();

		}


		return flag;
	}
	public static void main(String[] args) {
		sendMessage2("15968127425","你真帅");
	}
}

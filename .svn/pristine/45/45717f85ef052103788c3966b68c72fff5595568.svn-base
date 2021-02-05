package test;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class testDx {

	public static void main(String[] args) {
			HttpClient httpclient = new DefaultHttpClient();
			try {
				HttpGet httpget = new HttpGet("http://115.236.61.148:9080/tw/common/dxtestdx?tel=15968127425&&code=2334");
				System.out.println("executing request " + httpget.getURI());
				HttpResponse response = httpclient.execute(httpget);
				HttpEntity entity = response.getEntity();
				System.out.println("--------------------------------------");
				System.out.println(response.getStatusLine());
				if (entity != null) {
					System.out.println("Response content length: "
							+ entity.getContentLength());
					System.out.println("Response content: "
							+ EntityUtils.toString(entity));
				}

				System.out.println("------------------------------------");

			}catch(Exception e){
			 e.printStackTrace();
			}finally {
				httpclient.getConnectionManager().shutdown();

			}


	}
}

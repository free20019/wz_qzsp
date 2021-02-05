package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.type.TypeReference;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class test {
	private JacksonUtil jacksonUtil = JacksonUtil.buildNormalBinder();

	public static void main(String[] args) {
//		String strImg = getImageStr("D:/333.jpg");
//		System.out.println(strImg);
//		generateImage(strImg);
//		readTxtFile("D:/test.txt");
		generateImage();
	}


	public static boolean generateImage() {
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// 解密
			byte[] b = decoder.decodeBuffer("iVBORw0KGgoAAAANSUhEUgAAABkAAAAZCAYAAADE6YVjAAAEDklEQVR42rWW/U9TVxjHj+iAuUYiTMClgBgjSi6l0rq+3t7bkia+YJAWmYA4yZiDFoS2l3Z0iQvLEn8YGy5LNYhjKpIlZaB0GZJNIiqpY/EHKSkMtMX4wh+A4zez+Tx6KmyLmYS7Jt/c3NzT87nPeV6+l5DF3ypQHGg16A1QQp+sUnpH12C5axDao5y7L8K7L0V59w8Rzj1wj2v2h1lH61VVjbkmlUmD9RLQWlAiKB60hu4V90rA2e2WrBmD64tZztMf0h1z9MoP8fvTt22CZ2m6xI2ZvtwSfVBTZ58xCD2gcxcYqxKeJS2BJdC9Vi8FrKFvkDjJOj+c5T2X/XnlGr+83Bw2ODrgPvTQ1DI/Z/L+idco3I+zTZ1dedY9jVKVbIp1fhdmnV/C/5NB60Bv0agQ9DfAmxFO6Ajpm5wXZFZVhPdcmyv85K//EkRy/cSWXfxlRVUFHOOV4mQmg0YVA708okQ4645banvZDdXR6kcm78LrAGLC9QOK9+vac/aZIHdD6USyYQnoeRQJkwbHByHW4UDAXKH36XIAi/I+7ZNX2rplZdYp1tEF+75NQSS+U2aR3jd6BvCIHi8zgn9FZPQuHM8uNI/rjp3qLagogv1TCJZphG8+2ZN/4F0oz5GVAGL63eAczYpP2T7NuQaxGsm4ttEa5TyBfvkhsxiAmNpzikpv6+pPt20t0hOopq/v6BtdE2zTGTEhYxrbeV9ucelv2voTZBa62L+jnMM+EBNylxPCEhKfO8k6hp5DDkInQ4M9ERPywNgyD/lgZjjXLYKzCJODnSwm5DGUM+wrmzYIoyTKNQcUMIugmeb/h0gQEsRI/D6mWAvXCTEhM5wwiRDIyTUCw/CzoMZWH4JhJyZkVF17Ucjm9v2qtfnICPgBDLjvzzKWvaJBIL+tWworR9RHv+rMtZSS6vQdG6DcemozlFgJN8SATOibgnBU8imD6zpcs3F2Sbpl7xXAKOjBcQ0F8MdKAA+NLQu10p0lPymPfBpQVDXA/pmEulgSGFNbQHm4/EfFkdqVTOFvGWtznVS9GxL+C43iHUJNBS1z/T1eGGrP2W3qL6iy4zRdXgTehS7GKujWZ7Dwwj8f2JingD3RvFIJdUSMZp0lWSZF0MX8gyXebM48xbpuvk6SMQd4RPYs1R4ADLuzOCM9pnRqxy9MizpYEjoafIV0jesbfUpJGtO2ba9lTGM/B3UffmD8+AkeCTYa3t9Uf9R9fDNfiUke3FndCh5/hUYQA6RQv1+03xgIHa03v6IIeihwW9tw6jSzvwyHHc4ibLCYPJvY4mFVTRusu3qp4LCN5iBjCeCl/ca9AoSL0k6CH4xpbZ9DOQ5Oc0JwGgwJRwUkdhjG+TfgqqV080ya5NR/frE8A8Esla6CXGyqAAAAAElFTkSuQmCC");
			// 处理数据
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			OutputStream out = new FileOutputStream("D:/eewe.jpg");
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
//	public static void readTxtFile(String filePath) {
//		String lineTxt = "";
//		try {
//			String encoding = "UTF-8";
//			File file = new File(filePath);
//			if (file.isFile() && file.exists()) { // 判断文件是否存在
//				InputStreamReader read = new InputStreamReader(
//						new FileInputStream(file), encoding);// 考虑到编码格式
//				BufferedReader bufferedReader = new BufferedReader(read);
//				while ((lineTxt = bufferedReader.readLine()) != null) {
//					System.out.println(lineTxt);
//					generateImage(lineTxt);
//				}
//				read.close();
//			} else {
//				System.out.println("找不到指定的文件");
//			}
//		} catch (Exception e) {
//			System.out.println("读取文件内容出错");
//			e.printStackTrace();
//		}
//
//	}
//	
//	
//	public static String getImageStr(String imgFile) {
//		InputStream inputStream = null;
//		byte[] data = null;
//		try {
//			inputStream = new FileInputStream(imgFile);
//			data = new byte[inputStream.available()];
//			inputStream.read(data);
//			inputStream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		// 加密
//		BASE64Encoder encoder = new BASE64Encoder();
//		return encoder.encode(data);
//	}
}

package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class TestMd5 {

	public static void main(String[] args) {
		System.out.println(Hex.encodeHex(DigestUtils.md5("123456")));
		
		 try {
			 byte aa [] =  DigestUtils.md5("123456");
			 System.out.println(aa.length);
			 System.out.println(DigestUtils.md5("123456").length);
			 System.out.println(MessageDigest.getInstance("MD5").digest("4321".getBytes()).length);
			 System.out.println(MessageDigest.getInstance("MD5").digest("asdfa".getBytes()).length);
			 System.out.println(MessageDigest.getInstance("MD5").digest("341234".getBytes()).length);
			 System.out.println(MessageDigest.getInstance("MD5").digest("12342314131413241".getBytes()).length);
			String b64 = new String(Base64.encode( MessageDigest.getInstance("MD5").digest("12342314131413241".getBytes())));
			System.out.println(b64);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

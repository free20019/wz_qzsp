package helper;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QrCode {
	private static Logger logger = LoggerFactory.getLogger(QrCode.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void code(String content,ServletOutputStream servletOutputStream){
		int width = 160; // 图像宽度  
        int height = 160; // 图像高度  
        String format = "png";// 图像类型
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");  
        try {
        	BitMatrix bitMatrix = new MultiFormatWriter().encode(content,  
        			BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵  
        	MatrixToImageWriter.writeToStream(bitMatrix, format, servletOutputStream);// 输出图像  
        	servletOutputStream.close();
		} catch (Exception e) {
			logger.error("app_error",e);
		}
	}
	
	public static void codeWithStr(String str, String content,ServletOutputStream servletOutputStream){
		int width = 200; // 图像宽度  
        int height = 200; // 图像高度  
        String format = "png";// 图像类型
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");  
        try {
        	BitMatrix bitMatrix = new MultiFormatWriter().encode(content,  
        			BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵  
//        	MatrixToImageWriter.writeToStream(bitMatrix, format, servletOutputStream);// 输出图像  
//        	servletOutputStream.close();
        	BufferedImage b_img =  MatrixToImageWriter.toBufferedImage(bitMatrix);
        	BufferedImage bi4 = new BufferedImage(b_img.getWidth()+30,
            		b_img.getHeight() +40, BufferedImage.TYPE_INT_RGB);
    		Graphics2D g2 = bi4.createGraphics();
    		g2.setBackground(Color.WHITE);
    		g2.clearRect(0, 0, b_img.getWidth()+30, b_img.getHeight() +40);
    		g2.setColor(new Color(0, 0, 0));
    		int font_size = 14;
    		Font font=new Font("宋体",Font.CENTER_BASELINE,font_size);
    		g2.setFont(font);
//    		str = "网约车驾驶员证—姜栋栋";
    		g2.drawString(str, 35, font_size+5);
    		g2.drawImage(b_img, 15,5+1*font_size+10,null);
    		bi4.flush();
//    		File tempFile = new File("g://aaa.png");
//    		FileOutputStream fout = new FileOutputStream(tempFile);
//    		@SuppressWarnings("restriction")
//			JPEGImageEncoder encoder = new JPEGImageEncoderImpl(servletOutputStream);
//    		encoder.encode(bi4);
    		
    		ImageIO.write(bi4, "JPG", servletOutputStream);
    		servletOutputStream.flush();
    		servletOutputStream.close();
    		
		} catch (Exception e) {
			logger.error("app_error",e);
		}
	}

}

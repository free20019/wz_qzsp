//package helper;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.image.BufferedImage;  
//import java.io.File;  
//import java.io.FileOutputStream;
//import java.io.IOException;  
//import java.nio.file.FileSystems;  
//import java.nio.file.Path;  
//import java.util.HashMap;  
//import java.util.Map;  
//  
//
//
//
//
//
//import javax.imageio.ImageIO;  
//  
//
//
//
//
//
//import org.junit.Test;  
//  
//
//
//
//
//
//import sun.awt.image.codec.JPEGImageEncoderImpl;
//
//import com.alibaba.fastjson.JSONObject;  
//import com.google.zxing.BarcodeFormat;  
//import com.google.zxing.Binarizer;  
//import com.google.zxing.BinaryBitmap;  
//import com.google.zxing.DecodeHintType;  
//import com.google.zxing.EncodeHintType;  
//import com.google.zxing.LuminanceSource;  
//import com.google.zxing.MultiFormatReader;  
//import com.google.zxing.MultiFormatWriter;  
//import com.google.zxing.NotFoundException;  
//import com.google.zxing.Result;  
//import com.google.zxing.WriterException;  
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;  
//import com.google.zxing.client.j2se.MatrixToImageWriter;  
//import com.google.zxing.common.BitMatrix;  
//import com.google.zxing.common.HybridBinarizer;  
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
//  
//public class QRCodeTest {  
//  
//    /** 
//     * 生成图像 
//     *  
//     * @throws WriterException 
//     * @throws IOException 
//     */  
//   //
//	@Test  
//    public void testEncode() throws WriterException, IOException {  
//        String filePath = "D://";  
//        String fileName = "zxing.png";  
//        JSONObject json = new JSONObject();  
//        json.put(  
//                "zxing",  
//                "https://github.com/zxing/zxing/tree/zxing-3.0.0/javase/src/main/java/com/google/zxing");  
//        json.put("author", "shihy");  
//        String content = json.toJSONString();// 内容  
//        int width = 200; // 图像宽度  
//        int height = 200; // 图像高度  
//        String format = "png";// 图像类型  
//        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
//        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");  
//        BitMatrix bitMatrix = new MultiFormatWriter().encode(content,  
//                BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵  
//        Path path = FileSystems.getDefault().getPath(filePath, fileName);  
////        MatrixToImageWriter.writeToPath(bitMatrix, format, path);// 输出图像  
//        
//        
//        BufferedImage b_img =  MatrixToImageWriter.toBufferedImage(bitMatrix);
//        ///
//        
//        
//        BufferedImage bi4 = new BufferedImage(b_img.getWidth()+30,
//        		b_img.getHeight() +40, BufferedImage.TYPE_INT_RGB);
//		Graphics2D g2 = bi4.createGraphics();
//		g2.setBackground(Color.WHITE);
//		g2.clearRect(0, 0, b_img.getWidth()+30, b_img.getHeight() +40);
//		g2.setColor(new Color(0, 0, 0));
//		int font_size = 14;
//		Font font=new Font("宋体",Font.CENTER_BASELINE,font_size);
//		g2.setFont(font);
//		g2.drawString("网约车驾驶员证—姜栋栋", 35, font_size+5);
//		g2.drawImage(b_img, 15,5+1*font_size+10,null);
//		bi4.flush();
//		File tempFile = new File("g://aaa.png");
//		FileOutputStream fout = new FileOutputStream(tempFile);
//		JPEGImageEncoder encoder = new JPEGImageEncoderImpl(fout);
//		encoder.encode(bi4);
//		fout.flush();
//        System.out.println("输出成功.");  
//    }  
//  
//    /** 
//     * 解析图像 
//     */  
//    
//    /*
//    @Test  
//    public void testDecode() {  
//        String filePath = "D://zxing.png";  
//        BufferedImage image;  
//        try {  
//            image = ImageIO.read(new File(filePath));  
//            LuminanceSource source = new BufferedImageLuminanceSource(image);  
//            Binarizer binarizer = new HybridBinarizer(source);  
//            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);  
//            Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();  
//            hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");  
//            Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码  
//            JSONObject content = JSONObject.parseObject(result.getText());  
//            System.out.println("图片中内容：  ");  
//            System.out.println("author： " + content.getString("author"));  
//            System.out.println("zxing：  " + content.getString("zxing"));  
//            System.out.println("图片中格式：  ");  
//            System.out.println("encode： " + result.getBarcodeFormat());  
//        } catch (IOException e) {  
//            logger.error("app_error",e);  
//        } catch (NotFoundException e) {  
//            logger.error("app_error",e);  
//        }  
//    } */ 
//}  
package helper;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.lang.StringUtils;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

/**
 *
 */
public class BarcodeUtil {

	/**
	 * 生成文件
	 * 
	 * @param msg
	 * @param path
	 * @return
	 */
	public static File generateFile(String msg, String path) {
		File file = new File(path);
		try {
//			generate(msg, new FileOutputStream(file));
			generate2(msg, new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return file;
	}

	/**
	 * 生成字节
	 * 
	 * @param msg
	 * @return
	 */
	public static byte[] generate(String msg) {
		ByteArrayOutputStream ous = new ByteArrayOutputStream();
		generate(msg, ous);
		return ous.toByteArray();
	}

	/**
	 * 生成到流
	 * 
	 * @param msg
	 * @param ous
	 */
	public static void generate(String msg, OutputStream ous) {
		if (StringUtils.isEmpty(msg) || ous == null) {
			return;
		}

		// Code39Bean bean = new Code39Bean();
		// EAN13Bean bean = new EAN13Bean();
		Code128Bean bean = new Code128Bean();
		// 精细度
		final int dpi = 350;
		// module宽度
		final double moduleWidth = UnitConv.in2mm(3.8f / dpi);

		System.out.println(moduleWidth);
		// 配置对象
		bean.setModuleWidth(moduleWidth);
		bean.setBarHeight(10);
		// bean.setWideFactor(3);
		// bean.doQuietZone(false);

		String format = "image/png";
		try {

			// 输出到流
			BitmapCanvasProvider canvas = new BitmapCanvasProvider(ous, format,
					dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);

			// 生成条形码
			bean.generateBarcode(canvas, msg);

			// 结束绘制
			canvas.finish();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		String msg = "王大仙";
		String path = "datamarix.png";
		generateFile(msg, path);
	}

	/**
	 * 生成到流
	 * 
	 * @param msg
	 * @param ous
	 */
	public static void generate2(String msg, OutputStream ous) {
		if (StringUtils.isEmpty(msg) || ous == null) {
			return;
		}

		DataMatrixBean bean = new DataMatrixBean();
		// 精细度
		final int dpi = 350;
		// module宽度
		final double moduleWidth = UnitConv.in2mm(3.8f / dpi);

		System.out.println(moduleWidth);
		// 配置对象
//		bean.setModuleWidth(moduleWidth);
//		bean.setBarHeight(10);
		// bean.setWideFactor(3);
		// bean.doQuietZone(false);

		String format = "image/png";
		try {

			// 输出到流
			BitmapCanvasProvider canvas = new BitmapCanvasProvider(ous, format,
					dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);

			// 生成条形码
			bean.generateBarcode(canvas, msg);

			// 结束绘制
			canvas.finish();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
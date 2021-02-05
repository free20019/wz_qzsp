package mvc.dao;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExcelUtil {
	 public static Workbook createWorkBook(List<Map<String, Object>> list,
			 String []keys,String columnNames[],String gzb) {
	        // 创建excel工作簿
	        Workbook wb = new HSSFWorkbook();
	        // 创建第一个sheet（页），并命名
	        Sheet sheet = wb.createSheet(gzb);
	        // 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
	        for(int i=0;i<keys.length;i++){
	            sheet.setColumnWidth((short) i, (short) (35.7 * 150));
	        }

	        // 创建第一行
	        Row row = sheet.createRow((short) 0);

	        // 创建两种单元格格式
	        CellStyle cs = wb.createCellStyle();
	        CellStyle cs2 = wb.createCellStyle();

	        // 创建两种字体
	        Font f = wb.createFont();
	        Font f2 = wb.createFont();

	        // 创建第一种字体样式（用于列名）
	        f.setFontHeightInPoints((short) 10);
	        f.setColor(IndexedColors.BLACK.getIndex());
	        f.setBoldweight(Font.BOLDWEIGHT_BOLD);

	        // 创建第二种字体样式（用于值）
	        f2.setFontHeightInPoints((short) 10);
	        f2.setColor(IndexedColors.BLACK.getIndex());

//	        Font f3=wb.createFont();
//	        f3.setFontHeightInPoints((short) 10);
//	        f3.setColor(IndexedColors.RED.getIndex());

	        // 设置第一种单元格的样式（用于列名）
	        cs.setFont(f);
	        cs.setBorderLeft(CellStyle.BORDER_THIN);
	        cs.setBorderRight(CellStyle.BORDER_THIN);
	        cs.setBorderTop(CellStyle.BORDER_THIN);
	        cs.setBorderBottom(CellStyle.BORDER_THIN);
	        cs.setAlignment(CellStyle.ALIGN_CENTER);

	        // 设置第二种单元格的样式（用于值）
	        cs2.setFont(f2);
	        cs2.setBorderLeft(CellStyle.BORDER_THIN);
	        cs2.setBorderRight(CellStyle.BORDER_THIN);
	        cs2.setBorderTop(CellStyle.BORDER_THIN);
	        cs2.setBorderBottom(CellStyle.BORDER_THIN);
	        cs2.setAlignment(CellStyle.ALIGN_CENTER);
	        //设置列名
	        for(int i=0;i<columnNames.length;i++){
	            Cell cell = row.createCell(i);
	            cell.setCellValue(columnNames[i]);
	            cell.setCellStyle(cs);
	        }
	        //设置每行每列的值
	        int rowss=1;
	        for (short i = 0; i < list.size(); i++) {
	            // Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
	            // 创建一行，在页sheet上
	            Row row1 = sheet.createRow((short) rowss+i);
	            // 在row行上创建一个方格
	            for(short j=0;j<keys.length;j++){
	                Cell cell = row1.createCell(j);
	                cell.setCellValue(list.get(i).get(keys[j]) == null?" ": list.get(i).get(keys[j]).toString());
	                cell.setCellStyle(cs2);
	            }
	        }
	        return wb;
	    }

	public static Workbook createWorkBook2(List<Map<String, Object>> list,
										  String []keys,String columnNames[], String []keys2,String columnNames2[],String gzb) {
		//**列数
		int rowaccess = columnNames.length;
		// 创建excel工作簿
		Workbook wb = new HSSFWorkbook();
		// 创建第一个sheet（页），并命名
		Sheet sheet = wb.createSheet(gzb);
		// 手动设置列宽。第一个参数表示要为第几列设；第二个参数表示列的宽度，n为列高的像素数。
		for(int i=0;i<keys.length;i++){
			sheet.setColumnWidth((short) i, (short) (100 * 150));
		}

		CellStyle cs = wb.createCellStyle();
		CellStyle cs2 = wb.createCellStyle();
		// 创建两种字体
		Font f = wb.createFont();
		Font f2 = wb.createFont();

		// 创建第一种字体样式（用于列名）
		f.setFontHeightInPoints((short) 10);
		f.setColor(IndexedColors.BLACK.getIndex());
		f.setBoldweight(Font.BOLDWEIGHT_BOLD);

		// 创建第二种字体样式（用于值）
		f2.setFontHeightInPoints((short) 10);
		f2.setColor(IndexedColors.BLACK.getIndex());
		// 设置第一种单元格的样式（用于列名）
		cs.setFont(f);
		cs.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cs.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cs.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cs.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cs.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		cs.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直
		cs.setWrapText(true);

		// 设置第二种单元格的样式（用于值）
		cs2.setFont(f2);
		cs2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cs2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		cs2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直
		cs2.setWrapText(true);


		int row_number=0;
		// 创建第1行
		Row row1 = sheet.createRow((short) row_number);
		for(int i=1;i<rowaccess;i++){
			row1.createCell(i).setCellStyle(cs);
		}
		Cell cell1 = row1.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, rowaccess-1));
		cell1.setCellValue("巡游出租车公司补助申报清单");
		cell1.setCellStyle(cs);
		row_number=row_number+1;

		// 创建表开头的行名及值
		for (short i = 0; i < columnNames2.length; i++) {
			//第1列
			Row row2_1 = sheet.createRow((short) row_number+i);
			Cell cell2_0 = row2_1.createCell(0);
			cell2_0.setCellValue(columnNames2[i]);
			cell2_0.setCellStyle(cs2);
			//第2列
			Cell cell2_2 = row2_1.createCell(1);
			if(list.size()>0){
				if("车辆总数".equals(columnNames2[i])){
					cell2_2.setCellValue(list.get(0).get(keys2[i]) == null?"		（车辆清单附后，每页盖章）": list.get(0).get(keys2[i]).toString()+"		（车辆清单附后，每页盖章）");
				}else{
					cell2_2.setCellValue(list.get(0).get(keys2[i]) == null?"": list.get(0).get(keys2[i]).toString());
				}

			}else{
				if("车辆总数".equals(columnNames2[i])){
					cell2_2.setCellValue("		（车辆清单附后，每页盖章）");
				}else{
					cell2_2.setCellValue("");
				}
			}
			cell2_2.setCellStyle(cs2);
		}
		row_number=row_number+columnNames2.length;

		// 创建第2+columnNames2.length行
		Row row3_0 = sheet.createRow((short) row_number);
		row3_0.setHeightInPoints(60);
		Cell cell3_0  = row3_0.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, 0));
		cell3_0.setCellStyle(cs2);
		cell3_0.setCellValue("承  诺");

		Cell cell3_1  = row3_0.createCell(1);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, rowaccess-1, rowaccess-1));
		String str="    本公司承诺所填信息均属实，如有虚假，原承担一切法律责任。"+"\r\n" +
				"                       		盖章："+"\r\n" +
				"                          			年  月  日";
		cell3_1.setCellStyle(cs2);
		cell3_1.setCellValue(new HSSFRichTextString(str));
		row_number=row_number+1;

		// 创建第6+columnNames2.length行
		Row row4_0 = sheet.createRow((short) row_number);
		for(int i=1;i<rowaccess;i++){
			row4_0.createCell(i).setCellStyle(cs);
		}
		Cell cell4_0 = row4_0.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, rowaccess-1));
		cell4_0.setCellValue("附：公司所属车辆清单");
		cell4_0.setCellStyle(cs2);
		row_number=row_number+1;

		//表后面数据列数
		//设置列名
		Row row5_0 = sheet.createRow((short) row_number);
		for(int i=0;i<columnNames.length;i++){
			Cell cell5_0 = row5_0.createCell(i);
			cell5_0.setCellValue(columnNames[i]);
			cell5_0.setCellStyle(cs);
		}
		row_number=row_number+1;

		//设置每行每列的值
		for (short i = 0; i < list.size(); i++) {
			// Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
			// 创建一行，在页sheet上
			Row row6_0 = sheet.createRow((short) row_number+i);
			// 在row行上创建一个方格
			for(short j=0;j<keys.length;j++){
				Cell cell6_0 = row6_0.createCell(j);
				cell6_0.setCellValue(list.get(i).get(keys[j]) == null?" ": list.get(i).get(keys[j]).toString());
				cell6_0.setCellStyle(cs2);
			}
		}
		return wb;
	}

	public static Workbook createWorkBook3(List<Map<String, Object>> list,
										  String []keys,String columnNames[],String gzb) {
		//**列数
		int rowaccess = columnNames.length;
		// 创建excel工作簿
		Workbook wb = new HSSFWorkbook();
		// 创建第一个sheet（页），并命名
		Sheet sheet = wb.createSheet(gzb);
		// 手动设置列宽。第一个参数表示要为第几列设；第二个参数表示列的宽度，n为列高的像素数。
		for(int i=0;i<keys.length;i++){
			sheet.setColumnWidth((short) i, (short) (50 * 150));
		}

		CellStyle cs = wb.createCellStyle();
		CellStyle cs2 = wb.createCellStyle();
		// 创建两种字体
		Font f = wb.createFont();
		Font f2 = wb.createFont();

		// 创建第一种字体样式（用于列名）
		f.setFontHeightInPoints((short) 10);
		f.setColor(IndexedColors.BLACK.getIndex());
		f.setBoldweight(Font.BOLDWEIGHT_BOLD);

		// 创建第二种字体样式（用于值）
		f2.setFontHeightInPoints((short) 10);
		f2.setColor(IndexedColors.BLACK.getIndex());
		// 设置第一种单元格的样式（用于列名）
		cs.setFont(f);
		cs.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cs.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cs.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cs.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cs.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		cs.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直
		cs.setWrapText(true);

		// 设置第二种单元格的样式（用于值）
		cs2.setFont(f2);
		cs2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cs2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cs2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		cs2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直
		cs2.setWrapText(true);


		int row_number=0;
		// 创建第1行
		Row row1 = sheet.createRow((short) row_number);
		for(int i=1;i<rowaccess;i++){
			row1.createCell(i).setCellStyle(cs);
		}
		Cell cell1_0 = row1.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, rowaccess-1));
		cell1_0.setCellValue("营权所有人补助经申报清单");
		cell1_0.setCellStyle(cs);
		row_number=row_number+1;

		// 创建第2行
		Row row2 = sheet.createRow((short) row_number);
		for(int i=1;i<rowaccess;i++){
			row2.createCell(i).setCellStyle(cs);
		}
		Cell cell2_0 = row2.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, rowaccess-1));
		cell2_0.setCellValue(" 我公司拟对下列巡游出租车申报补助，补助资金到位后将全额发放至经营权所有人，涉及巡游出租车       辆，补助资金             。");
		cell2_0.setCellStyle(cs2);
		row_number=row_number+1;

		// 创建第3行
		Row row3 = sheet.createRow((short) row_number);
		for(int i=1;i<rowaccess;i++){
			row3.createCell(i).setCellStyle(cs);
		}
		Cell cell3_0 = row3.createCell(0);
		sheet.addMergedRegion(new CellRangeAddress(row_number, row_number, 0, rowaccess-1));
		cell3_0.setCellValue(" 巡游出租车公司（盖章）\t　\t年   月   日");
		cell3_0.setCellStyle(cs2);
		row_number=row_number+1;


		//表后面数据列数
		//设置列名
		Row row5_0 = sheet.createRow((short) row_number);
		for(int i=0;i<columnNames.length;i++){
			Cell cell5_0 = row5_0.createCell(i);
			cell5_0.setCellValue(columnNames[i]);
			cell5_0.setCellStyle(cs);
		}
		row_number=row_number+1;

		//设置每行每列的值
		for (short i = 0; i < list.size(); i++) {
			// Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
			// 创建一行，在页sheet上
			Row row6_0 = sheet.createRow((short) row_number+i);
			// 在row行上创建一个方格
			for(short j=0;j<keys.length;j++){
				Cell cell6_0 = row6_0.createCell(j);
				cell6_0.setCellValue(list.get(i).get(keys[j]) == null?" ": list.get(i).get(keys[j]).toString());
				cell6_0.setCellStyle(cs2);
			}
		}
		return wb;
	}
}

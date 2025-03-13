package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static  void main(String[] args) throws IOException {
		
		//FileOutPutStream file=new FileOutPutStream(System.getProperty("user.dir" +"\\testdata\\myfile.xlsx"));
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		        row1.createCell(0).setCellValue("java");
		        row1.createCell(1).setCellValue(19);
		        row1.createCell(2).setCellValue("automation");
		
	   XSSFRow row2=sheet.createRow(1);
		        row2.createCell(0).setCellValue("B2b");
		        row2.createCell(1).setCellValue(3);
		        row2.createCell(2).setCellValue("Testers");	
		        
      XSSFRow row3=sheet.createRow(2);
		        row3.createCell(0).setCellValue("fynd");
		        row3.createCell(1).setCellValue(9);
		        row3.createCell(2).setCellValue("Mocha and Extensions");	
	
		        workbook.write(file);
		        workbook.close();
		        file.close();
		        
		        System.out.println("file is created.......");
		

	}

}

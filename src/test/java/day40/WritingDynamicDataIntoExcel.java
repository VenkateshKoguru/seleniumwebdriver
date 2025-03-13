package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\DynamicData.xlxs");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("UserName");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows ...?");
		int noOfRows=sc.nextInt();
		
		System.out.println("Enter how many cell ...?");
		int noOfCell=sc.nextInt();
		
		
		for(int r=0;r<=noOfRows;r++) {
			
			XSSFRow currentRows=sheet.createRow(r);
			
			for(int c=0;c<noOfCell;c++) {
			XSSFCell	currentCells=currentRows.createCell(c);
			currentCells.setCellValue(sc.nextInt());
				
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created......");
		
		

	}

}

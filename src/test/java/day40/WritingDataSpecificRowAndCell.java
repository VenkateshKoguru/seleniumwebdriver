package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataSpecificRowAndCell {

	
		public static void main(String[] args) throws IOException {
			FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\ChampionTrophy.xlxs");
			
			XSSFWorkbook workbook=new XSSFWorkbook();
			
			XSSFSheet sheet=workbook.createSheet("BBC");
			XSSFRow row=sheet.createRow(3);
			XSSFCell cell=row.createCell(3);
			
			cell.setCellValue("Hello");
			
			
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("file is created......");
			
			

		}


	}



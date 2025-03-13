package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");

		int totalRows = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();

		System.out.println(totalRows);
		System.out.println(totalcell);

		for (int r = 0; r <= totalRows; r++) {
			XSSFRow countRow = sheet.getRow(r);

			for (int c = 0; c < totalcell; c++) {
				XSSFCell cell = countRow.getCell(c);
				System.out.print(cell.toString()+"\t");

			}
			System.out.println();
		}
		workbook.close();
		file.close();
		

	}

}

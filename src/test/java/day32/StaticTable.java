package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// 1)Find total number of row in a table

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows is:" + rows);

		// int rows=driver.findElements(By.tagName("tr")).size();
		// System.out.println(rows);

		// 2) find Total number of column in a table

		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		// int cols=driver.findElements(By.tagName("th")).size();
		System.out.println("Number of column is: " + cols);

		// 3 Read data from specific row and colum(5th row 1st column)
		//String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName); // Master In Selenium

		/*
		// 4 read data from all the rows and colums
		for (int r = 2; r <= rows; rows++) {
			for (int c = 1; c <= cols; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}
     */
		/*
		//5)Print Book names whose auther is Mukesh
		for(int r=2;r<=rows;r++) {
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ r +"]//td[2]")).getText();
		    System.out.println(authorName);
		    if(authorName.equals("Mukesh")) {
		    	String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ r +"]//td[1]")).getText();
		        System.out.println(bookName+"\t"+authorName);
		    }
		        
		}
		*/
		//6Find Total price of all The Books
		int total=0;
		for(int r=2;r<=rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ r +"]//td[4]")).getText();
		    System.out.println(price);
		    total=total+Integer.parseInt(price);
		   
		}
		System.out.println("Total price of Books" + total);
		//https://blazedemo.com/confirmation.php	
	}

}

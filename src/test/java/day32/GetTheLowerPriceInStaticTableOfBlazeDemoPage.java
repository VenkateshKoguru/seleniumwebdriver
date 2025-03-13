package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTheLowerPriceInStaticTableOfBlazeDemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement drpDepartureCity = driver.findElement(By.xpath("//select[@name='fromPort']"));

		Select depCity = new Select(drpDepartureCity);
		depCity.selectByVisibleText("Paris");

		WebElement drpDestinationCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select desCity = new Select(drpDestinationCity);
		desCity.selectByVisibleText("Buenos Aires");

		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		// 1 findTotal Number of rows in Table
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		// int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Number Of Rows :" + rows);

		// 2 find Total Number of Columns In a table
		int cols = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("Number of Column: " + cols);

		// 3 Read data from specific row and column
		String flightNumber = driver.findElement(By.xpath("//table[@class='table']//tr[5]//td[2]")).getText();
		System.out.println(flightNumber);

		// 4 Read data from all the rows and column
		System.out.println("Choose" + "\t" + "Flight #" + "\t" + "Airline" + "\t" + "Departs: Paris" + "\t"
				+ "Arrives: Buenos Aires" + "\t" + "Price");
		for (int r = 2; r < rows; r++) {
			for (int c = 3; c <= cols; c++) {
				String values = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(values + "\t");

			}
			System.out.println();
		}

		// 6 Find total price of all Flights
		// float total=0;
		float smallestPrice = Float.MAX_VALUE;
		for (int r = 2; r < rows; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
			String cleanedPrice = price.replace("$", "");
			Float numericPrice = Float.parseFloat(cleanedPrice);

			if (numericPrice < smallestPrice) {
				smallestPrice = numericPrice;
			}
		}

		System.out.println("The total amount is:" + smallestPrice);

		driver.findElement(By.xpath("//input[@value='" + smallestPrice + "']/preceding-sibling::td")).click();
		String label = driver.findElement(By.xpath("//h2[text()='Your flight from TLV to SFO has been reserved.']")).getText();
		System.out.println(label);
		if (label.equals("Your flight from TLV to SFO has been reserved.")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

	}

}

package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	static void futureDate(WebDriver driver, String month, String year, String date) {
		while (true) {
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();

		}

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	static void pastDate(WebDriver driver, String month, String year, String date) {
		while (true) {
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click();//next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}

		}

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		String year = "2018";
		String month = "March";
		String date = "1";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		// futureDate(driver,month,year,date);
		pastDate(driver, month, year, date);

	}

}

package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	// select month & Year
	static void futureDate(WebDriver driver, String month, String year, String date) {

		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();

		}

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

	static void pastDate(WebDriver driver, String month, String year, String date) {

		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);
		// method 1
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/05/2025");//mm//dd//yyyy

		// method2:
		String year = "2020";
		String month = "February";
		String date = "29";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//futureDate(driver,month,year,date);
		pastDate(driver,month,year,date);
	}

}

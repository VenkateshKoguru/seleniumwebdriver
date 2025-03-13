package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md' and text()='My Account']")).click();
		boolean status = driver
				.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='My Account']"))
				.isDisplayed();
		if (status == true) {
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]/parent::li/parent::ul")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name = "dp",indices= {0,2})
	Object[][] loginData() {

		Object Data[][] = {

				{ "xyz@gmail.com", "test123" },
				{ "jhon@gmail.com", "test@00" },
				{ "hyd@gmail.com", "test@147" },
				{ "hyd01@gmail.com", "test@147"},
				{ "b2b@gmail.com", "test@123" },

		};
		return Data;

	}
}

package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.*;

public class ParallelTesting {
	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) {
		switch(br.toLowerCase())
		{
		case "chrome" :driver=new ChromeDriver(); break;
		case "edge"   : driver=new EdgeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;
		default: System.out.println("Invalid browser");return;
		
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	@Test(priority=1)
	void testLogo() throws InterruptedException {
		Thread.sleep(10);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, false);
	
	}
	
	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Test(priority=3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}

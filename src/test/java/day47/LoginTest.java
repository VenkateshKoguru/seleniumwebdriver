package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
	void setUp() {
       driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	
	}
    @Test
	void testLogin() {
    	LoginPage lp=new LoginPage(driver);
    	
    	lp.setUserName("Admin");
    	lp.setPassword("admin123");
    	lp.clickOnLogin();
    	
    	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	void tearDown() {
      driver.quit();
	}
}

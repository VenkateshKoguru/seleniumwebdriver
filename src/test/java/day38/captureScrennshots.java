package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScrennshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
		
	  //1)Full Page Screen shot
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		//sourcefile.renameTo(targetfile); //copy sourcefile to target file
		//2) capure the screenshots of specific section
		
		//WebElement computers=driver.findElement(By.xpath("//div[@class='page category-page']"));
		
		//File soucefile=computers.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\computers.png");
		//soucefile.renameTo(targetfile);
		//3 capure the screenshot of webelement
		
        WebElement logo=driver.findElement(By.xpath("img[alt='nopCommerce demo store']"));
		File soucefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		soucefile.renameTo(targetfile);
		
		
		driver.quit();
		
	}

}

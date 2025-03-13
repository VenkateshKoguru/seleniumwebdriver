package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChainedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		boolean imaStatus=driver.findElement(By.xpath("//div[@class='image']/a/img[@title='MacBook']")).isDisplayed();
		System.out.println(imaStatus);
		
		String getImgText=driver.findElement(By.xpath("//div[@class='image']/a/img[@title='MacBook']")).getText();
		System.out.println(getImgText);
		
		

	}

}

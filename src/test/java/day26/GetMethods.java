package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Get Url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
        //Get Title
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Get Current Url
		System.out.println(driver.getCurrentUrl());
		
		//Get Page Source
		//System.out.println(driver.getPageSource());
		
		
		//Get Window Handle
	   //String windowid=driver.getWindowHandle();
	   //System.out.println("Window ID :" + windowid);
	   
	   
	   //Get Window Handles
	   
	   driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //open New Browser window
	   
	   Set<String>multipleIds=driver.getWindowHandles();
	   
	   System.out.println(multipleIds);
	   
		
		
		
		
	}

}

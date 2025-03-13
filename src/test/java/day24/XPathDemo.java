package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Pens");
		
        // driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
	
	   //X-path and and Or Attribute
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Hello");
	   //.findElement(By.xpath("//input[@name='search' or @placeholder='Se1arch']")).sendKeys("B2b");
	
	//inner text
	 //a[text()='Desktops']
	  
	
	}
	
}


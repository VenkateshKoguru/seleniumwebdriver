package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Name
		driver.findElement(By.name("search")).sendKeys("iphone");
		
		boolean logoDisplayStattus=driver.findElement(By.id("logo")).isDisplayed();
         System.out.println(logoDisplayStattus);
         
         //driver.findElement(By.linkText("Tablets")).click();
         
        // driver.findElement(By.partialLinkText("Tab")).click();
	
	List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
	
	System.out.println("totlal number of header links" + headerLinks.size());
	
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links" + links.size());
	
	
	  List<WebElement>images=driver.findElements(By.tagName("a"));
	System.out.println("Total Numbers of Images" +images.size());
	
	
	  
	}

}

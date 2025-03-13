package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTotalNumberLinksAndImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
      List<WebElement> links=driver.findElements(By.className("nav-item"));
	  System.out.print("Total NUmber of Linsk :" +links);
	  
	  System.out.println();
      System.out.println("Total NUmber of Linsk :" +links.size());
      
      
      List<WebElement>img=driver.findElements(By.tagName("a"));
      System.out.println("Total NUmber Images are :"+ img.size());
      
       driver.findElement(By.linkText("Cart")).click();
       
       
	}

}

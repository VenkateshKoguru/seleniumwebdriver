package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowserWindowBlogSpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		search.sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		//get the count of the links
	
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		System.out.println("Number of Links :" + links.size());
		
		

		for(int i=0;i<links.size();i++) {
			links.get(i).click();

		}
		Set<String> windowIDs =new HashSet<String>();
		windowIDs=	driver.getWindowHandles();

		System.out.println(windowIDs.size());
		for(int i=0;i<windowIDs.size();i++) {
			
		List<String> windList=new LinkedList<String>(windowIDs); 
	//	String  parentID=windList.get(0); 
		  String childID=windList.get(i);
		    String parentID = windList.get(0);

		  driver.switchTo().window(childID);
		  //switch to Child Window driver.switchTo().window(childID);
		 System.out.println(driver.getTitle());
		    //driver.switchTo().window(parentID);

		  //switch to Parent Window driver.switchTo().window(parentID);
	//	  System.out.println(parentID);
		 
		  {
			 
		 }
		 
		 
	}
	}
}

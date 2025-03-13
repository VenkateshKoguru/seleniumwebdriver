package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		 //self -selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Strides Pharma Scien')]/self::a")).getText();
	    System.out.println(text);
	    
	    //Parent -Selectr the parent of the current node(always one)
	    text=driver.findElement(By.xpath("//a[contains(text(),'Strides Pharma Scien')]/parent::td")).getText();
	    System.out.println(text);
	    
	    //Child - Select All children of the current node(One or Many)
	    
	    
	    
	    
	}

}

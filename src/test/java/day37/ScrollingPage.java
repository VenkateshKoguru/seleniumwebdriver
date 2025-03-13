package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1) scroll down page by pixel number
		
      //  js.executeAsyncScript("window.scrollBy(0,1500)","");
       // System.out.println(js.executeScript("return window.pageYoffset", ""));
        
       // WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
       // js.executeScript("arguments[0].scrollIntoView();", ele);
       // System.out.println(js.executeScript("return window.pageYoffset", ""));
		
		
		//3) scroll endof the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		System.out.println(js.executeScript("retrun window.pageYOffset"));

	}

}

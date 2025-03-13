package day38;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new"); //setting for headless mode execution
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.nopcommerce.com/en");
		
		driver.getTitle();
		String act_title=driver.getTitle();
		
		if(act_title.equals("Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce")) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		

	}

}

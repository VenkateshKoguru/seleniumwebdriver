package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
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

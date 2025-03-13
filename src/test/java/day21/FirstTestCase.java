package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	/*
	 * Test Case 1.Launch browser(chrome) 2. Open URL https://demo.opencart.com/
	 * 3.Vlaidrte title should be "Your Store" 4.Close browser
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Launch browser(chrome)
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();

		if (act_title.equals("Your Store")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}
		driver.close();
	}

}

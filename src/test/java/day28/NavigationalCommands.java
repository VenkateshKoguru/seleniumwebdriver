package day28;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopecommerce.com/");
		
		driver.navigate().to("https://demo.nopecommerce.com/");
		
		//URL =new URL("https://demo.nopecommerce.com/");
		//driver.navigate().to();

	}

}

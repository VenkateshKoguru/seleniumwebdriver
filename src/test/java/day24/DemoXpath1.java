package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		boolean displayStatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		String LabelGetText=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(LabelGetText);

	}

}

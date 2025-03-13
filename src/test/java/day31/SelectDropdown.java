package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
	   
		Select drpCountry=new Select(drpCountryEle);
		//select options from the dropdown
		//drpCountry.selectByVisibleText("Canada");
		//drpCountry.selectByValue("india");
		//drpCountry.selectByIndex(0);
		
		
		//caputure the options from the dropdown
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("NUmber of options in a drop down:"+ options.size());
		
		/*
		//printing the options
		for(int i=0;i<options.size();i++) {
			
			System.out.println(options.get(i).getText());
		}
		*/
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	
	}

}

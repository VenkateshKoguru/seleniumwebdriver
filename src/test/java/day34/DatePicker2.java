package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		//input Selected Year
		String requiredYear="2027";
		String requiredMonth="May";
		String requiredDate="11";
		
		/*String year = "2018";
		String month = "March";
		String date = "1";
		*/
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();

       WebElement yearDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
       Select selectYear=new Select(yearDropdown);
       selectYear.selectByVisibleText(requiredYear);
       
       WebElement monthDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	   Select selectMonth=new Select(monthDropdown);
	   selectMonth.selectByVisibleText(requiredMonth);
	
	   List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(requiredDate)) {
				dt.click();
				break;
			}

		}
	   
	   /*
	    //Case is different:-
	   String displayMonth=driver.findElement(By.xpath("")).getText();
	   //Convert requiredMonth & displayMonth in to Month Objects
	   */
	}

}

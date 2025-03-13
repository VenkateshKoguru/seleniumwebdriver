package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
       Thread.sleep(5000);
       
       Alert myalert=driver.switchTo().alert();
       System.out.println(myalert.getText());
       String text=(myalert.getText());
       
       if(text.equals("I am an alert box!")) {
    	   System.out.println("TC Pass");
    	   
       }
       else {
    	   System.out.println("TC Failed");
       }
       myalert.accept();
       
	}

}



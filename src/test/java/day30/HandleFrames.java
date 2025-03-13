package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
        
        //Frame 1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);//passed frame as webeement swith to frmame1
	  
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello frame");
        driver.switchTo().defaultContent();
        //frame2
       WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
       driver.switchTo().frame(frame2);
       driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello frame2");
       driver.switchTo().defaultContent();	
	  //frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
        
        //inner iframe --
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("arguments(0).click();", rdbuttons);
	
	   driver.switchTo().defaultContent();
	}

}

package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.nopcommerce.com/");
     
     driver.manage().window().maximize();//maximize window
    //tag id ==tag#id
     //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Hello");
     //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Hello");
     
     //tag class== tag.classname
     //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Coffee");
     
     //tag[attribute]
     //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Fynd");
     
     //tag class attribute
     
     driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Hello B2b");
	}

}

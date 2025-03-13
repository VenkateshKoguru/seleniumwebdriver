package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlecheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1) Select specific checkbox
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// 2) select all the checkboxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and @type='checkbox']"));

		// 1.for loop
		/*
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		// 2 enhanced forloop
		/*
		 * for(WebElement checkbx:checkboxes) { checkbx.click(); }
		 */
		// 3 find Last 3 checkboxes
		/*
		 * for(int i=4;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		// 4 1st three checkBoxes
		/*
		 * for(int i=0;i<3;i++) { checkboxes.get(i).click(); }
		 */

		// 5 unselected checkboxes(if they are selected)
		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}

		Thread.sleep(5000);

		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}

	}

}

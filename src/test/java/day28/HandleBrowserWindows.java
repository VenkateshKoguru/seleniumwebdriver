package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Set<String> windowIDs = driver.getWindowHandles();
		// Approach:1
		/*
		 * List<String> windList=new ArrayList(windowIDs); String
		 * parentID=windList.get(0); String childID=windList.get(1);
		 * 
		 * //switch to Child Window driver.switchTo().window(childID);
		 * System.out.println(driver.getTitle());
		 * 
		 * //switch to Parent Window driver.switchTo().window(parentID);
		 * System.out.println(parentID);
		 */
		// Approach2
		for (String winId : windowIDs) {
			String title = driver.switchTo().window(winId).getTitle();
			// if (title.equals("OrangeHRM")) {

			if (title.equals("OrangeHRM"))
				System.out.println(driver.getCurrentUrl());

		}

	}

}

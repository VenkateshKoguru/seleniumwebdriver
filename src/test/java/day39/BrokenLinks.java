package day39;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/errorlist.asp");
		driver.manage().window().maximize();

		// capure all the links from website

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links" + links.size());

		int noOfBrokenLinks = 0;

		for (WebElement linkElement : links) {

			String hrefattValue = linkElement.getAttribute("href");
			if (hrefattValue == null || hrefattValue.isEmpty()) {
				System.out.println("href attribute valie is null or empty. so not possible to check");
				continue;
			}

			try {
				URL linkURL = new URL(hrefattValue);// converted href value from String to url formate
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattValue + "====> Broken links");
					noOfBrokenLinks++;
				} else {
					System.out.println(hrefattValue + "====>Not a Broken links");
				}
			} catch (Exception e) {
				System.out.println("Number of broken liks" + noOfBrokenLinks);

			}

		}

	}

}

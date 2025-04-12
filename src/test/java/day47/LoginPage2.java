package day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;

	// Constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// Locators
	/*
	 * By txt_username_loc=By.xpath("input[placeholder='Username']"); By
	 * txt_password_loc=By.xpath("input[placeholder='Password']"); By
	 * btn_login_loc=By.xpath("button[type='submit']");
	 * 
	 */

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[placeholder='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[type='submit']")
	private WebElement btnLogin;
	
	@FindBy(tagName="a")
	List<WebElement> links;

	// Action Methds

	public void setUserName(String user) {
		txtUserName.sendKeys(user);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);

	}

	public void clickOnLogin() {
		btnLogin.click();

	}
		
		public void getTheList(List<WebElement> links) {
		    if (links == null || links.size() <= 10) {
		        System.out.println("Invalid list or insufficient elements.");
		        return;
		    }

		    // Start from the 10th element
		    for (int i = 10; i < links.size(); i++) {
		        System.out.println(links.get(i).getText()); // Extract text from each element
		    }
		}
}

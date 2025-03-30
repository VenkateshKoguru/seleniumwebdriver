package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	@BeforeMethod
	void login() {
		System.out.println("this is login..");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is logOut....");
	}
	
	
	@Test(priority=1)
	void search() {
		System.out.println("This is Search...");
		
	}
	
	@Test(priority=2)
	void advancedSearch(){
		System.out.println("This is advance Serach....");
	}
	

}

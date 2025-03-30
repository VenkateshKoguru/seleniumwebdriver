package day43;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AnnotationDemo1 {
	
	@BeforeClass
	void login() {
		System.out.println("this is login..");
	}
	
	@AfterClass
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

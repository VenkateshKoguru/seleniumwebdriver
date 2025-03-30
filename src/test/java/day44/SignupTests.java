package day44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups= {"regression"})
	void signUpByEmail() {
		System.out.println("this is signup by email...");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signUpByfaceBook() {
		System.out.println("this is signup by facebook...");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signupByTwitter() {
		System.out.println("this is signup by twitter...");
	}

}

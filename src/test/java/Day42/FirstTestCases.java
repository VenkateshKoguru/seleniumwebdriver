package Day42;

import org.testng.annotations.Test;

/*open app
login 
logout
*/
public class FirstTestCases {
	
    @Test(priority=1)
	void display() {
		System.out.println("Opening application...");
	}
    @Test(priority=2)
	void login() {
		System.out.println("Login to application...");
	}
    @Test(priority=3)
	void logout() {
		System.out.println("Logout from application...");
		
	}
}

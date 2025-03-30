package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle() {
		String exp_title="Opencart";
		String act_title="Op22cart";
		/*
		if(exp_title.equals(act_title)) {
			System.out.println("Test  passed");
		}else {
			System.out.println("test failed");
		}
*/
		Assert.assertEquals(exp_title, act_title);
	
	}

}

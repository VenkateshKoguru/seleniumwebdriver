package day43;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	@Test
	void test_hardAssertions() {
		System.out.println("testing....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1, 3);
		
		System.out.println("testing...");
		System.out.println("testing....");
	}
	
	
	@Test
	void test_SoftAssertions() {
		System.out.println("testing....");
		System.out.println("testing.....");
		
       SoftAssert sa=new SoftAssert();
       sa.assertEquals(1, 3);
		
		System.out.println("testing...");
		System.out.println("testing....");
		sa.assertAll();
	}
	
	
}

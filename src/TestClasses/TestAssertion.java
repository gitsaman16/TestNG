package TestClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

	@Test
	public void hardAssert()
	{
		int i=19;
		//Assert.assertEquals(i, 10);
		Assert.assertTrue(i==19, "Hard assert test failed");
	}
	
	@Test
	public void softAssert()
	{
		int i=20;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(i, 20);
		Reporter.log("------Reporter log-------",true);
		sa.assertEquals(i, 20);
		Reporter.log("test passed", true);
		sa.assertAll(); // asserAll must be used in softassert ,only then failures will be logged
	}
}

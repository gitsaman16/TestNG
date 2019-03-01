package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import POMclasses.POMFrameworkSample;

public class TestFrameworkSample extends BaseTest {

	@Test
	public void saveClick() throws IOException
	{
		POMFrameworkSample pomObj=new POMFrameworkSample(driver);
		pomObj.saveClick();
	}
}

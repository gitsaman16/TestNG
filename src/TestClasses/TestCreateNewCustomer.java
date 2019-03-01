package TestClasses;

import org.testng.annotations.Test;

import Base.BaseTest;
import POMclasses.POMActitimeLogin;
import POMclasses.POMCreateNewCustomer;

public class TestCreateNewCustomer extends BaseTest{
	
	@Test(groups="Regression")
	public void createCustomer() throws InterruptedException{
		
		POMActitimeLogin login=new POMActitimeLogin(driver);
		login.loginMethod(uname,pwd);
		
		POMCreateNewCustomer create=new POMCreateNewCustomer(driver);
		create.createNewCustomer();
		
		login.logout();
	}
}

package TestClasses;

import org.testng.annotations.Test;
import Base.BaseTest;
import POMclasses.POMActitimeLogin;
import POMclasses.POMTypesOfWork;

public class TestCreateTypesOfWork  extends BaseTest{
	
	@Test(groups="Regression")
	public void createNewWork() throws InterruptedException{
		
		POMActitimeLogin login=new POMActitimeLogin(driver);
		login.loginMethod(uname,pwd);
		
		POMTypesOfWork createWork=new POMTypesOfWork(driver);
		createWork.createTypeOfWork();	
		
		login.logout();
	}
	
}

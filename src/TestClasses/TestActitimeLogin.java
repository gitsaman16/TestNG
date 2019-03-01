package TestClasses;

import java.io.IOException;
import org.testng.annotations.Test;

import Base.BaseTest;
import POMclasses.POMActitimeLogin;

public class TestActitimeLogin extends BaseTest{
	
	@Test(groups="Regression")
	public void actitimeLogin() throws InterruptedException{
		
		POMActitimeLogin pomLogin=new POMActitimeLogin(driver);
		pomLogin.loginMethod(uname,pwd);
	}

}

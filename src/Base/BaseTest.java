package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class BaseTest implements AutoConstant{

	public WebDriver driver;
	public String uname;
	public String pwd;
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("------Before Suite-------", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("-----Before test------", true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("-------before class------", true);
		uname="admin";
		pwd="manager";
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void beforeMethod(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_DRIVER_PATH);
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_DRIVER_PATH);
			driver=new FirefoxDriver();
		}
		Reporter.log("------before method-------", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("------After Method------", true);
		driver.quit();
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("-----after class-----",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("-----after test------", true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("-----after suite-----", true);
	}
	
}

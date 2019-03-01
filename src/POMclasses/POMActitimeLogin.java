package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class POMActitimeLogin {

	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;

	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutLink;
	
	public POMActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod(String username,String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextField.sendKeys(password);
		keepLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public void logout()
	{
		logoutLink.click();
	}
}

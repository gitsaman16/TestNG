package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCreateNewCustomer {

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewCustomerDropDown;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement  createCustomerButton;
	
	public POMCreateNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewCustomer() throws InterruptedException
	{
		Thread.sleep(2000);
		tasksLink.click();
		addNewCustomerDropDown.click();
		newCustomerButton.click();
		customerNameTextField.sendKeys("POMuser_test");
		createCustomerButton.click();
	}
}

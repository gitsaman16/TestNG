package POMclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AutoConstant;
import Base.BasePage;
import Base.ExcelDataHandling;

public class POMFrameworkSample extends BasePage implements AutoConstant
{

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernameTextField;
	
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement passwordTextField;

	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailTextField;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rememberMeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countryCodeDropDown;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//textarea")
	private WebElement addressTextArea;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement saveButton;
	
	public POMFrameworkSample(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void saveClick() throws IOException
	{
		firstNameTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 0));
		lastNameTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 1));
		usernameTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 2));
		passwordTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 3));
		emailTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 4));
		femaleRadioButton.click();
		rememberMeCheckbox.click();
		dropDownbyVisisbleText(countryCodeDropDown, "+91");
		mobileTextField.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 5));
		addressTextArea.sendKeys(ExcelDataHandling.excelData(TEST_DATA_FILE, "Sheet1", 1, 6));
		saveButton.click();
	}
	
}

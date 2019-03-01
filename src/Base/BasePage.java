package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	//This class will have all the selenium web methods that we can use in POM class
	public void dropDownbyVisisbleText(WebElement dropDownWebelement,String text)
	{
		Select sel=new Select(dropDownWebelement);
		sel.selectByVisibleText(text);
	}
	
	public void dropDownbyIndex(WebElement dropDownWebelement,int indexValue)
	{
		Select sel=new Select(dropDownWebelement);
		sel.selectByIndex(indexValue);
	}
}

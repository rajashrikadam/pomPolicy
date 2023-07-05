package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{//variables
	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;
//constructor
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//methods
	public void validateuserName() 
	{
		String actualName = userName.getText();
		String expectedName = "Rajashri Kadam";
		if(actualName.equals(expectedName))
		{
			System.out.println("actual &expected user name match are match then TC is pass");
			
		}
		else
		{
			System.out.println("actual &expected user name match are not match then TC is fail");
		}
	}

	
}

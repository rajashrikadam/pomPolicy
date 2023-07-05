package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilepage 
{
	//variables
		@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;
	//constructor
		public MyProfilepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	//methods
		public void validateuserName(String expectedName) 
		{
			String actualName = userName.getText();
	System.out.println("userName= "+actualName);
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

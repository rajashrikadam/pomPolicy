package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogINpage1  
{
	//variables
		  @FindBy(xpath = "//a[text()='Sign in']")private WebElement signButtonHomePage;
		  @FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumberField;
		  @FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signWithPass;
		  @FindBy(name="password")private WebElement passWordField;
		  @FindBy(xpath = "//span[text()='Sign in']")private WebElement signButton;
		  @FindBy(xpath = "//div[text()='My Account']")private WebElement myAccount;
		  @FindBy(xpath = "//span[text()=' My profile ']")private WebElement myProfile;
		  
		  //constructor
		  public  LogINpage1(WebDriver driver)
		  {
			  PageFactory.initElements(driver, this);
		  }
		  
		  //methods
		  public void signButtonHomePage()
		  {
			  signButtonHomePage.click();
		  }
		  public void mobileNumberField(String mobNum)
		  {
			  mobileNumberField.sendKeys(mobNum);
		  }
		  public void signWithPass() 
		  
		  {
			  signWithPass.click();
		  }
		  public void passWordField(String Password)
		  {
			  passWordField.sendKeys(Password);
		  }
		  public void signButton()
		  {
			  signButton.click();
		  }
		  public void myAccount()
		  {
			  myAccount.click();
		  }
		  public void myProfile()
		  {
			  myProfile.click();
		  }

		
	
		  

}

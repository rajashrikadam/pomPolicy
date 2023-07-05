package pompolicyUsingtestNGusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{//variables
  @FindBy(xpath = "//a[text()='Sign in']")private WebElement signButtonHomePage;
  @FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumberField;
  @FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signWithPass;
  @FindBy(name="password")private WebElement passWordField;
  @FindBy(xpath = "//span[text()='Sign in']")private WebElement signButton;
  @FindBy(xpath = "//div[text()='My Account']")private WebElement myAccount;
  @FindBy(xpath = "//span[text()=' My profile ']")private WebElement myProfile;
  
  //constructor
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //methods
  public void signButtonHomePage()
  {
	  signButtonHomePage.click();
  }
  public void mobileNumberField(String mob)
  {
	  mobileNumberField.sendKeys(mob);
  }
  public void signWithPass() 
  
  {
	  signWithPass.click();
  }
  public void passWordField(String pwd)
  {
	  passWordField.sendKeys(pwd);
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


package dataProvidersUse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commomMethods.CommonMethods_1;
import pomPolicyUsingTestNG.LoginPage;
import pomPolicyUsingTestNG.MyAccountPage;

public class ValidateUserNameUsingDataProviderTest 
{
	WebDriver driver;
	LoginPage login;
	MyAccountPage myacc;
	@BeforeMethod
	public void loginToPolicyBazaar()
	{driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	login=new LoginPage(driver);
	myacc=new MyAccountPage(driver);
		
	}
  @Test(dataProvider="policyBazaarData",dataProviderClass = PolicyDataProviderTest.class)
  public void verifyUserName(String mobNum,String pwd,String expUN) 
  {
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.signButtonHomePage();
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.mobileNumberField(mobNum);
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.signWithPass();
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.passWordField(pwd);
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.signButton();
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.myAccount();
	  CommonMethods_1.implicitWait(driver, 1000);
	  login.myProfile();
	  CommonMethods_1.implicitWait(driver, 1000);
	  Set<String> allWindowID = driver.getWindowHandles();
	  List<String>id=new ArrayList<>(allWindowID);
	  //switching focus to child page
	  driver.switchTo().window(id.get(1));
	  CommonMethods_1.implicitWait(driver, 1000);
	  String expectedUN=expUN;
	  String actualUN=myacc.getActualUserName();
	  Assert.assertEquals(actualUN, expectedUN, "TC failed both are not match");
	  
	
  }
  @AfterMethod
  public void logoutFromPolicyBzar() throws InterruptedException
  {CommonMethods_1.implicitWait(driver, 1000);
  myacc.clickOnLogOutButton();
  Thread.sleep(1000);
  driver.quit();
	  
  }
}

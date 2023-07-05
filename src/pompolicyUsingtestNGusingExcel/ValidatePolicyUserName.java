package pompolicyUsingtestNGusingExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commomMethods.CommonMethods_1;

public class ValidatePolicyUserName 
  {
	WebDriver driver;
	LoginPage login;
	MyAccountPage myacc;
	@BeforeClass
	public void launchPolicyBazaar()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login=new LoginPage(driver);
		myacc=new MyAccountPage(driver);
		
	}
	@BeforeMethod
	public void loinPolicyBazaar() throws EncryptedDocumentException, IOException
	
	{
		CommonMethods_1.implicitWait(driver, 1000);
		login.signButtonHomePage();
		CommonMethods_1.implicitWait(driver, 1000);
		login.mobileNumberField(CommonMethods_1.readdatafromexcel(0, 0));
		CommonMethods_1.implicitWait(driver, 3000);
		login.signWithPass();
		CommonMethods_1.implicitWait(driver, 1000);
		login.passWordField(CommonMethods_1.readdatafromexcel(0, 1));
		CommonMethods_1.implicitWait(driver, 1000);
		login.signButton();
		CommonMethods_1.implicitWait(driver, 1000);
		login.myAccount();
		CommonMethods_1.implicitWait(driver, 1000);
		login.myProfile();
		CommonMethods_1.implicitWait(driver, 1000);
		Set<String> allIds = driver.getWindowHandles();
		List<String>ids=new ArrayList<>(allIds);
		driver.switchTo().window(ids.get(1));
		CommonMethods_1.implicitWait(driver, 1000);
		
		
	}
  @Test
  public void verifyUserName() throws EncryptedDocumentException, IOException
   {
	  String expUN=CommonMethods_1.readdatafromexcel(0, 2);
	  String actualUN=myacc.getActualUserName();
	  Assert.assertEquals(actualUN, expUN, "TC failed actual and expected name are not matching");
	  
   }
  @AfterMethod
  public void logoutpolicyBazaar() 
  {
	  CommonMethods_1.implicitWait(driver, 1000);
	  myacc.clickOnLogOutButton();
  }
  @AfterClass
  public void closeBrowser() 
  {
	  driver.quit();
  }
}

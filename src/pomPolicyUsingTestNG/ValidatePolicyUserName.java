package pomPolicyUsingTestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatePolicyUserName 
{  WebDriver driver;
   LoginPage login;
   MyAccountPage myacc;
   @BeforeClass
   public void launchpolicyBazaar()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();
	   login=new LoginPage(driver);
	   myacc=new MyAccountPage(driver);
   }
   @BeforeMethod
   public void loginToPolicyBazaar()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.signButtonHomePage();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.mobileNumberField();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.signWithPass();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.passWordField();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.signButton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.myAccount();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   login.myProfile();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Set<String> allIDs = driver.getWindowHandles();
	   List<String> id=new ArrayList<>(allIDs);
	   driver.switchTo().window(id.get(1));
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   
	   
	   
   }
   @Test
   public void validateUserName() 
   
   {
	 String expUn="Rajashri Kadam" ;
	 String actualUn=myacc.getActualUserName();
	 Assert.assertEquals(actualUn,expUn , "TC is failed,actaul and expected UN not matching");
	 Reporter.log("UserName is "+actualUn);
   }
   @AfterMethod
   public void logoutPolicyBazaar()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   myacc.clickOnLogOutButton();
	   
   }
   @AfterClass
   public void closeBrowser() 
   {
	   driver.quit();
   }
   
  
}


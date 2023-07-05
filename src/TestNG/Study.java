package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Study {
	@BeforeMethod
	public void logInPolicyBazar()
	{
		System.out.println("logInPolicyBazar");
	}
  @Test
  public void validateMobileNum() 
  {
	  System.out.println("validateMobileNum");
  }
 
  @AfterMethod
  public void logOutFromAcc()
  
  {
	  System.out.println("logOutFromAcc");
  }
  @Test
   public void logInWithMobileNum ()
   
   {
 	System.out.println("logInWithMobileNum"); 
   }
  @BeforeClass
  public void launchBrowser()
  {
	  System.out.println("launchBrowser");   
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("closeBrowser");
  }
  
}

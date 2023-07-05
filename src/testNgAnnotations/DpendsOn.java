package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DpendsOn {
  @Test(dependsOnMethods="enterPassword",priority=-10)
  public void logIn()
  
  {
	Reporter.log("Login is Successfully....", true);  
  }
  @Test
  public void enterPassword()
  {   //Assert.fail();
	  Reporter.log("enter Password", true);
  }
}

package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount=6)
  public void moviebooking() 
  {
	  Reporter.log("moviebooking is successfully done", true);
  }
}

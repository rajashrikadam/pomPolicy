package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutsUse {
  @Test(timeOut=2000)
  public void validation() throws InterruptedException
  {   Thread.sleep(3000);
	  Reporter.log("validation is done", true);
  }
}

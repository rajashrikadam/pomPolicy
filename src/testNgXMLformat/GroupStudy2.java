package testNgXMLformat;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy2 {
  @Test(groups="sanity")
  public void myTest7()
  {
	  Reporter.log("myTest 7 is runnig..", true);
  }
  @Test
  public void myTest8()
  {
	  Reporter.log("myTest 8 is runnig..", true);
  }
  @Test(groups="sanity")
  public void myTest9()
  {
	  Reporter.log("myTest 9 is runnig..", true);
  }
  @Test(groups="smoke")
  public void myTest10()
  {
	  Reporter.log("myTest 10 is runnig..", true);
  }
  @Test(groups="sanity")
  public void myTest11()
  {
	  Reporter.log("myTest 11 is runnig..", true);
  }
  @Test
  public void myTest12()
  {
	  Reporter.log("myTest 12 is runnig..", true);
  }
}

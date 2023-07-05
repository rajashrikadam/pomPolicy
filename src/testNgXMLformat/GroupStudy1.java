package testNgXMLformat;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy1 {
  @Test(groups="smoke")
  public void myTest1() 
  {
	  Reporter.log("myTest1 is running...",true);
  }
  @Test(groups="sanity")
  public void myTest2() 
  {
	  Reporter.log("myTest2 is running...",true);
  }
  @Test(groups="smoke")
  public void myTest3() 
  {
	  Reporter.log("myTest3 is running...",true);
  }
  @Test
  public void myTest4() 
  {
	  Reporter.log("myTest4 is running...",true);
  }
  @Test(groups="smoke")
  public void myTest5() 
  {
	  Reporter.log("myTest5 is running...",true);
  }
  @Test(groups="sanity")
  public void myTest6() 
  {
	  Reporter.log("myTest6 is running...",true);
  }
  
}

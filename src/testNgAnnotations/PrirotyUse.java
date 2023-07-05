package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrirotyUse {
  @Test(priority=-5)
  public void a() 
  {
	 Reporter.log("Method a is running", true); 
  }
  @Test(priority=-2)
  public void b() 
  {
	  Reporter.log("Method b is running", true);  
  }
  @Test(priority=-3)
  public void c() 
  {
	  Reporter.log("Method c is running", true);  
  }
  @Test
  public void d() 
  {
	  Reporter.log("Method d is running", true);   
  }
  @Test(priority=-1)
  public void e() 
  {
	  Reporter.log("Method e is running", true);  
  }
}

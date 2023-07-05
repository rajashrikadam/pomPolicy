package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgKeywordUse {
  @Test(priority =-10)
  public void a()
  {
	Reporter.log("Method a successfully running", true);  
  }
  @Test(enabled=false)
  public void b()
  {
	Reporter.log("Method b successfully running", true);  
  }
  @Test(dependsOnMethods={"a","b"},priority=-9)
  public void c()
  {
	Reporter.log("Method c successfully running", true);  
  }
  @Test(dependsOnMethods= "b")
  public void d()
  {
	Reporter.log("Method d successfully running", true);  
  }
}

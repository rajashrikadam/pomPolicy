package testNgXMLformat;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void a() 
  {
	  Reporter.log("a is runnig", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b is runnig", true); 
  }
  @Test
  public void c()
  {
	  Reporter.log("c is runnig", true); 
  }
  @Test
  public void d()
  {
	  Reporter.log("d is runnig", true); 
  }
}

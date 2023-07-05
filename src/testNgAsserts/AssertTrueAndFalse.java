package testNgAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void f() 
  {
	  boolean x=true;
	  boolean y=false;
	  //Assert.assertTrue(x, "value is false Tc is failed");
	  Assert.assertFalse(x, "value is true Tc is passed");
  }
}

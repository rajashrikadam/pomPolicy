package testNgAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void f() 
  {
	  String s=null;
	  String s1="abc";
	 // Assert.assertNull(s,"TC is failed value is not null");
	  Assert.assertNotNull(s, "TC is failed value is  null");
  }
}

package testNgAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void city() 
  { String s1="Pune";
    String s2="Pune";
    String s3="Mumbai";
   // Assert.assertEquals(s2,s1,"both not equal tc is failed");
    Assert.assertNotEquals(s2, s1,"both are equal Tc is Failed");
  }
}

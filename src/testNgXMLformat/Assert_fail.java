package testNgXMLformat;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	 @Test
	  public void test1() 
	  {
		 Reporter.log("test1 is runnig...", true); 
	  }
	  @Test
	  public void test2()
	  
	  { Assert.fail();
		 Reporter.log("test2 is runnig...", true); 
	  }
	  @Test
	  public void test3() 
	  {
		 Reporter.log("test3 is runnig...", true); 
	  }
	  @Test
	  public void test4() 
	  {
		 Reporter.log("test4 is runnig...", true); 
	  }
	  @Test
	  public void test5() 
	  {  //Assert.fail();
		 Reporter.log("test5 is runnig...", true); 
	  }
}

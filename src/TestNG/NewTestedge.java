package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTestedge {
  @Test
  public void f() 
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com/");
  }
}

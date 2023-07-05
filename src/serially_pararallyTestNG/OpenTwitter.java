package serially_pararallyTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenTwitter {
  @Test
  public void twitter() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://twitter.com/");
  }
}

package varificationUsingtestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateUrl {
  @Test
  public void validateUrl() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.zomato.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	String actualUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.zomato2.com/";
	if(actualUrl.equals(expectedUrl))
	{
		Reporter.log("Actual and Expected url are matching TC is passing", true);
	}
	else
	{
		Reporter.log("Actual and Expected url are not matching TC is failed", true);
		
	}
  }
}

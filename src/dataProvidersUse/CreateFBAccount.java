package dataProvidersUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CreateFBAccount {
  @Test(dataProvider = "rediff",dataProviderClass=dataproviderTest.class)
  public void fbAcc(String firstname, String lastname, CharSequence mobNum) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
  }
}

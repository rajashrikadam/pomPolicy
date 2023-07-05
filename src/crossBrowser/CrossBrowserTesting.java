package crossBrowser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commomMethods.CommonMethods_1;

public class CrossBrowserTesting {
	@Parameters("browserName")
  @Test
  public void crossBrowserTest(String bname) throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  WebDriver driver=null;
	  if(bname.equals("Chrome"))
	  {
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("--disable-notifications");
		  driver=new ChromeDriver(opt);
	  }
	  else if(bname.endsWith("fireFOX"))
	  {
		  driver=new FirefoxDriver();
		  
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.policybazaar.com/");
	  CommonMethods_1.implicitWait(driver, 1000);
	  // click on sign Button
	   driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	   //enter mobile no
	 String userID = CommonMethods_1.readdatafromexcel(0, 0);
	 driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(userID);
	 //sign In with Password
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.name("password")).sendKeys(CommonMethods_1.readdatafromexcel(0, 1));
	 //click on sign Button
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	 CommonMethods_1.implicitWait(driver, 1000);
	 driver.findElement(By.className("userprofile")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	 //new window will be opened,so we need change to focus new window
	Set<String> allIDS = driver.getWindowHandles();
	List<String>li=new ArrayList<>();
	String MainPageID = li.get(0);
	String childPageID = li.get(1);
	driver.switchTo().window(childPageID);
	 Thread.sleep(1000);
	String expectedResult = CommonMethods_1.readdatafromexcel(0, 2);
	String actualResult = driver.findElement(By.className("textCapitalize sc-ckVGcZ kWpXlQ")).getText();
	if(expectedResult.equals(actualResult))
	{
		System.out.println("expectedResult and actualResult are matching TC is passed");
	}
	else
	{
		System.out.println("expectedResult and actualResult are not matching TC is failed");
	}
	driver.quit();
	  
  }
}

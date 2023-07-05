package pomPolicy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commomMethods.CommonMethods_1;

public class TestUserName1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{   ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		CommonMethods_1.implicitWait(driver, 1000);
		
		LogINpage1 login1=new LogINpage1(driver);
		login1.signButtonHomePage();
		Thread.sleep(500);
		opt.addArguments("--disable-notifications");
		login1.mobileNumberField(CommonMethods_1.readdatafromexcel(0, 0));
		Thread.sleep(3000);
		login1.signWithPass();
		login1.passWordField(CommonMethods_1.readdatafromexcel(0, 1));
		Thread.sleep(1000);
		login1.signButton();
		Thread.sleep(500);
		login1.myAccount();
		Thread.sleep(500);
		login1.myProfile();
		//new tab will be opened, we need to switch to new tab
		Set<String> allID = driver.getWindowHandles();
		List<String> al=new ArrayList<String>(allID);
		//switching focus main page to myAccountPage class
		driver.switchTo().window(al.get(0));
		
		
		driver.switchTo().window(al.get(1));															
		//create object of myprofile Page
		MyProfilepage myProfile=new MyProfilepage(driver);
		myProfile.validateuserName(CommonMethods_1.readdatafromexcel(0, 2));
				
		
		
		
	}

}

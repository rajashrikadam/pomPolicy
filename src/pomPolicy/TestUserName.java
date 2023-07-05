package pomPolicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commomMethods.CommonMethods_1;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException
	{   ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		opt.addArguments("--disable-notifications");
		CommonMethods_1.implicitWait(driver, 1000);
		//create object of LogIN page
		LoginPage login=new LoginPage(driver);
		
		login.signButtonHomePage();
		Thread.sleep(500);
		login.mobileNumberField();
		Thread.sleep(500);
		login.signWithPass();
		Thread.sleep(500);
		login.passWordField();
		Thread.sleep(500);
		login.signButton();
		Thread.sleep(500);
		login.myAccount();
		Thread.sleep(500);
		login.myProfile();
		//new tab wiil be opened, we need to switch to new tab
		Set<String> allID = driver.getWindowHandles();
		List<String> al=new ArrayList<String>(allID);
		//switching focus to myAccountPage class
		driver.switchTo().window(al.get(1));
		//create object of myAcconutPage
		Thread.sleep(500);
		MyAccountPage myAcc=new MyAccountPage(driver);
		myAcc.validateuserName();
		
		
		driver.quit();
		

	}

}

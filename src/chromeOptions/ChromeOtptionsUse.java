package chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOtptionsUse {

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("headless");
		//opt.addArguments("incognito");
		//opt.addArguments("start-maximized");
		//opt.addArguments("disable-infobars");
		//opt.addArguments("version");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		WebElement gmaillink = driver.findElement(By.xpath("//a[text()='Gmail']"));
        System.out.println(gmaillink.getText());
	}

}

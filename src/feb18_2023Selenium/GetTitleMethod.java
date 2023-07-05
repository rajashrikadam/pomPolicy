package feb18_2023Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(100000);
		//String mytitle = driver.getTitle();
		//System.out.println("Title of page is "+mytitle);
		//String myUrl = driver.getCurrentUrl();
		//System.out.println("My url is "+myUrl);
	
		System.out.println(driver.getPageSource());

	}

}

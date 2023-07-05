package feb18_2023Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String myUrl = driver.getCurrentUrl();
		System.out.println("My URL IS "+myUrl);
		Thread.sleep(10000);
		System.out.println(driver.getPageSource());

	}

}

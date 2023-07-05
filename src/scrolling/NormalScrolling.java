package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NormalScrolling {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();	

		opt.addArguments("disable-Notifications");
		WebDriver driver=new ChromeDriver(opt);	
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(500,800)");
		Thread.sleep(3000);
	}

}

package feb18_2023Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='sign-in']")).click();
        Thread.sleep(1000);
        driver.quit();
	}

}

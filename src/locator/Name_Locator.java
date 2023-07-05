package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("rajashrikadam@1992.gmail");
		Thread.sleep(10000);
		//driver.findElement(By.name("pass")).sendKeys("raja1992");
		
		driver.findElement(By.id("pass")).sendKeys("raja1992");
	}

}

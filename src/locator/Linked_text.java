package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked_text {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}

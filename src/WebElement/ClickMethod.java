package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
       WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
       loginbutton.click();
	}

}

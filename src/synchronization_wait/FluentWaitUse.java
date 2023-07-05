package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitUse {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.voot.com/");
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(3000)).pollingEvery(Duration.ofMillis(5)).ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Upgrade']")));
		driver.findElement(By.xpath("//span[text()='Upgrade']")).click();
		

	}
}

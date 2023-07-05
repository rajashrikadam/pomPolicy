package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeEG1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("MyProject");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
	     WebElement dd = driver.findElement(By.id("animals"));
	     Select drop=new Select(dd);
	     Thread.sleep(5000);
	     drop.selectByVisibleText("Avatar");
		

	}

}

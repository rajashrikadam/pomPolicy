package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.voot.com/");
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(3000) );
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Upgrade']")));
		WebElement upgradeButton = driver.findElement(By.xpath("//span[text()='Upgrade']"));
		 upgradeButton.click();
	}
	    
}

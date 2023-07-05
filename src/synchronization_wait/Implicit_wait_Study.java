package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_Study {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.voot.com/");
		//implicit wait
		//Applicable:complete page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement upGradeButton = driver.findElement(By.xpath("//span[text()='Upgrade']"));
		upGradeButton.click();        
	}

}

package mockexternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_QUE_Mock {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajashrikadam1992@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("rajashri");
		driver.findElement(By.id("signInSubmit")).click();
		
;
	}

}

package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sendkeys {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://paytm.com/recharge");
		//driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8459029010");
       // Thread.sleep(10000);
		driver.get("https://www.facebook.com/login");
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajashrikadam1992@.gmail.com");
       Thread.sleep(10000);
       driver.findElement(By.xpath("//input[@id='email']")).clear();

        
        
	}

}

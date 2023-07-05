package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostck_Assignment {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.neostox.com/");
			driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
			driver.findElement(By.xpath("(//input[@type='number'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("8459029010");
			Thread.sleep(3000);
            driver.findElement(By.id("lnk_signup1")).click(); 
            driver.findElement(By.id("txt_accesspin")).sendKeys("2065");
            driver.findElement(By.id("lnk_submitaccesspin")).click();
            driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
            //driver.findElement(By.xpath("//a[text()='Renew']")).click();
	}

}

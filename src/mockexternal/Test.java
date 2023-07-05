package mockexternal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				
				driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
				
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nileshprof2015@gmail.com");
				
			
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nilesh123@");
				driver.findElement(By.id("signInSubmit")).click();
				driver.findElement(By.xpath("//a[text()='Toys & Games']")).click();
				Thread.sleep(10000);
				
				
				
	}

}

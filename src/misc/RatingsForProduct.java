package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingsForProduct {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// to handle hidden division pop-up
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi Note 12 5G");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		 WebElement ratingreview = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[2]"));
         System.out.println("Rating and Review for product is "+ ratingreview.getText());
         
         
	}

}

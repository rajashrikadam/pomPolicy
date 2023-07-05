package popUpstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		Thread.sleep(2000);
	    Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(2000);
		alt.accept();
		WebElement text = driver.findElement(By.xpath("//h2[text()='Practice Alerts']"));
		System.out.println(text.getText());
		
		
		
	}

}


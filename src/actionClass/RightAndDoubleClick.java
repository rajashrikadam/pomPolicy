package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) throws InterruptedException
	
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     //right click through action class
    WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
   //WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     Actions act=new Actions(driver);
     Thread.sleep(2000);
     act.contextClick().perform();
     
	}

}

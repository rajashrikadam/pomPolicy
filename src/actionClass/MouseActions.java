package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		////step to take actions using action class
		////1.Create an object of action class and pass driver object
		Actions act=new Actions(driver);
		//2.by.using actions class we can click
		WebElement seleniumButton = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')] )[1]"));
		//seleniumButton.click();-->by using webelement method
		Thread.sleep(1000);
		act.click(seleniumButton).perform();
		

	}

}

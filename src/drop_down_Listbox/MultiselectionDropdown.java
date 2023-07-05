package drop_down_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
        Thread.sleep(1000);
     
        WebElement countries = driver.findElement(By.id("countriesMultiple"));
         Select s=new Select(countries);
         //if multiple select or not
         System.out.println("Multiple selectable status is "+s.isMultiple());
         s.selectByIndex(0);
         s.selectByValue("england");
         s.selectByVisibleText("China");
         Thread.sleep(1000);
         //s.deselectByVisibleText("China");
         s.deselectAll();
         
         
	}
	

}

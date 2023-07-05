package drop_down_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		//WebElement day = driver.findElement(By.id("day"));
		//Select sdate=new Select(day);
		//sdate.selectByVisibleText("5");
		
      // WebElement month = driver.findElement(By.name("birthday_month"));
      // Select smonth=new Select(month);
      // Thread.sleep(1000);
      // smonth.selectByValue("8");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select syear=new Select(year);
		Thread.sleep(1000);
		syear.selectByValue("1992");
		
	}

}


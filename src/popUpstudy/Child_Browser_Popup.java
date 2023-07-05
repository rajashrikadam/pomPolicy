package popUpstudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		driver.findElement(By.name("NewTab")).click();
		Set<String> allWindowIDS = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allWindowIDS);
		String mainpageID = al.get(0);//ID of main page
		String childPageID = al.get(1);
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("rajashrikadam1992@gmail.com");
		driver.close();
		String myTEXT = driver.findElement(By.tagName("p")).getText();
		System.out.println("text is "+myTEXT);
		
		
		
	}

	
}

package setsizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.manage().window().getSize();
		
		
		
		Dimension d1=new Dimension(600, 700);
		driver.manage().window().setSize(d1);
			
		driver.get("https://www.naukri.com/");
	
	}

}

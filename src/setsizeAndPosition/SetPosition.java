package setsizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(150,300);
		driver.manage().window().setPosition(p);

	}

}

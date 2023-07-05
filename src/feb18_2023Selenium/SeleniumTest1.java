package feb18_2023Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/");
		driver.get("https://bhulekh.mahabhumi.gov.in/");
	}

}

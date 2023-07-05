package feb18_2023Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIDBITitle {

	public static void main(String[] args) 
	{
		String expectedTitle="Personal & Coporate Banking MSME & Agri";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.idbibank.in/");
		String actualTitle = driver.getTitle();
		System.out.println("Expected Title is "+ expectedTitle);
		System.out.println("Actual Title is "+ actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Expected and actual Title are matching &tc is passed");
			
			
		}
		else
		{
			System.out.println("Expected and actual Title are not matching &tc is failed");

		}
		

	}

}

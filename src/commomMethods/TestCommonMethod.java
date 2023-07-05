package commomMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCommonMethod {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		CommonMethods_1.implicitWait(driver,3000);
		CommonMethods_1.captureScreenshot(driver,"myScreenshot");
		Thread.sleep(1000);
		WebElement indiamostsincerebank = driver.findElement(By.xpath("//div[@class='ihuAS']"));
		
		CommonMethods_1.scrollIntoView(driver, indiamostsincerebank);
		String value = CommonMethods_1.readdatafromexcel(0, 1);
		System.out.println(value);
		System.out.println(CommonMethods_1.readdatafromexcel(0, 0));
		
		

	}
}
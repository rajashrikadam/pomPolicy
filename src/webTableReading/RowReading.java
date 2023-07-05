package webTableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowReading {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//HOW TO READ SINGLE HEADER DATA
		WebElement headerData = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[3]"));
		Thread.sleep(3000);
		System.out.println(headerData.getText());
		System.out.println("==========================================================");
		
		//how to read header row
		//header contains 5 data,so vary th from 1to5
		Thread.sleep(3000); 
		for(int i=1;i<=5;i++)
			{
			
		WebElement headerData1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+i+"]"));
		System.out.print(headerData1.getText());
		}
		System.out.println();
		System.out.println("============================================================");
		//how to read single row 
		WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));
		System.out.println(data.getText());
		System.out.println("============================================================");
		//hoe to read single row data from table
		Thread.sleep(3000);
		for(int i=1;i<=5;i++)
		{
			WebElement data1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td["+i+"]"));
			System.out.print(data1.getText()+" ");
		}
		System.out.println();
		System.out.println("============================================================");
		//hoe to all row data from table
		//we need to vary tr from 1-26 and td from 1-5
		//outer loop for row
		
		for(int i=1;i<=26;i++)
		{
			for(int j=1;j<=5;j++)
			{
				 WebElement datanew = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
				 System.out.print(datanew.getText()+" || ");
			}
			System.out.println();
		}
	}

}

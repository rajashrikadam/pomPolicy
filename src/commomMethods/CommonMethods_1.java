package commomMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods_1
   {
	//wait
    public static void implicitWait(WebDriver driver,long waitTime)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
    }
    //Screenshot
    public static void captureScreenshot(WebDriver driver,String fileName) throws IOException
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dest = new File("D:\\testing notes\\screeshot\\"+fileName+".png");
    	FileHandler.copy(src, dest);
    	
    }
    //Scrolling
    public static void scrollIntoView(WebDriver driver, WebElement element )
    
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", element);
    
    	
    }
    //read data from excel
    public static String readdatafromexcel(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
    {
    	FileInputStream myFile=new FileInputStream("D:\\excel jar\\Mysheet1.xlsx");
    	String value = WorkbookFactory.create(myFile).getSheet("Sheet3").getRow(rowNum).getCell(cellNum).getStringCellValue();
    	return value;
    }
 
   }

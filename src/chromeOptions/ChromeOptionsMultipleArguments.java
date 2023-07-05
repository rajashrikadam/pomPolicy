package chromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMultipleArguments {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		ArrayList<String> al=new ArrayList<>();
		al.add("incognito");
		al.add("start-maximized");
		Thread.sleep(3000);
		al.add("--disable-notifications");
		opt.addArguments(al);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");

	}

}

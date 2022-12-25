package pkg1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeTheSizeOfBrowser {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		
         // Change size of Browser
		
		Dimension p = new Dimension(1000,1000);
		
		driver.manage().window().setSize(p);
		
		System.out.println(driver.manage().window().getSize());  
		
		System.out.println("Test is Pass");
		
		
	}

}

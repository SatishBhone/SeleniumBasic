package pkg1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeThePositionOfBrowser {

	public static void main(String[] args) 
	{

     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		
		driver.manage().window().maximize();
		
		// Change The Position of Browser
		
		Point p = new Point(-200, 200);
		
		driver.manage().window().setPosition(p);
		
	
	}

}

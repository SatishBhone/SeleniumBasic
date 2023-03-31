package pkg1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChangeThePositionOfBrowser {

	public static void main(String[] args) 
	{

     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
     	
     	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
     	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://flipkart.com/");
		
		driver.manage().window().maximize();
		
		// Change The Position of Browser
		
		Point p = new Point(-200, 200);
		
		driver.manage().window().setPosition(p);
		
	
	}

}

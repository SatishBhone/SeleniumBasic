package excelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Partrunner {

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
		
		driver.get("https://www.partrunner.com/en/");
		
		driver.manage().window().maximize();
	}

}

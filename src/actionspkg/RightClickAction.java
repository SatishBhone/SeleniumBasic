package actionspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
	     	
	     	ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable notifications");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
	     	
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.google.co.in/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
		
			WebElement gmail = driver.findElement(By.linkText("Gmail"));
			
			Actions act = new Actions(driver);
			
			act.contextClick(gmail).perform();

	}

}

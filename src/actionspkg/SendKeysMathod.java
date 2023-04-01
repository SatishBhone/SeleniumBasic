package actionspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SendKeysMathod {

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
		
		
		driver.manage().window().maximize(); 
		driver.get("http://www.amazon.in/"); 
		
		driver.manage().window().maximize(); 
		Thread.sleep(2000); 
		driver.findElement(By.id("searchDropdownBox")).click();
	
		Thread.sleep(2000); 
		
		Actions action = new Actions(driver); 
		
		for(int i=7;i>=0;i--) 
		{ 
			action.sendKeys(Keys.ARROW_DOWN).build().perform(); 
		    Thread.sleep(2000); 
		} 
		
		      Thread.sleep(2000); 
		
		for(int i=0;i<=6;i++)
		{ 
			action.sendKeys(Keys.ARROW_UP).build().perform(); 
		    Thread.sleep(2000); 
		
		}
		
	} 
}		 
		
		
	



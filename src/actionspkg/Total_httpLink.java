package actionspkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Total_httpLink {

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
		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> httplinklist = driver.findElements(By.tagName("a"));
		
	
		int num = httplinklist.size(); 
		System.out.println("Total http Link present on this page: "+num);
		
		for(int i=0; i<=num-1; i++) 
		{
			String c = httplinklist.get(i).getText();
			
			Thread.sleep(2000);
			
			System.out.println(c);
		}
		
		

	}

}

package actionspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drag_And_Drop {

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
		
		// find out the draggable and dropable element and by using there id 
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		// Create an Object of Actions class for the performing the actions on webElement
	 
		Actions act = new Actions(driver);
		
		act.dragAndDrop(draggable, droppable).perform();
		
	}

}

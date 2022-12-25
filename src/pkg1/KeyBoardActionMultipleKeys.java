package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionMultipleKeys {

	public static void main(String[] args) 
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		//WebElement
		
		WebElement element1 = driver.findElement(By.xpath("(//textarea[@class='inputText'])[1]"));
		
		WebElement element2 = driver.findElement(By.xpath("(//textarea[@class='inputText'])[2]"));
		
		
		element1.sendKeys("Welcome to Selenium");
		//Actions Class
		
		// Scrolling Operation in Selenium 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Scrolling with pixel
		
		js.executeScript("window.scrollBy(0,200)");
		
		
		
		Actions act = new Actions(driver);
		
		// Ctrl + A Action Select Action
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// Ctrl + C Copy  
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// Tab Shift to 2nd box
		act.sendKeys(Keys.TAB);
		act.perform();
		
		// Ctrl + V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		

	}

}

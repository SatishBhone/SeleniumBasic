package pkg1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		//Actions Class
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.CLEAR).build().perform();
		Thread.sleep(4000);
	
		act.sendKeys(Keys.DELETE).build().perform();
		
		
	}

}

package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\satis\\Driver\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://flipkart.com/");
		 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act = new Actions(driver);  //Actions is a Class. to used the method of Actions class we need to create object of Actions class. 
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).click().build().perform();   //Move to Element
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"))).click().build().perform(); //Move to Element perform click action
		
		System.out.println("Scrept run successful");
	}

}

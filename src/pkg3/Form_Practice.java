package pkg3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		  // Set Chrome window size
        driver.manage().window().setSize(new Dimension(1552, 840));
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Satish Bhone");
		
	
		
	}

}

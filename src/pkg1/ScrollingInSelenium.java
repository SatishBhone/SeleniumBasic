package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(x-axis,y-axis)");
		

	
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,500)");
	     Thread.sleep(2000);
	     
	     
	}

}

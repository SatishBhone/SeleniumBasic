package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Scrolling to Particular Element we need to find out particular element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].scrollIntoView(true)", webelement);
		  
		WebElement aboutUs = driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].scrollIntoView(true)", aboutUs);
		aboutUs.clear();
		
		// Click on any button
		WebElement loginBtn = driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].click()", loginBtn);
		
		//Enter Text in input field using JavascriptsExecutor
		// or send string in input field
		WebElement emailID = driver.findElement(By.xpath("//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value='satishbhone@gmail.com'", emailID);
		
		
		
	}

}

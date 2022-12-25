package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
      //ChildBrowserPopUp
	
	public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		
		//Child Browser Popup
		// driver.switchTo().window("Address of window");
		
		// 1) getWindowHandle();  --->
		
		String mainPageAddress = driver.getWindowHandle();
		System.out.println(mainPageAddress);
		
		driver.switchTo().window(mainPageAddress);
		System.out.println(driver.getTitle());
		
		//Login
		WebElement emailID = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		emailID.sendKeys("7030357457");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Satish@2534");
		
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
		//ProductSearch 
		
		WebElement productsearch = driver.findElement(By.xpath("//input[@type='text']"));
		productsearch.sendKeys("Lg Smart Tv");
		
		Thread.sleep(5000);
		 
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		
	}

}

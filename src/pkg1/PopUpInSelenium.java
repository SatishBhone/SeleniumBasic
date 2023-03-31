package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopUpInSelenium {
    
	//Alert Popup
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		alert1.click();
		
		
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
		WebElement element1 =  driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		element1.click();
		
		
		Thread.sleep(6000);
		alt.accept();  
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		element2.click();
		
		alt.dismiss();
		
		
		WebElement element3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		element3.click();
		
		alt.sendKeys("Hi I am Satish");
		alt.accept();
		
		System.out.println("Successfull");
		
	}

}

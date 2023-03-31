package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonPractic {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement radiobtn1 = driver.findElement(By.xpath("//input[@id='bookFlights']"));
		System.out.println(radiobtn1.isSelected());
		
		Thread.sleep(5000);
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		radio2.click();
		System.out.println(radio2.isSelected());
	
	}

}

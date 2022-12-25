package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

}

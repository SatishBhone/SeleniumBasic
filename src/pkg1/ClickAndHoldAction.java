package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndHoldAction {

	public static void main(String[] args) 
	{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
       
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		
		driver.manage().window().maximize();
		
		
		
	}

}

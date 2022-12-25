package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\satis\\Driver\\IEDriverServer_x64_4.7.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
				
		driver.get("www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
				
	}

}

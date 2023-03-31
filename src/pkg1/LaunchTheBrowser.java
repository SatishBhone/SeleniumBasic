package pkg1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	driver.manage().window().minimize();
		Thread.sleep(3000);
	//	driver.close();  // close single tab
		Thread.sleep(3000);
	//	driver.quit();   // close all the tab and browser
	   
	// How to set size of Browser --> By Using set size method
		
		Dimension d = new Dimension(1100,500);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	
		//	how to set Position of browser --> By using setPosition Method which accept point as
		//argument that why we required to create object of point Class.
        Point p = new Point(900,775);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
	}

}

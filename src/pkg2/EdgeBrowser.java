package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\satis\\Driver\\edgedriver_win64\\msedgedriver.exe");	
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://developer.microsoft.com/");
	
	driver.manage().window().maximize();
	
     
	}

}

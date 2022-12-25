package pkg2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\satis\\Driver\\operadriver_win64\\operadriver_win64\\operadriver.exe");

		
		WebDriver driver = new OperaDriver();
		driver.get("www.flopkart.com/");
		
		driver.manage().window().maximize();
		
		
	}

}

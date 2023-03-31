package pkg3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inneriframe {

	public static void main(String[] args)
	{
  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.manage().window().maximize();
		
		// Total no of iframe
		
		List<WebElement> elements =  driver.findElements(By.xpath("//iframe"));
		
		int size = driver.findElements(By.xpath("//iframe")).size();
		
		System.out.println("Total no of i frame is :"+ size);
		
		
		
	}

}

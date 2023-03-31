package excelSheet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException 
	{

     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/broken-link1.html");
		
		driver.manage().window().maximize();
		
	   //	Get a list of all the links on the webpage:
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links)
		{
		    String href = link.getAttribute("href");
		    URL url = new URL(href);
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.connect();
		    int statusCode = connection.getResponseCode();
		    
		    if (statusCode >= 400)
		    {
		        System.out.println(href + " is a broken link");
		    } 
		    
		    else 
		    {
		        System.out.println(href + " is a valid link");
		    }
		}

		//driver.quit();

	}

}

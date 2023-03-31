package excelSheet;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TotalBrokenLink {
	
		  public static void main(String[] args)
		  {
			  
		    // Set the path of the ChromeDriver executable
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		   
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable notifications");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			
		    // Create an instance of the ChromeDriver
		    WebDriver driver = new ChromeDriver(options);
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		    // Load the web page
		    driver.get("https://www.hyrtutorials.com/p/broken-link1.html");

		    // Get all the links on the page
		    List<WebElement> links = driver.findElements(By.tagName("a"));

		    // Loop through all the links and check if they are broken
		    int brokenLinksCount = 0;
		    for (WebElement link : links) 
		    {
		      String href = link.getAttribute("href");
		      
		      try {
		    	  
		        URL url = new URL(href);
		        
		        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		        
		        connection.setRequestMethod("GET");
		        connection.connect();
		        int responseCode = connection.getResponseCode();
		        if (responseCode >= 400 && responseCode <= 599) 
		        {
		          System.out.println("Broken link: " + href);
		          brokenLinksCount++;
		        }
		      } catch (Exception e) {
		        System.out.println("Exception: " + e.getMessage());
		      }
		    }

		    // Print the total number of broken links
		    System.out.println("Total broken links: " + brokenLinksCount);

		    // Quit the driver
		    driver.quit();
		  }
		

		
	}



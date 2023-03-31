package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Brokenlink {
	
	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();

	        driver.get("http://www.example.com");

	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total links on the page: " + links.size());

	        for (WebElement link : links) {

	            String url = link.getAttribute("href");

	            try {
	                URL linkUrl = new URL(url);
	                HttpURLConnection httpConn = (HttpURLConnection) linkUrl.openConnection();
	                httpConn.setConnectTimeout(5000);
	                httpConn.connect();

	                if (httpConn.getResponseCode() != 200) {
	                    System.out.println("Broken link: " + url);
	                }
	            } catch (Exception e) {
	                System.out.println("Error connecting to the link: " + url);
	            }
	        }

	        driver.quit();
	    }
	}



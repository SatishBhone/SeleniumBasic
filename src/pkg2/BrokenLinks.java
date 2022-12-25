package pkg2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Set<String> brokenLinksUrls = new HashSet<String>();
	List<WebElement> links =driver.findElements(By.tagName("a"));  // it will returns List of WebElements of all Link
		
		System.out.println(links.size());
		
		for (WebElement link : links) 
		{
			String linkaddress = link.getAttribute("href");
			Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("Hostname",80));
			URL url  = new URL(linkaddress);
			URLConnection urlConnection = url.openConnection(proxy);
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
		    if(httpURLConnection.getResponseCode()!=200)
		    {
		    	brokenLinksUrls.add(linkaddress);
		    }
		    driver.close();
			
		}
		
	}

}

package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameinSelenium {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
			
		// count of iframes on webpage
		List<WebElement> elaments = driver.findElements(By.xpath("//iframe"));
		
		int count = driver.findElements(By.xpath("//iframe")).size();
		
		System.out.println("Total Number of i frames"+count);
		
		//Switching to parent frame
		driver.switchTo().frame("frame1");   // name or ID
		
		WebElement element = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(element.getText());
		
        //Switching to child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child ')]")));
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(element1.getText());
		
		// Move to parent frame
		driver.switchTo().parentFrame();
		WebElement element2 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(element2.getText());
		
		//Move to main frame
	//	driver.switchTo().parentFrame();
	//	WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'sample Nested')]"));
	//	System.out.println(element3.getText());
		
		//Move to main frame from child frame
		driver.switchTo().defaultContent();
		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		System.out.println(element4.getText());
		 
		refrashPage(driver);
		System.out.println("Successful");
	}
     public static void refrashPage(WebDriver driver) 
     {
    	 driver.navigate().refresh();
    	 driver.switchTo().frame("frame1");
    	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'child')]")));
     }
     
}

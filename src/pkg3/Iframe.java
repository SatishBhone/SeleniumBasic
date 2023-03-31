package pkg3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		// count of iframes on webpage
		
     	List<WebElement> elaments = driver.findElements(By.xpath("//iframe"));
				
		int count = driver.findElements(By.xpath("//iframe")).size();
				
		System.out.println("Total Number of i frames : "+count);
	
		// Parent iFrame
		
		WebElement OuterIframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		//here we are passing frame as webElemen
		driver.switchTo().frame(OuterIframe);  
		
		WebElement innerIframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
        driver.switchTo().frame(innerIframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi Satish");
		
		System.out.println("Test is Pass");
		

		
		
		
		 

	}

}

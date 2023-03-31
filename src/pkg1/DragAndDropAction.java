package pkg1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		Actions act = new Actions(driver);
		
		 WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		 Thread.sleep(2000);
		 
		 WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 act.dragAndDrop(drag, drop).build().perform();	
		 
	}

}

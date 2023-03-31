package pkg1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TataProject {

	public static void main(String[] args) throws InterruptedException 
	{
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tataaia.com/");
		driver.manage().window().maximize();
 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement fullname = driver.findElement(By.xpath("//input[@id='createLeadneedformfullname']"));
		js.executeScript("arguments[0].scrollIntoView(true)", fullname);
		
		WebElement fullname1 = driver.findElement(By.xpath("//input[@id='createLeadneedformfullname']"));
		fullname1.sendKeys("Satish Bhone");
		
		WebElement mobnum = driver.findElement(By.xpath("//input[@id='createLeadneedformmobileNo']"));
		mobnum.sendKeys("7888225184");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement list = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[9]/section[1]/div/div/div/div[2]/form/div[1]/div[3]/div/div/span/span[1]/span/span[1]"));
		WebElement arro = driver.findElement(By.xpath("//span[@class='select2-selection__arrow'])[3]"));
		arro.click();
	//Select sec = new Select(list);
//	sec.selectByVisibleText(null);
//	sec.getOptions();
//	System.out.println(sec.getOptions());
//	System.out.println(list.isSelected());
//   sec.selectByIndex(0);
//	     
//	    List<WebElement> options = sec.getOptions();
//		   List<String> dataFromUI = new ArrayList<String>();
//		   
//		   for(int i=0; i<options.size(); i++) 
//		   {
//			   dataFromUI.add(options.get(i).getText());   
//		   }
//		   System.out.println(dataFromUI);
//		   
	//	 sec.selectByIndex(3);
    	//	sec.getFirstSelectedOption();
		//  System.out.println(sec.getFirstSelectedOption().getText());
	//	Thread.sleep(2000);
	//	WebElement GetClaabackbtn = driver.findElement(By.xpath("//button[@id='getCallBacksbtnabc']"));
	//	GetClaabackbtn.click();
	}

}

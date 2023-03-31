package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPractice {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
       
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Satish");
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastName.sendKeys("Bhone");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("Satishbhone@gmail.com");
		
		WebElement mobNum = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobNum.sendKeys("7030357457");
		
//		WebElement genMail = driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]"));
//	    System.out.println(genMail.isSelected());
//	    genMail.click();
//	    System.out.println(genMail.isSelected());
//	    
//		WebElement check1 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
//		System.out.println(check1.isDisplayed());
//		System.out.println(check1.isSelected());
//		check1.click();
//		System.out.println(check1.isSelected());
	
	}

}

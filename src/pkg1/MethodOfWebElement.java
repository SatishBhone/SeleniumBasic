package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://courses.letskodeit.com/practice");
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	// isSelected
	
	WebElement radiobutton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
	System.out.println(radiobutton.isSelected());
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
	
	Thread.sleep(2000);
	// isDisplay
         WebElement inputbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
         System.out.println(inputbox.isDisplayed());
         driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
         System.out.println(inputbox.isDisplayed());
         Thread.sleep(2000);
	//isEnabled
         WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
         System.out.println(inputBox1.isEnabled());
         driver.findElement(By.xpath("//input[@id='enabled-button']")).click();
         System.out.println(inputBox1.isEnabled());
         System.out.println(inputBox1.getAttribute("Class"));
         Thread.sleep(2000);
     //GetText it's Return type is String 
        WebElement ele = driver.findElement(By.xpath("//input[@id='enabled-button']"));
        String text = ele.getText();
        System.out.println(text);
         
      //GetAttribute
     //    This Method Gives Attribute Values
         
     //    WebElement ele1 = driver.findElement(By.xpath("//button[@data-cy='cntinueBtn']"));
       // System.out.println(ele1.getAttribute("class"));
        
        
	}

}

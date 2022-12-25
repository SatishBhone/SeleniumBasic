package pkg1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
	   Thread.sleep(2000);
	   
	   WebElement list = driver.findElement(By.xpath("//select[@id='carselect']"));
	   Select sel = new Select(list);
	   
	   sel.selectByIndex(0);
	   
	   System.out.println(sel.getFirstSelectedOption().getText());
	 
	   sel.selectByValue("bmw");
	   
	   sel.selectByVisibleText("Honda");
	   
	   sel.selectByIndex(1);
	   sel.selectByIndex(2);
	   
	   sel.selectByValue("honda");
	   sel.selectByValue("benz");
	   
	   sel.selectByVisibleText("BMW");
	   sel.selectByVisibleText("Benz");
	   
	   System.out.println("pass");
	   
	   List<WebElement> options = sel.getOptions();
	   List<String> dataFromUI = new ArrayList<String>();
	   
	   for(int i=0; i<options.size(); i++) 
	   {
		   dataFromUI.add(options.get(i).getText());   
	   }
	   System.out.println(dataFromUI);
	}

}

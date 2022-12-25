package pkg1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShootInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//How to get current date and time
				SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String date = frmt.format(new Date());
				System.out.println(date);
				
				
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Screenshot\\satish"+date+".jpg");
		
		FileHandler.copy(source, dest);
		
		
	}

}

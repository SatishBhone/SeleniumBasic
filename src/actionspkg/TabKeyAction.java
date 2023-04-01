package actionspkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TabKeyAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
     	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9300351%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIt4PWnpyI_gIV0TUrCh1qRwgiEAAYASAAEgLhDvD_BwE");
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		firstname.sendKeys("Satish");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Bhone");
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		WebElement mobNo = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		mobNo.sendKeys("7030378458");
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@type='password']"));
		PassWord.sendKeys("Satish@123");
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		
		
		
		

	}

}

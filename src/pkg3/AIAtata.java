package pkg3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AIAtata {

	public static void main(String[] args) {
		
		
		        
		        // Setup Extent Report
		        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/TataAiaLeadFormTest.html");
		        ExtentReports extent = new ExtentReports();
		        extent.attachReporter(htmlReporter);
		        ExtentTest test = extent.createTest("Tata Aia Lead Form Test", "Fill in the Tata Aia lead form and submit it");
		        
		        // Launch Chrome browser and navigate to URL
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver1\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get("https://www.tataaia.com/");
		        driver.manage().window().maximize();
		        
		        // Scroll down to Lead form
		        WebElement leadForm = driver.findElement(By.xpath("//h3[text()='Get in touch with us']/following-sibling::form"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", leadForm);
		        
		        // Fill in form fields
		        WebElement fullName = driver.findElement(By.name("full-name"));
		        WebElement email = driver.findElement(By.name("email"));
		        WebElement mobileNumber = driver.findElement(By.name("mobile"));
		        WebElement city = driver.findElement(By.name("city"));
		        WebElement product = driver.findElement(By.name("product"));
		        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
		        
		        fullName.sendKeys("John Doe");
		        email.sendKeys("johndoe@example.com");
		        mobileNumber.sendKeys("1234567890");
		        city.sendKeys("Mumbai");
		        product.sendKeys("Life Insurance");
		        
		        // Submit form
		        submitBtn.click();
		        
		        // Verify submission success message
		        WebElement successMsg = driver.findElement(By.xpath("//div[@class='gform_confirmation_message']"));
		        if (successMsg.getText().contains("Thank you for submitting your details.")) {
		            test.log(Status.PASS, "Lead form submitted successfully");
		        } else {
		            test.log(Status.FAIL, "Lead form submission failed");
		        }
		        
		        // Close browser and flush Extent Report
		        driver.quit();
		        extent.flush();
		    }
		


	}



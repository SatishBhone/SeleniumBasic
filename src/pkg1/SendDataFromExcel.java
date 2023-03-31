package pkg1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SendDataFromExcel {

	
	public static String readData(int row, int col) throws IOException
	{
        File file = new File("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
	//	FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		String S = sheet.getRow(row).getCell(col).getStringCellValue();
		wb.close();
		return S;
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.out.println(readData(0,0));
		System.out.println(readData(0,1));
		System.out.println(readData(1,0));
		System.out.println(readData(1,1));
		System.out.println(readData(2,0));
		System.out.println(readData(2,1));
		
		
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		 
//		driver.get("https://flipkart.com/");
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		System.out.println(readData(0,1));
//	
//	
//	     
	}

	

}

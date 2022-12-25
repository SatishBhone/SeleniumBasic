package pkg1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExclFile {
	
	public static String readData(int row, int col) throws IOException 
	{

		File file = new File("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String Sheet1 = sheet.getRow(row).getCell(col).getStringCellValue();
		
		return Sheet1;
	} 

	public static void main(String[] args) throws IOException 
	{
		
		System.out.println(readData(0,0));
		System.out.println(readData(0,1));
		System.out.println(readData(1,0));
		System.out.println(readData(1,1));
		System.out.println(readData(2,0));
		System.out.println(readData(2,1));
		System.out.println(readData(3,0));
		System.out.println(readData(3,1));
	}

}

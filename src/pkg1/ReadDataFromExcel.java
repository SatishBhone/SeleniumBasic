package pkg1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		String  data = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
       
		System.out.println(data);
		
		method1();
	}
	
	public static void method1() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		double Excelsheetdata = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(7).getCell(1).getNumericCellValue();
		
		System.out.println(Excelsheetdata);
	}
}


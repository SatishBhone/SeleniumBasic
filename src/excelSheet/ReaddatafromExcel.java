package excelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReaddatafromExcel {
	
	public static void main(String[] args) throws IOException 
	
	{
		System.out.println(getdatafromExcel("Sheet2",1,1));
		File file = new File("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		int RowNum = sheet.getLastRowNum();   // it is used to get LastRowCount
		
		int lastcell =sheet.getRow(1).getLastCellNum();// it return last cell of first row
		
	// first for loop is representing Rows and 2nd for loop representing columns
		
		for(int i=0; i<=RowNum; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<lastcell; j++) 
			{
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				case _NONE:   System.out.print(cell.getErrorCellString()); break;
				
				}	
				System.out.print("      ");
			}
			System.out.println(); // all the rows printed in nextLine
			
		}
	}
       public static String getdatafromExcel(String sheet, int row, int colm) throws EncryptedDocumentException, IOException 
       {
    	   FileInputStream fis = new FileInputStream("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
    	   
    	           String data = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(colm).getStringCellValue();
    	           
    	           return data;
    	          
       }
}

package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IteratorMethod {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\satis\\eclipse-workspace\\Satish.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		// Iterator
		
		Iterator iterator = sheet.iterator();   // this is iterate all the row from sheet
		
		while(iterator.hasNext())         // hasNext method check if there is another record or not.
		                                 //if yes it will return true other wise falls
		{
			XSSFRow row =(XSSFRow) iterator.next();  // we get first Row here
			
		   Iterator celliterator = row.cellIterator(); // we get all the cell of 1st Row iterate them
		while(celliterator.hasNext()) 
		{
			XSSFCell cell =(XSSFCell) celliterator.next();  // we get cell object here it is used to read the data of particular cell
			
			switch(cell.getCellType())    // it will check which type of data we get either string/ boolean/ Numeric
			{
			  case STRING: System.out.print(cell.getStringCellValue()); break;
			  case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
			  case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
			}
			System.out.print("     "); //
		}
			System.out.println();  // it will give next line after execution of each row
		}
	}

}

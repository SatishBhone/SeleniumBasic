package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcl {

	public static void main(String[] args) throws IOException 
	{
		 File file = new File("C:\\Users\\satis\\eclipse-workspace\\EmpInfo.xlsx");
		 
		 FileInputStream fis = new FileInputStream(file);
		 
		 XSSFWorkbook wb =new XSSFWorkbook("fis");
		 
		 XSSFSheet sheet = wb.getSheetAt(0);
		 
		 int rowcount = sheet.getLastRowNum();
		 int colcount = sheet.getRow(1).getLastCellNum();
		 
		 for(int i=0; i<rowcount; i++) 
		 {
			 XSSFRow currentrow = sheet.getRow(i);
			 for(int j=0; j<colcount; j++)
			 {
				String value = currentrow.getCell(j).toString();
				System.out.println(value);
				 
			 }
			 System.out.println();
		 }
		 
		 
	}

}

package testng_with_ddf_BU;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class utility_class {
	

	
	public static String testdata(int rowindex, int colindex) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
		
		
	     
	}

}

package fb_ddftestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sfz {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		String data = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}
}

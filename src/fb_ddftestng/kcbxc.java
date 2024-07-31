package fb_ddftestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kcbxc {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		fb_login fl=new fb_login(driver);
		fl.inputusername(sh.getRow(1).getCell(0).getStringCellValue());
		fl.password(sh.getRow(1).getCell(1).getStringCellValue());
         fl.loginbtnclick();
		
	}

}

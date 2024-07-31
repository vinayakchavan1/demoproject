package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utili_class {
	
	
		public static  String utility_class_getdata (int rowindex, int colindex) throws EncryptedDocumentException, IOException {
			
			
			FileInputStream file=new FileInputStream("D:\\Software Testing\\Notes\\data.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
		
		
		}
		
		
		public static void screnshot(WebDriver driver, int TCID) throws IOException
		{
		
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("\"D:\\New folder\\new_project\\failedtcss\\tastcase"+ TCID+".png");
			
			FileHandler.copy(src, dest);
			
			
		}
		
		public static String getpf(String key) throws IOException
		{
			FileInputStream file=new FileInputStream("D:\\New folder\\new_project\\src\\property.properties");
			
			Properties p=new Properties();
			p.load(file);
			
			String value = p.getProperty(key);
			return value;
			
			
			
		}
}


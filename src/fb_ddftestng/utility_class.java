package fb_ddftestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




//utliity class -->common class or function class
public class utility_class  {
	
	
	
	



	public static String utilityclass_testdata(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
	    
	 
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
		}

	
	
	public static void capturess(WebDriver driver, int TCID) throws IOException
	{

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File dest=new File("D:\\New folder\\new_project\\failedtcss\\testcase " + TCID+ " .jpg"); 
	
	FileHelper.copyFile(src, dest);
		
	}
	
	
	
	public static String getpfdata(String key) throws IOException
	{
		
		
		FileInputStream file=new FileInputStream("D:\\New folder\\new_project\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
		
		
		
	}
}

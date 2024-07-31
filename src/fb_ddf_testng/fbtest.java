package fb_ddf_testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fbtest {
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		fblogin fb=new fblogin(driver);
		
		fb.inputusername(sh.getRow(0).getCell(0).getStringCellValue());
		fb.inputpasswrd(sh.getRow(0).getCell(1).getStringCellValue());
		fb.clicklogin();
		
		
		
		fbhome fh=new fbhome(driver);
		fh.verifythename();
		
	
	
	
		
		
	}
	}


package Testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebooktestclass {

	Sheet sh;
	WebDriver driver;
	facebookloginpage fb;
	facebookhomepage  fh;
	facebooklogoutpage fl;
	
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		
		 fb=new facebookloginpage(driver);
	 fh=new facebookhomepage(driver);
		 fl=new  facebooklogoutpage(driver);
		
		
		
		
	}
	
	@BeforeMethod
	public void fbloginpage()
	{
		fb.inputfbusername(sh.getRow(0).getCell(0).getStringCellValue());
		fb.inputfbpassword(sh.getRow(0).getCell(1).getStringCellValue());
		fb.clickloginbtn();
	}
	
	
	@Test
	public void verifylogo()
	{
		
		fh.verifyfacebooklogo();
		
	}
	
	
	@AfterMethod
	public void logoutpage()
	{
		fl.clickprofilebtn();
		fl.clicklogoutbtn();
	}
	
	
	@AfterClass
	public void closebrowser()
	{
	
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

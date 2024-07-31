package Testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass {
	
	pom1 p1;
	pom2 p2;
	pom3 p3;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
	FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
	sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/");
	
	
	
	pom1 p1=new pom1(driver);
	pom2 p2=new pom2(driver);
	pom3 p3=new pom3(driver);
	
	}
	
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
	
		
	p1.inputslusername(sh.getRow(0).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	
	p1.inputslpassword(sh.getRow(0).getCell(1).getStringCellValue());
	Thread.sleep(2000);
	
	p1.clickloginbt();
	Thread.sleep(2000);
	
	}
	
	
	@Test
	public void verifyLogo() throws InterruptedException
	{
	//home.verifySwagLabsHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
	Thread.sleep(2000);
	String actLogoText=p2.verifysllogo();
	String expLogoText=sh.getRow(8).getCell(1).getStringCellValue();
	
	Assert.assertEquals(actLogoText,expLogoText,"both result are different");
	
	p2.menubtn();
	
	
	}
	
	
	@AfterMethod
	public void logoutFromoApp() throws InterruptedException
	{
		p3.logoutpage();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	}
	
	
	
	
	
	
	

}

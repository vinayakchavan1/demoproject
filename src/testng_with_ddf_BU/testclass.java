package testng_with_ddf_BU;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testclass extends base_class {
	
	
	
	loginpage l;
	homepage h;
	logoutpage lo;
	
	

	
	@BeforeClass
	public void openbrowserswablabs()
	{
    
	openbrowser();
	 l=new loginpage(driver);
	 h=new homepage(driver);
	 lo=new logoutpage(driver);
	}
	
	
	@BeforeMethod
	public void loginpage() throws EncryptedDocumentException, IOException
	{
		l.inputswablabsusername(utility_class.testdata(1, 0));
		l.inputswablabspassword(utility_class.testdata(1, 1));
		l.clickloginbtn();
		
	}
	
	@Test
	public void testcase()
	{
		h.verifylogo();
	}
	
	@AfterMethod
	public void logoutpage() throws InterruptedException
	{
	
		lo.menubtn();
		Thread.sleep(4000);
		lo.logoutbtn();
	}
	
	
	@AfterClass
	public void closebrpwser()
	{

		driver.quit();
		
	}

}

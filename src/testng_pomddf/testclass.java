package testng_pomddf;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class testclass extends base_class{
	
	
	
	facebookloginpage f;
	facebookhomepage fb1;
	facebooklogoutpage fbl;
	int TCID;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{
		
		
		
		open_browser();
	    
		
		 f=new facebookloginpage(driver);
		 fb1=new facebookhomepage(driver);
		 fbl=new facebooklogoutpage(driver);
		
	}
		
	@BeforeMethod
	public void loginpage() throws EncryptedDocumentException, IOException
	{
		
		
		f.inputusername(utility_class.getpfdata("UN"));
		f.inputpassword(utility_class.getpfdata("PW"));
		f.clickloginbtn();
	
	}
		
	
	
		@Test
		public void  testcase() throws InterruptedException, EncryptedDocumentException, IOException
		{
			TCID=101;
			String acttext=fb1.verifylogo();
			String exptext=utility_class.utilityclass_testdata(2, 0);
			
			Assert.assertEquals(acttext, exptext);
			
			Thread.sleep(3000);
			
		}
		
		@AfterMethod
		public void logoutfacebookpage(ITestResult s1) throws InterruptedException, IOException
		
		{
			if (s1.getStatus()==ITestResult.FAILURE) 
			{
				utility_class.capturess(driver, TCID);
			}
			fbl.clickprofile();
			
			fbl.logoutbtn();
		}
		
		
		
		@AfterClass
		
		public void closebrowser()
		{
			driver.quit();
		}

}

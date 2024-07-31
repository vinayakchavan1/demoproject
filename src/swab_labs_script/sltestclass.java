package swab_labs_script;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sltestclass extends baseclass {
	
	
	slloginpage login;
	slhomepage home;
	sllogoutpage openMenu;
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
	
	
	base_classsl();
	
	
	login=new slloginpage(driver);
	home=new slhomepage(driver);
	openMenu=new sllogoutpage(driver);
	
	}
	
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		login.inpSwagLabsLoginPageUsername(utili_class.utility_class_getdata(0, 0));
		Thread.sleep(2000);
		
	login.inpSwagLabsLoginPagePassword(utili_class.utility_class_getdata(0, 1));
	Thread.sleep(2000);
	
	login.clickSwagLabsLoginPageLogiBtn1();
	Thread.sleep(2000);
	
	}
	
	
	@Test
	public void verifyLogo() throws InterruptedException
	{
		
		home.verifySwagLabsHomePageLogo();
	home.clickSwagLabsHomePageOpenMenu();
	
	}
	
	
	@AfterMethod
	public void logoutFromoApp() throws InterruptedException
	{
	openMenu.clickSwagLabsOpenMenuPageLogou();
	
	
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	}
		
		
		
		
		
		
		

	
	
		
		

}

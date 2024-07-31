package demo_sl;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class sltestclass {
	
	slloginpage sl;
	slhomepage sh;
	sllogoutpage sout;
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.saucedemo.com/");
		
		slloginpage sl=new slloginpage(driver);
		slhomepage sh=new slhomepage(driver);
		sllogoutpage sout=new sllogoutpage(driver);
		
		
		
		
		
	}
	
	@BeforeMethod
	public void loginswablab()
	{
		sl.inputswablabusername();
		sl.inputswablabpasword();
		sl.clicksubmitbtn();
		
	}
	
	
	@Test
	public void testcase()
	{
		sh.verifyname();
		sh.clickprogilebtn();
	}
	
   @AfterMethod
   public void swablablogout()
   {
	sout.clickonswablanlogoutbtn();
   }
   
   
   @AfterClass
   public void closedriver()
   {
	   driver.quit();
   }

}

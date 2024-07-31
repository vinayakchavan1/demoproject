package testng_with_ddf_BU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	
	WebDriver driver;
	
	public void openbrowser()
	{
		
	     	 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.saucedemo.com/");
		
	}

}

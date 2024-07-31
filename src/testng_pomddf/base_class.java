package testng_pomddf;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	
	WebDriver driver;
	public void open_browser() throws IOException
	{
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get(utility_class.getpfdata("URL"));
		
		
	}

}

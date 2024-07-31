package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class email {
	
	@Test
	public void report()
	{
	

		Reporter.log("hello", true);
		
	}
	
	
	@Test
	public void report12()
	{

		Reporter.log(null);
	}

}

package failed_testngsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {
	
	@Test
	public void testsui3()
	{
		
		Reporter.log("test case 1",true);
		
	}
	
	@Test
	public void testsui4()
	{
		
		
		
		String actname="vin";
		String expname="vin";
		
		Assert.assertEquals(actname, expname,"both names are diff");
		
	}

}

package failed_testngsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class3 {
	
	@Test
	public void testsui5()
	{
		
		Assert.assertEquals(1, 1,"both are diff");
		
	}
	
	
	@Test
	public void testsui6()
	{
		
		Reporter.log("test case 6",true);
		
	}

}

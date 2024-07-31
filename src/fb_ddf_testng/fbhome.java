package fb_ddf_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhome {
	
	
	
	@FindBy (xpath = "//span[text()='Vinayak Ashok Chavan']") private WebElement verifyname;
	
	
	public fbhome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifythename()
	{
		String orgname = verifyname.getText();
		String expname="";
		
		if (orgname.equals(expname))
		{
		
			System.out.println("both are  same");
		}
		
		else
		{
			System.out.println("both are diff");
		}
		
	}

	
	
	

}

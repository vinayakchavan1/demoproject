package testng_pomddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookhomepage {

	
	

	@FindBy(xpath = "//span[text()='Vinayak Ashok Chavan']") private WebElement verifyfbname;
	
	
	public facebookhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifylogo()
	{
		
		String name = verifyfbname.getText();
		System.out.println(name);
	return name;
		
	}
	
	
	
	
}

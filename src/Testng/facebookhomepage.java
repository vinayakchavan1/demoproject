package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookhomepage {
	
	
	@FindBy(xpath = "(//a[@role='link'])[1]") private WebElement facebooklogo;
	
	

	
	
	public facebookhomepage (WebDriver driver)
	{

		PageFactory.initElements(driver, this);

	}
	
	
	
	
	public void verifyfacebooklogo()
	{

		boolean display = facebooklogo.isDisplayed();
		System.out.println(display);
		
	}
	
	


}

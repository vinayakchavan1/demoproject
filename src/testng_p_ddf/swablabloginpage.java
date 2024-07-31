package testng_p_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swablabloginpage {
	
	
	
	@FindBy(xpath = "") private WebElement username;
	@FindBy(xpath = "") private WebElement password;
	@FindBy(xpath = "") private WebElement loginbtn;
	
	
	
	public swablabloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpuslusername()
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

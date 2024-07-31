package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement clicklogoutbtn;
	
	
public	pom3(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void logoutpage()
	{
	
		clicklogoutbtn.click();
		
	}
	
	
}

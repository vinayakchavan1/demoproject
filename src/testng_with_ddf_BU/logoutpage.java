package testng_with_ddf_BU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {
	
	@FindBy(xpath = "//button[@type='button']") private WebElement clickmenubtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement clicklogoutbtn;

	
	public logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void menubtn()
	{
		clickmenubtn.click();
		
		
	}
	
	
	public void logoutbtn()
	{
	
		clicklogoutbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sllogoutpage {
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement logout;
	
	
	public sllogoutpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void clickSwagLabsOpenMenuPageLogou()
	{
	logout.click();
	}
	

}

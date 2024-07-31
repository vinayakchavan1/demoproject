package demo_sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sllogoutpage {
	
	
	@FindBy(xpath = "") private WebElement logoutbtn;
	
	
	public sllogoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonswablanlogoutbtn()
	{
		logoutbtn.click();
	}
	

}

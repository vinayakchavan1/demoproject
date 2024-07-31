package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogoutpage {
	
	@FindBy(xpath = "//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']") private WebElement clickprifile;
	@FindBy(xpath = "//span[text()='Log out']") private WebElement logoutbtn;
	
	
	
	
	public facebooklogoutpage(WebDriver driver) 
	{
	
		PageFactory.initElements( driver,this);
	}



	public void clickprofilebtn()
	{
		clickprifile.click();
	}
	
	public void clicklogoutbtn()
	{
		logoutbtn.click();
	}
	
	
}

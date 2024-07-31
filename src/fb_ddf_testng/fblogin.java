package fb_ddf_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin {
	
	@FindBy(xpath = "//input[@type='text']") private WebElement userid;
	@FindBy (xpath = "//input[@type='password']") private WebElement passwrd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	
	
	public fblogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	
	
	public void inputusername(String un)
	{
		userid.sendKeys(un);
	}
	
	public void inputpasswrd(String pw)
	{
		passwrd.sendKeys(pw);
		
	}
	
	
	public void clicklogin()
	{

		login.click();
	
	}
}

package testng_with_ddf_BU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")private  WebElement clickbtn;
	
	
	public loginpage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	
	}
	
	public void inputswablabsusername(String un)
	{
	
		username.sendKeys(un);
	}
	
	
	public void inputswablabspassword(String pw)
	{
	
	password.sendKeys(pw);
	}
	
	public void clickloginbtn()
	{
		clickbtn.click();
	}
	
	
	
}

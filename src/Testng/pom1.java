package Testng;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	
	
	
	private static final SearchContext WebDriver = null;
	@FindBy(xpath = "//input[@id='user-name']")  private WebElement username;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//input[@type='submit']") private  WebElement loginbtn;
	
	
	public pom1(WebDriver driver)
	{
	
		PageFactory.initElements( driver,this);
	}
	
	
	public void inputslusername(String un)
	
	{
		
		username.sendKeys(un);
	}

	
	public void inputslpassword(String pw)
	{

		password.sendKeys(pw);
	}
	
	
	public void clickloginbt()
	{
		loginbtn.click();
	}

}

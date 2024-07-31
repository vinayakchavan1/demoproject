package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage {
	
	@FindBy(xpath = "//input[@type='text']") private WebElement username;
	@FindBy(xpath = "//input[@type='password']") private WebElement passwodd;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	
	
	
  public	facebookloginpage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);

	}
	
	
	
	public void inputfbusername(String un)
	{

		username.sendKeys(un);
	}
	
	
	public void inputfbpassword(String pw)
	{
		passwodd.sendKeys(pw);
		
	}
	
	public void clickloginbtn()
	{
		
		loginbtn.click();
		
	}
	

}

package demo_sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slloginpage {
	
	
	@FindBy(xpath = "//input[@type='text']") private WebElement username;
	@FindBy(xpath = "//input[@type='password']") private WebElement password;
	@FindBy(xpath = "//input[@type='submit']") private WebElement submitbtn;
	
	public slloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void inputswablabusername( )
	{
		username.sendKeys("standard_user");
	}
	
	
	public void inputswablabpasword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clicksubmitbtn()
	{
		submitbtn.click();
	}
	

}

package fb_ddftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_login {
	
	
	
	
	@FindBy(xpath = "//input[@name='email']") private WebElement username;
	@FindBy(xpath = "//input[@id='pass']")private WebElement paswrd;
	@FindBy(xpath = "//button[@name='login']")private WebElement clicklloginbtn;
	
	
	
	public fb_login(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void inputusername(String un)
	{
	
		username.sendKeys(un);
	
	}
	
	
	public void password(String pw)
	{
	
		paswrd.sendKeys(pw);
	
	}
	
	public void loginbtnclick()
	{
	
		clicklloginbtn.click();
	}
	
	
	
	
	
	
	
	
	
}

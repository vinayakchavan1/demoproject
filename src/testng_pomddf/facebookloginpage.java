package testng_pomddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage {

	
	
	
	@FindBy(xpath = "//input[@type='text']") private WebElement username;
	@FindBy(xpath = "//input[@type='password']")private WebElement paswrd;
	@FindBy(xpath = "//button[text()='Log in']")private WebElement clicklloginbtn;
	
	
   public facebookloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void inputusername(String un)
	{

		username.sendKeys(un);
	}

	
	
	public void inputpassword(String pw)
	{
		paswrd.sendKeys(pw);
		
	}
	
	public void clickloginbtn()
	{
		clicklloginbtn.click();
	}
	
	
	
	
}

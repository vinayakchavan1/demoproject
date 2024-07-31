package swab_labs_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slhomepage {

	
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logoText;
	@FindBy(xpath = "//div[@class='bm-burger-button']") private WebElement openMenuBtn;
	
	
	public slhomepage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void verifySwagLabsHomePageLogo()
	{
	String actLogoText = logoText.getText();
	
	if(actLogoText.equals("Swag Labs"))
	{
	System.out.println("TC Pass");
	}
	else
	{
	System.out.println("TC Fail");
	}
	}
	
	public void clickSwagLabsHomePageOpenMenu()
	{
	openMenuBtn.click();
	}
}

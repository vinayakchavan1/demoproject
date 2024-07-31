package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	
	
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement verifyswalabslogo;
	@FindBy(xpath ="//button[text()='Open Menu']" ) private WebElement clickslopenmenubtn;
	
	
	public  pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	

	public String verifysllogo()
	{
	

		String logo = verifyswalabslogo.getText();
		return logo;
	
	}
	
	
	public void menubtn()
	{
		
		clickslopenmenubtn.click();
		
	}
	
	
}

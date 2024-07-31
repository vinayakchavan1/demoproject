package testng_with_ddf_BU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jakarta.xml.bind.Element;

public class homepage {
	
	@FindBy(xpath = "//div[text()='Swag Labs']")private WebElement verifytextname;
	

	public homepage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifylogo()
	{
		String text = verifytextname.getText();
		System.out.println(text);
		
	}
	
	
}

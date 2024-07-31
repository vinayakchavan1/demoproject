package demo_sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slhomepage {
	
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement name;
	@FindBy(xpath = "//button[@type='button']") private WebElement profilebtn;
	
	
	public slhomepage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyname()
	{
		String nam = name.getText();
		System.out.println(nam);
	}
	
	
	
	public void clickprogilebtn()
	{
		profilebtn.click();
	}

}

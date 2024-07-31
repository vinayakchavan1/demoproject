package demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slloginpage {
	
	//step1: declaration of variable
	@FindBy(xpath="//input[@id='user-name']") private WebElement UN; //-> private WebElement UN=driver.findElement(By.xpath("")); //early/basic initialization
	@FindBy(xpath="//input[@id='password']") private WebElement PWD; // private WebElement UN=driver.findElement(By.xpath(""));
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn; // private WebElement UN=driver.findElement(By.xpath(""));
	//@FindBy(xpath="//div[@class='error-message-container error']") private WebElement errorMsg;
	//step2: initialization
	
	
	
	public slloginpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this); //className.methodname(webdriverObject,thisKeyword);
	}
	
	
	//step3: usage
	public void inpSwagLabsLoginPageUsername(String username) //convert this method into method with parameter
	{
	UN.sendKeys(username);
	}
	public void inpSwagLabsLoginPagePassword(String password)
	{
	PWD.sendKeys(password);
	}
	
	public void clickSwagLabsLoginPageLogiBtn1()
	{
	loginBtn.click();
	}


	public void clickSwagLabsLoginPageLogiBtn() {
		// TODO Auto-generated method stub
		
	}
	
}

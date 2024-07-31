package testng_pomddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogoutpage {
	
	
	
  @FindBy(xpath = "//div[@aria-label='Your profile']")	private WebElement clickonprofile;
 @FindBy(xpath = "//span[text()='Log out'] ")	private WebElement clicklogoutbtn;
 
 
 public facebooklogoutpage(WebDriver driver)
 {
	PageFactory.initElements(driver, this); 
	
 }
 
 public void clickprofile()
 {
	 clickonprofile.click();
 }
 
 
 public void logoutbtn()
 {

 clicklogoutbtn.click();
 }
	
	
	
	
	
	

}

package testng_with_ddf_BU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		String logotext = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		
		System.out.println(logotext);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
		
		
		
		
	}

}

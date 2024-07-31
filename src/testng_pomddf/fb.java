package testng_pomddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class fb {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7030249300");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("03020302");
		
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(4000);
		
		String name = driver.findElement(By.xpath("//span[text()='Vinayak Ashok Chavan']")).getText();
		System.out.println(name);
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']")).click();
	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		
		
		
		
		
	}
}

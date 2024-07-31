package scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss1 {
	
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing\\Notes\\screenshots\\demo.png");
		
		FileHelper.copyFile(src, dest);
		
		
	}
	
	
	
	

}

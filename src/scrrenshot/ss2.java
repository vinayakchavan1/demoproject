package scrrenshot;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss2 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cardekho.com/");
		
		WebElement logo = driver.findElement(By.xpath("//a[@title='CarDekho']"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing\\Notes\\screenshots\\demo1.png");
		
		FileHelper.copyFile(src, dest);
		
		
	}

}

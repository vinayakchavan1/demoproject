package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class exce_testannoatation {
	
	
	@Test
	public void dat() throws EncryptedDocumentException, IOException
	{
		
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		
		String data = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data);
		
		
		
	
		
		
	}
	
}



package Assingement;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testdata/DemoTestcase.xlsx");
		
		Workbook w = WorkbookFactory.create(fis);
		String url = w.getSheet("Sheet1").getRow(1).getCell(4).toString();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
	
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']/../..//button[@id='addToCart']")).click();

	}

}

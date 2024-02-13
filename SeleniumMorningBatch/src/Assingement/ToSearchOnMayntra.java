package Assingement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchOnMayntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("slippers");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();

	}

}

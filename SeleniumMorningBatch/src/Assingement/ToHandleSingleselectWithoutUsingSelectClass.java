package Assingement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleSingleselectWithoutUsingSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value='14']")).click();
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Nov')]")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1995')]")).click();

	}

}

package Assingement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseLocators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Honey");
		driver.findElement(By.id("LastName")).sendKeys("sahu");
		driver.findElement(By.id("Email")).sendKeys("sahuhoney9095@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		

	}

}

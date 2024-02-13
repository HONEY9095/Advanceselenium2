package Assingement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassUsernameAndPassword {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("honey");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		

	}

}

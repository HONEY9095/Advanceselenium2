package Assingement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeInstagramPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("123456",Keys.CONTROL+"A"+"C");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(Keys.CONTROL+"V");

	}

}

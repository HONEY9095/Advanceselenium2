package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.linkText("Login")).click();
		Alert confirmationalert = driver.switchTo().alert();
		System.out.println(confirmationalert.getText());
		confirmationalert.accept();


	}

}

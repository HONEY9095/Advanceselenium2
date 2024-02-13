package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDisplayedAndEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before entering the data");
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println("=========================================");
		System.out.println("After entering the data");
		driver.findElement(By.name("username")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("123456");
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
	}

}

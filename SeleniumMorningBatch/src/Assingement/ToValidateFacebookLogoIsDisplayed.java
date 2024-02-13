package Assingement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToValidateFacebookLogoIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if(logo==true) {
			System.out.println("Facebook logo is Displayed");
		}
		else {
			System.out.println("Facebook log is not Displayed");
		}

	}

}

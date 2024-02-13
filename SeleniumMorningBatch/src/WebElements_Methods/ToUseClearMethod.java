package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.vtiger.com/vtigercrm/");
        Thread.sleep(2000);
       WebElement usernametextfield = driver.findElement(By.id("username"));
       usernametextfield.clear();
       Thread.sleep(1000);
       usernametextfield.sendKeys("Sachin");
       WebElement passwordtextfield = driver.findElement(By.id("password"));
       passwordtextfield.clear();
       passwordtextfield.sendKeys("123456");
	}

}

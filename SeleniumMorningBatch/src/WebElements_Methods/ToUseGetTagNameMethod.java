package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.actitime.com/");
		 Thread.sleep(5000);
		 WebElement tryfree = driver.findElement(By.linkText("Try Free"));
		 System.out.println(tryfree.getTagName());

	}

}

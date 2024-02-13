package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOUseClickAndSendKeysAndGettitle {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("honey");
		 driver.findElement(By.id("add-to-cart-button-2")).click();
		 Thread.sleep(3000);
		 WebElement a = driver.findElement(By.xpath("//p[text()='Enter valid recipient email']"));
         System.out.println(a);
	}

}

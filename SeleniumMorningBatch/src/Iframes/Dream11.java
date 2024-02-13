package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        driver.get("https://www.dream11.com/");
  //     driver.switchTo().frame(0);
  //      driver.findElement(By.id("regEmail")).sendKeys("98765431");

        //By using id or name
  //      driver.switchTo().frame("send-sms-iframe");
  //   driver.findElement(By.id("regEmail")).sendKeys("98765431");
        
        //By using WebElement
        
       WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
       driver.switchTo().frame(iframe);
       driver.findElement(By.id("regEmail")).sendKeys("98765431");
       
       driver.switchTo().parentFrame();
       driver.findElement(By.linkText("About Us")).click();
       
       
        
	}

}

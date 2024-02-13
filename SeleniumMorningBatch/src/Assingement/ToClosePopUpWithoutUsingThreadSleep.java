package Assingement;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClosePopUpWithoutUsingThreadSleep {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     	driver.get("https://www.woodenstreet.com/");
	   for (;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}

			catch (Exception E) {
				Thread.sleep(2000);
			}

		}

	}

}

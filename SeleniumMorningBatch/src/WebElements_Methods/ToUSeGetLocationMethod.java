package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUSeGetLocationMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Point Locationofbutton = driver.findElement(By.name("login")).getLocation();
		System.out.println(Locationofbutton);

	}

}

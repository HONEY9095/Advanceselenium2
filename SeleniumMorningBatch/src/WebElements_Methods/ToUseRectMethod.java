package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseRectMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Rectangle rect = driver.findElement(By.name("login")).getRect();
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}

}

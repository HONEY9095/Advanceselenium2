package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Dimension sizeodbutton = driver.findElement(By.name("login")).getSize();
		System.out.println(sizeodbutton);
		System.out.println(sizeodbutton.getHeight());
		System.out.println(sizeodbutton.getWidth());

	}

}

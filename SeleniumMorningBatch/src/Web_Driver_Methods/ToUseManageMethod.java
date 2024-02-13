package Web_Driver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// To maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// To minimize
		driver.manage().window().minimize();

		// To fullscreen
		driver.manage().window().fullscreen();

		// To getsize
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		// Tosetsize
		driver.manage().window().setSize(new Dimension(700, 600));

		// Togetposition

		Point position = driver.manage().window().getPosition();
		System.out.println(position);

		// Tosetposition

		// driver.manage().window().setPosition(new Point(70,140));

		Point p = new Point(40, 60);
		driver.manage().window().setPosition(p);

	}

}

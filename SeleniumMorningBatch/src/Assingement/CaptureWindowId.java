package Assingement;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureWindowId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cornerhouseicecreams.com/");
		Thread.sleep(2000);
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.manage().window().setPosition(new Point(70,90));
		

	}

}

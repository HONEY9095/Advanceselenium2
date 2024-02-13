package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAlignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		 int x1 = driver.findElement(By.id("email")).getLocation().getX();
		 int x2 = driver.findElement(By.id("pass")).getLocation().getX();
		 System.out.println(x1);
		 System.out.println(x2);
		 
		 if(x1==x2) {
			 System.out.println("are Aligned");
		 }
		 else {
			 System.out.println("are not aligned");
		 }

	}

}

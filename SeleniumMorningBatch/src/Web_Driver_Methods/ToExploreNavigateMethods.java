package Web_Driver_Methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.navigate().to("https://online.kfc.co.in/");
	//	driver.navigate().to(new URL("https://online.kfc.co.in/"));
		
		driver.get("https://www.netflix.com/in/");
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();

	}

}

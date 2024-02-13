package ToTakeScreenShortOfWebPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://www.youtube.com/");
        TakesScreenshot ts =(TakesScreenshot)driver;	
       File temp = ts.getScreenshotAs(OutputType.FILE);
       File src = new File("./errorShorts/youtube.png");
       FileHandler.copy(temp, src);
 
	}

}

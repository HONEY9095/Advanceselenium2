package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiselect = driver.findElement(By.id("cars"));
		
		Select s = new Select(multiselect);
	     System.out.println(s.isMultiple());
	     s.selectByIndex(0);
	     s.selectByValue("199");
	     Thread.sleep(1000);
	     
	     //to deselect
	     s.deselectAll();

	}

}

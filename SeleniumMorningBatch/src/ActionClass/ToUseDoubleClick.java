package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement addbutton = driver.findElement(By.id("add"));
		
		Actions action = new Actions(driver);
		action.doubleClick(addbutton).perform();
		action.doubleClick(addbutton).perform();
		action.doubleClick(addbutton).perform();

	}

}

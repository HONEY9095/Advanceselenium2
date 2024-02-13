package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindMultipleElements {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		List<WebElement> allelements= driver.findElements(By.className("menu-show"));
		for(WebElement ele:allelements ) {
			System.out.println(ele.getText());
		}

	}

}

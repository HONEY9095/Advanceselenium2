package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/signup");
		// identify dropdown
		WebElement daydropdown = driver.findElement(By.id("day"));// day
		WebElement monthdropdown = driver.findElement(By.id("month"));// month
		WebElement yeardropdown = driver.findElement(By.id("year"));// year

		// handle by select class

		Select dayselect = new Select(daydropdown);// daydropdown
		Select monthselect = new Select(monthdropdown);// monthdropdown
		Select yearselect = new Select(yeardropdown);// yeardropdown

		// call methods

		dayselect.selectByIndex(13);// by index
		monthselect.selectByValue("11");// by value
		yearselect.selectByVisibleText("1995");// by visibletext

		// To fetch every Option in month dropdown

		List<WebElement> allmonths = monthselect.getOptions();
		for (WebElement month : allmonths) {
			System.out.println(month.getText());
			monthselect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
		}

		System.out.println("=================");
		System.out.println( monthselect.isMultiple());

	}

}

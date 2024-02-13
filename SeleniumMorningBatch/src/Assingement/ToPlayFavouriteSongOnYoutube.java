package Assingement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPlayFavouriteSongOnYoutube {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Dancing on my own");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[@contains(aria-label,'Calum Scott')]")).click();

	}

}

package Assingement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrlAndPrintIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().setSize(new Dimension(800,800));
		System.out.println(driver.getCurrentUrl());

	}

}

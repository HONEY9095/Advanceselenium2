package Assingement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGrabTitleOfPolarBear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://polarbear.com/");
	    String title = driver.getTitle();
        System.out.println(title);
	}

	}



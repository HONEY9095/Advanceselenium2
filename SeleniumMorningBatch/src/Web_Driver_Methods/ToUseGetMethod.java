package Web_Driver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.get("https://www.facebook.com/login/");

	}

}

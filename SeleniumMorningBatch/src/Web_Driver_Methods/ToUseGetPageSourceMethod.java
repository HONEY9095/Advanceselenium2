package Web_Driver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.zomato.com/");
		 String sourceCode = driver.getPageSource();
		 System.out.println(sourceCode);

	}

}

package Web_Driver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/login/web/?email=9039474268&is_from_lara=1");
	   String titleofwebpage = driver.getTitle();
	   System.out.println(titleofwebpage);

	}

}

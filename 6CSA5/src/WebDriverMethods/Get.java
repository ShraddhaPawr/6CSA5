package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.get("https://demo.actitime.com/login.do");
    driver.get("https://demowebshop.tricentis.com/");
}
}

package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithTabs {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com/");
	driver.close();
	driver.close(); //NOSuchWindowException
	}
}

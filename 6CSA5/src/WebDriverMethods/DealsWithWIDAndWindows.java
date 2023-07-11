package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealsWithWIDAndWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		String facebookWid = driver.getWindowHandle();
		System.out.println("facebookWid"+ facebookWid);
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com");
		String instaWid = driver.getWindowHandle();
		System.out.println("instaWid ="+ instaWid);
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID.size());
		System.out.println(allWindowsID);
		for (String wid : allWindowsID) {
			System.out.println(wid);
		}
	}
}


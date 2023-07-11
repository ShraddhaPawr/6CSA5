package OptimizeSearchCriteria;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("shraddha");
		username.sendKeys(Keys.TAB +"12345678");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB+Keys.chord(Keys.TAB));
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
}

package SearchContextMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement MainForm = driver.findElement(By.tagName("form"));
	WebElement username = MainForm.findElement(By.name("email"));
	username.sendKeys("Shraddha");
	WebElement password = MainForm.findElement(By.id("pass"));
	password.sendKeys("123456789");
	WebElement login = MainForm.findElement(By.name("login"));
	login.click();
}
}

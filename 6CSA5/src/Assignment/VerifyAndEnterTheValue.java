package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAndEnterTheValue {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement Username=driver.findElement(By.name("username"));
	WebElement Password = driver.findElement(By.name("password"));
	WebElement Login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	if(Username.isDisplayed() && Username.isEnabled()) {
		Username.sendKeys("Admin");
	}
	else {
		System.out.println("username not enabled and not displayed");
	}
	if(Password.isDisplayed() && Password.isEnabled())
	{
		Password.sendKeys("admin123");
	}
	else {
		System.out.println("password not enabled and not displayed");
	}
	if(Login.isDisplayed() && Login.isEnabled())
	{
		Login.click();
	}
}
}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shraddha");
		driver.findElement(By.id("LastName")).sendKeys("Pawar");
		driver.findElement(By.id("Email")).sendKeys("spd.123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
		driver.findElement(By.id("register-button")).click();
	}
}


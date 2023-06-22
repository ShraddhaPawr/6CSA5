package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Shraddha");
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("98765432");
		driver.findElement(By.name("sex")).click();
		
	}
}

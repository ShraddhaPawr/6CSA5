package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rushi/Desktop/Selenium%20WebTec/13.html");
		WebElement textbox = driver.findElement(By.xpath("//input[@value=\"A\"]"));
		textbox.clear();
		textbox.sendKeys("hello");
	}
}

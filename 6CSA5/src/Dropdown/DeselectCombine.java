package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCombine {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Rushi/Desktop/Selenium%20WebTec/dropdown.html");
		WebElement city = driver.findElement(By.id("CITY"));
		Select select=new Select(city);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
	Thread.sleep(3000);
	select.deselectByIndex(0);
	Thread.sleep(1000);
	select.deselectByValue("2");
	Thread.sleep(1000);
	select.deselectByVisibleText("KATHMANDU");
	}
}

package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption_SSD {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Rushi/Desktop/Selenium%20WebTec/dropdown.html");
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select select=new Select(country);
		select.selectByIndex(3);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());

}
}
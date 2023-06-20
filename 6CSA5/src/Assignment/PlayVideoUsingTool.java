package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayVideoUsingTool {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com"); 
	  driver.findElement(By.name("search_query")).sendKeys("ask laftan anlamaz title song");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//img[@style=\"background-color: transparent;\"]")).click();
		}
}
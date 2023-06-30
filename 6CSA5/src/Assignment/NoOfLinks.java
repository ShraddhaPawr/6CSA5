package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/webhp");
	List<WebElement> NoOfLinks = driver.findElements(By.tagName("a"));
	System.out.println(NoOfLinks.size());
	for(WebElement links:NoOfLinks)
		System.out.println(links.getText());
	driver.close();
}
}

package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Rushi/Desktop/Selenium%20WebTec/dropdown.html");
	WebElement city = driver.findElement(By.id("CITY"));
	Select select=new Select(city);
	boolean ispresent=false;
	List<WebElement> allOptions = select.getOptions();
	for(WebElement singleOption:allOptions) 
		if(singleOption.getText().equals("DHAKA")) {
			ispresent=true;
			singleOption.click();
		}
	    if(ispresent) {
	    	System.out.println("Option Is Present");
	    }
		else
			System.out.println("Option Is Not Available");
		}
}

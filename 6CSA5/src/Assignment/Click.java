package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");  //1
		WebElement password1 = driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
		password1.click();
		driver.get("https://www.uber.com");  //2
		WebElement pickup= driver.findElement(By.name("pickup"));
		pickup.click();
		driver.get("https://www.facebook.com");  //3
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		driver.get("https://www.pizzahut.com/");   //4
		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Enter your location for delivery\"]"));
		search.click();
		driver.get("https://www.amazon.com");   //5
		WebElement search2 = driver.findElement(By.id("twotabsearchtextbox"));
		search2.click();
		driver.get("https://www.meesho.com");   //6
		WebElement search3 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search3.click();
		driver.get("https://www.lenskart.com");   //7
		WebElement search4 = driver.findElement(By.name("q"));
		search4.click();
		driver.get("https://www.swiggy.com");   //8
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		driver.get("https://www.foodpanda.com");   //9
		WebElement search5 = driver.findElement(By.id("open-search"));
		search5.click();
		driver.get("https://www.myntra.com");   //10
		WebElement search6 = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		search6.click();
	}
}

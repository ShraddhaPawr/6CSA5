package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com");  //1
		driver.findElement(By.tagName("input"));
		System.out.println("RedBus element identified");
		driver.get("https://www.Facebook.com");  //2
		driver.findElement(By.tagName("div"));
		System.out.println("Facebook element identified");
		driver.get("https://www.foodpanda.com");  //3
		driver.findElement(By.tagName("div"));
		System.out.println("Foodpanda element identified");
		driver.get("https://www.swiggy.com");  //4
		driver.findElement(By.tagName("input"));
		System.out.println("Swiggy element identified");
		driver.get("https://www.amazon.com");  //5
		driver.findElement(By.tagName("a"));
		System.out.println("Amazon element identified");
		driver.get("https://www.myntra.com");  //6
		driver.findElement(By.tagName("input"));
		System.out.println("Myntra element identified");
		driver.get("https://www.zomato.com");  //7
		driver.findElement(By.tagName("img"));
		System.out.println("Zomato element identified");
		driver.get("https://www.youtube.com");  //8
		driver.findElement(By.tagName("div"));
		System.out.println("YouTube element identified");
		driver.get("https://www.github.com");  //9
		driver.findElement(By.tagName("input"));
		System.out.println("Github element identified");
		driver.get("https://www.uber.com");  //10
		driver.findElement(By.tagName("a"));
		System.out.println("Uber element identified");
	}
}
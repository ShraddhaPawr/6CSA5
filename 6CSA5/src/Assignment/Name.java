package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");   //1
		driver.findElement(By.name("generator"));
		System.out.println("element identified");
		driver.get("https://www.facebook.com");  //2
		driver.findElement(By.name("email"));
		System.out.println("element identified");
		driver.get("https://www.flipkart.com");  //3
		driver.findElement(By.name("robots"));
		System.out.println("element identified");
		driver.get("https://www.whatsapp.com");  //4
		driver.findElement(By.name("referrer"));
		System.out.println("element identified");
		driver.get("https://www.swiggy.com");  //5
		driver.findElement(By.name("description"));
		System.out.println("element identified");
		driver.get("https://www.zomato.com");  //6
		driver.findElement(By.name("viewport"));
		System.out.println("element identified");
		driver.get("https://www.instagram.com");  //7
		driver.findElement(By.name("robots"));
		System.out.println("element identified");
		driver.get("https://www.meesho.com");   //8
		driver.findElement(By.name("description"));
		System.out.println("element identified"); 
		driver.get("https://www.foodpanda.com");  //9
		driver.findElement(By.name("viewport"));
		System.out.println("element identified");
		driver.get("https://www.lenskart.com/");  //10
		driver.findElement(By.name("description"));
		System.out.println("element identified");
		driver.close();
	}
}


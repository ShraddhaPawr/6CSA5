package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");   //1
		driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("element identified");
		driver.get("https://www.swiggy.com");  //2
		driver.findElement(By.linkText("Login"));
		System.out.println("element identified");
		driver.get("https://www.lenskart.com/");   //3
		driver.findElement(By.linkText("KIDS GLASSES"));
		System.out.println("element identified");
		driver.get("https://www.zomato.com");   //4
		driver.findElement(By.linkText("Add restaurant"));
		System.out.println("element identified");
		driver.get("https://github.com/");    //5
		driver.findElement(By.linkText("Privacy"));
		System.out.println("element identified");
		driver.get("https://www.dominos.co.in/");    //6
		driver.findElement(By.linkText("Beverages"));
		System.out.println("element identified");
		driver.get("https://www.coursera.org/");    //7
		driver.findElement(By.linkText("Accessibility"));
		System.out.println("element identified");
		driver.get("https://www.netflix.com");    //8
		driver.findElement(By.linkText("FAQ"));
		System.out.println("element identified");
		driver.get("https://www.uber.com");    //9
		driver.findElement(By.linkText("Uber"));
		System.out.println("element identified");
		driver.get("https://www.myntra.com");    //10
		driver.findElement(By.linkText("Gift Cards"));
		System.out.println("element identified");
		driver.close();
	}
	}


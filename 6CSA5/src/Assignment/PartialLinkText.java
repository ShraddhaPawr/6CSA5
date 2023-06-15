package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");   //1
	driver.findElement(By.partialLinkText("Forgotten passwor"));
	System.out.println("element identified");
	driver.get("https://www.swiggy.com");  //2
	driver.findElement(By.partialLinkText("Logi"));
	System.out.println("element identified");
	driver.get("https://www.lenskart.com/");   //3
	driver.findElement(By.partialLinkText("KIDS GLASS"));
	System.out.println("element identified");
	driver.get("https://www.zomato.com");   //4
	driver.findElement(By.partialLinkText("Add restaura"));
	System.out.println("element identified");
	driver.get("https://github.com/");    //5
	driver.findElement(By.partialLinkText("Priva"));
	System.out.println("element identified");
	driver.get("https://www.dominos.co.in/");    //6
	driver.findElement(By.partialLinkText("Beverage"));
	System.out.println("element identified");
	driver.get("https://www.coursera.org/");    //7
	driver.findElement(By.partialLinkText("Accessibili"));
	System.out.println("element identified");
	driver.get("https://www.netflix.com");    //8
	driver.findElement(By.partialLinkText("FA"));
	System.out.println("element identified");
	driver.get("https://www.uber.com");    //9
	driver.findElement(By.partialLinkText("Ube"));
	System.out.println("element identified");
	driver.get("https://www.myntra.com");    //10
	driver.findElement(By.partialLinkText("Gift Card"));
	System.out.println("element identified");
	driver.close();
}
}






package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");  //1
		driver.findElement(By.id("email"));
		System.out.println("element identified");
		driver.get("https://www.Swiggy.com"); //2
		driver.findElement(By.id("root"));
		System.out.println("element identified");
		driver.get("https://www.Zomato.com");  //3
		driver.findElement(By.id("root"));
		System.out.println("element identified");
		driver.get("https://www.uber.com");  //4
		driver.findElement(By.id("animation-wrapper"));
		System.out.println("element identified");
		driver.get("https://www.youtube.com");  //5
		driver.findElement(By.id("contents"));
		System.out.println("element identified");
		driver.get("https://www.instagram.com");   //6
		driver.findElement(By.id("ssrb_root_start"));
		System.out.println("element identified");
		driver.get("https://www.whatsapp.com");  //7
		driver.findElement(By.id("facebook"));
		System.out.println("element identified");
		driver.get("https://www.meesho.com");   //8
		driver.findElement(By.id("__next"));
		System.out.println("element identified");
		driver.get("https://www.naukri.com");   //9
		driver.findElement(By.id("root"));
		System.out.println("element identified");
		driver.get("https://www.irctc.co.in/nget/train-search");  //10
		driver.findElement(By.id("div-gpt-ad-9999999999999-0"));
		System.out.println("element identified");
		driver.close();
	}
}


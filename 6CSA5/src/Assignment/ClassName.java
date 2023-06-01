package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");   //1
		driver.findElement(By.className("_8eso"));
		System.out.println("element identified");
		driver.get("https://github.com/");  //2
		driver.findElement(By.className("position-relative"));
		System.out.println("element identified");
		driver.get("https://www.boat-lifestyle.com/"); //3
		driver.findElement(By.className("js"));
		System.out.println("element identified");
		driver.get("https://www.swiggy.com");  //4
		driver.findElement(By.className("fonts-loaded"));
		System.out.println("element identified");
		driver.get("https://www.uber.com");  //5
		driver.findElement(By.className("_styletron_hydrate_"));
		System.out.println("element identified");
		driver.get("https://www.coursera.org/?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF__arte&utm_content=B2C&campaignid=18216928764&adgroupid=141296025832&device=c&keyword=coursera%20login&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=619458216887&hide_mobile_promo&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6etIWG1pmHOTeyTXWoZKJ4MuNKARSWJp00NAlQ2lxjtJMJrwUrRaH0aAj-IEALw_wcB"); //6
		driver.findElement(By.className("rc-MetatagsWrapper"));
		System.out.println("element identified");
		driver.get("https://www.linkedin.com/login");  //7
		driver.findElement(By.className("artdeco"));
		System.out.println("element identified");
		driver.get("https://terna.qualcampus.com/Account/LogOn"); //8
		driver.findElement(By.className("col-lg-12"));
		System.out.println("element identified");
		driver.get("https://www.flipkart.com/");  //9
		driver.findElement(By.className("fonts-loaded"));
		System.out.println("element identified");
		driver.get("https://www.foodpanda.com/");  //10
		driver.findElement(By.className("no-js"));
		System.out.println("element identified");
		driver.close();
	}

}

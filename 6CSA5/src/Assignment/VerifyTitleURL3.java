package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleURL3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String d=driver.getTitle();
		String a=driver.getCurrentUrl();
		String b="https://www.flipkart.com/";
		String e="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if (d.equals(e)) 
			System.out.println("PASS");
		 else 
			 System.out.println("FAIL");
	if(a.equals(b))
		System.out.println("PASS");
	else
		System.out.println("FAIL");
	}
	}

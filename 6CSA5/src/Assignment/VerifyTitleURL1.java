package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleURL1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	String d=driver.getTitle();
	String a=driver.getCurrentUrl();
	String b="https://www.facebook.com/";
	String e="Facebook – log in or sign up";
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
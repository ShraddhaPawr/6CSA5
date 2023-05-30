package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Cookie cooky=new Cookie("Selenium","7");
		driver.manage().addCookie(cooky);
		driver.manage().deleteCookieNamed("Selenium");
	}
}

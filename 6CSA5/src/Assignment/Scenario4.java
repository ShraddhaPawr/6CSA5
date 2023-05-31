package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		Cookie cooky1=new Cookie("Shraddha","1");
		Cookie cooky2=new Cookie("Rushi","4");
		driver.manage().addCookie(cooky1);
		driver.manage().addCookie(cooky2);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookie(cooky2);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookieNamed("Shraddha");
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
	}
}

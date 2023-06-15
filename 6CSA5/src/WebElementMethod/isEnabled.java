package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://instagram.com");
Thread.sleep(3000);
WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
System.out.println(login.isEnabled());
}
}

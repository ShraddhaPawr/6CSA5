package Assignment;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ResizingBrowsers {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Dimension d=new Dimension(790,900);
	driver.manage().window().setSize(d);
	Point s=new Point(-4,0);
	driver.manage().window().setPosition(s);
	WebDriver driver2=new EdgeDriver();
	driver2.get("https://www.whatsapp.com");
	Dimension a=new Dimension(790,900);
	driver2.manage().window().setSize(a);
	Point b=new Point(770,7);
	driver2.manage().window().setPosition(b);
}
}
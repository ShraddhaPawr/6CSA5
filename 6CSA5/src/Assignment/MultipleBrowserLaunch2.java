package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowserLaunch2 {
public static void main(String[] args) {
	System.out.println("Enter the browserName");
	Scanner sc=new Scanner(System.in);
    String value=sc.nextLine();
	String browserName =value;
	if(browserName.equalsIgnoreCase("chrome"));
	 WebDriver driver=new ChromeDriver();
if(browserName.equalsIgnoreCase("edge"));
		WebDriver driver2=new EdgeDriver();
}
}
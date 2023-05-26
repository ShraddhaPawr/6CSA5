 package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.base.CaseFormat;


public class MultipleBrowserLaunch{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
String value=sc.nextLine();
	switch(value) {
	case 1:{
		WebDriver driver=new ChromeDriver();break;
	}
	case 2:{
	WebDriver driver=new EdgeDriver();break;
}
}
}
}
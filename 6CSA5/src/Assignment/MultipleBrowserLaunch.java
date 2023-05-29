 package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.base.CaseFormat;

import net.bytebuddy.agent.builder.AgentBuilder.Ignored;


public class MultipleBrowserLaunch{
public static void main(String[] args) {
	System.out.println("Enter the value");
	Scanner sc=new Scanner(System.in);
    String value=sc.nextLine();
	switch(value) {
	case ("chrome"):{
		WebDriver driver=new ChromeDriver();break;
	}
	case ("edge"):{
	WebDriver driver=new EdgeDriver();break;
}
}
}
}
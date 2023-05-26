package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class edgeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.Driver", "./msedgedriver.exe");
	EdgeDriver d=new EdgeDriver();
}
}

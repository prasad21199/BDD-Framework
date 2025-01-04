package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before(order=1)
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com");
	System.out.println("openBrowser");
}	@After(order=1)
public void closeBrowser() {
	driver.manage().window().minimize();
	driver.quit();
	System.out.println("closeBrowser");
}
}

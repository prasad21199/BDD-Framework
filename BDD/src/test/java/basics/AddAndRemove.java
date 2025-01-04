package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndRemove {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com"); 
	driver.findElement(By.className("desktop-searchBar")).sendKeys("Mens Shoes"+Keys.ENTER); 
	driver.findElement(By.xpath("(//li[@class='product-base']/child::a)[1]")).click(); 
	Set<String> allWid = driver.getWindowHandles(); 
	for (String wid : allWid) {
		driver.switchTo().window(wid);
	} 
	driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='8']")).click();
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click(); 
	driver.findElement(By.linkText("GO TO BAG")).click(); 
	driver.findElement(By.xpath("//div[text()='APPLY']")).click(); 
	driver.findElement(By.id("applyCoupon")).click(); 
	driver.findElement(By.xpath("//button[text()='REMOVE']")).click(); 
	driver.findElement(By.xpath("//div[text()='Remove 1 item']/following::button[text()='REMOVE']")).click(); 
	String msg = driver.findElement(By.className("emptyCart-base-emptyText")).getText();
	System.out.println(msg);
	driver.quit();
}
}

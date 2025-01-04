package generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.BaseClass;

public class WebdriverUtils {
	WebDriver driver=BaseClass.driver;
public void verifyTitle(String expectedTitle) {
	String actualTitle = driver.getTitle();
	boolean res = actualTitle.contains(expectedTitle);
	Assert.assertTrue(res, "Both actual and expected title are not same");
}
}

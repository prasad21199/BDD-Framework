package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(className = "desktop-searchBar")
private WebElement searchBox;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void searchItem(String item) {
	searchBox.sendKeys(item+Keys.ENTER);
}
}

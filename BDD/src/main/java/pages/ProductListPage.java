package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	@FindBy(xpath = "(//li[@class='product-base']/child::a)[1]")
	private WebElement firstItem;

	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickTheFirstItem() {
		firstItem.click();
	}
}

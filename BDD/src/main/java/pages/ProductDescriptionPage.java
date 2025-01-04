package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage {
	@FindBy(xpath = "//div[text()='ADD TO BAG']")
	private WebElement addToBag;
	@FindBy(linkText = "GO TO BAG")
	private WebElement goToBagLink;
	public ProductDescriptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addToBag() {
		addToBag.click();
	}
	public void goToBag() {
		goToBagLink.click();
	}
}

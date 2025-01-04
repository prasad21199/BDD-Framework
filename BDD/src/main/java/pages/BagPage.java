package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagPage {
@FindBy(id="cartItemsList")
private WebElement addItem;
@FindBy(xpath = "//div[text()='APPLY']")
private WebElement applyCouponButton;
@FindBy(id="applyCoupon")
private WebElement applyButton2;
@FindBy(xpath = "//button[text()='REMOVE']")
private WebElement removeButton;
@FindBy(xpath = "//div[text()='Remove 1 item']/following::button[text()='REMOVE']")
private WebElement removeButton2;
@FindBy(className = "emptyCart-base-emptyText")
private WebElement emptyCartMsg;
public BagPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddItem() {
	return addItem;
}
public WebElement getApplyCouponButton() {
	return applyCouponButton;
}
public WebElement getApplyButton2() {
	return applyButton2;
}
public WebElement getRemoveButton() {
	return removeButton;
}
public WebElement getRemoveButton2() {
	return removeButton2;
}
public WebElement getEmptyCartMsg() {
	return emptyCartMsg;
}

}

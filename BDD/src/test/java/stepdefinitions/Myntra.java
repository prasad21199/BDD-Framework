package stepdefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import generic.WebdriverUtils;
import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BagPage;
import pages.HomePage;
import pages.ProductDescriptionPage;
import pages.ProductListPage;

public class Myntra {
	WebDriver driver=BaseClass.driver;
	ProductDescriptionPage d;
	BagPage b;
	WebdriverUtils w=new WebdriverUtils();
	@Given("User should be present in home page of Myntra")
	public void user_should_be_present_in_home_page_of_myntra() {
	w.verifyTitle("Online Shopping");
	}

	@When("He searches for {string}")
	public void he_searches_for(String item) {
		HomePage h=new HomePage(driver);
		h.searchItem(item);
	}

	@Then("Product List page should be displayed")
	public void product_list_page_should_be_displayed() {
	w.verifyTitle("online in India");
	}

	@When("He clicks on the first Product")
	public void he_clicks_on_the_first_product() {
		ProductListPage l=new ProductListPage(driver);
		l.clickTheFirstItem();
	}

	@Then("Selected product should be displayed in the New tab")
	public void selected_product_should_be_displayed_in_the_new_tab() {
		Set<String> allWid = driver.getWindowHandles(); 
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		} 
		w.verifyTitle("Myntra");
	}

	@When("He selects the size as {string}")
	public void he_selects_the_size_as(String size) {
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='"+size+"']")).click();
	}

	@And("He clicks on Add to bag button")
	public void he_clicks_on_add_to_bag_button() {
		d=new ProductDescriptionPage(driver);
		d.addToBag();
	}

	@And("He clicks on bag icon")
	public void he_clicks_on_bag_icon() {
		d.goToBag();
	}

	@Then("The product should be displayed in the bag")
	public void the_product_should_be_displayed_in_the_bag() {
		b=new BagPage(driver);
		boolean res = b.getAddItem().isDisplayed();
		Assert.assertTrue(res, "The Added item is not present in the cart");
	}

	@When("he clicks on apply coupon")
	public void he_clicks_on_apply_coupon() {
		b.getApplyCouponButton().click();
	}

	@And("he selects the apply button")
	public void he_selects_the_apply_button() {
		b.getApplyButton2().click();
	}

	@When("he clicks on remove button")
	public void he_clicks_on_remove_button() {
		b.getRemoveButton().click();
	}

	@And("he clicks on remove option")
	public void he_clicks_on_remove_option() {
		b.getRemoveButton2().click();
	}

	@Then("Empty bag should be displayed")
	public void empty_bag_should_be_displayed() {
		boolean res = b.getEmptyCartMsg().isDisplayed();
		Assert.assertTrue(res, "The item has not been removed");
		String msg = b.getEmptyCartMsg().getText();
		Assert.assertEquals(msg, "Hey, it feels so light!");
	}


}

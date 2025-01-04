package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Flipkart {
	WebDriver driver;
	@Given("User should be present in flipkart home page")
	public void user_should_be_present_in_flipkart_home_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
	}

	@When("User searches for mobile")
	public void user_searches_for_mobile() {
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
	}

	@Then("Mobile list page should be displayed")
	public void mobile_list_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}
}

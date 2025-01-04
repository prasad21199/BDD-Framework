package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
WebDriver driver;
@Given("User should be present in google webpage")
public void user_should_be_present_in_google_webpage() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@When("User searches for something")
public void user_searches_for_something() {
	driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
}

@Then("search page should be displayed")
public void search_page_should_be_displayed() {
	System.out.println(driver.getTitle());
}
}

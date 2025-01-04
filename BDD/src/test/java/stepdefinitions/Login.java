package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("User should enter {string} as url")
	public void user_should_enter_as_url(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}	@When("He enters {string} as username")
	public void he_enters_as_username(String un) {
		driver.findElement(By.id("username")).sendKeys(un);
	}	@And("He enters {string} as password")
	public void he_enters_as_password(String pwd) {
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}	@And("He clicks on login button")
	public void he_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}	@Then("User should be present in home page")
	public void user_should_be_present_in_home_page() {
		System.out.println(driver.getTitle());
		driver.quit();	}
	@Then("Print the title of the webpage")
	public void print_the_title_of_the_webpage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

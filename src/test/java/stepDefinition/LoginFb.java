package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFb {

	WebDriver driver;

	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}

	@When("User enters the username")
	public void user_enters_the_username() {
		driver.findElement(By.id("email")).sendKeys("sundari");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@When("User clicks the Login button")
	public void user_clicks_the_Login_button() {
		driver.findElement(By.name("Login")).click();

	}

	@Then("User should see the homepage")
	public void user_should_see_the_homepage() {
		driver.close();

	}
}

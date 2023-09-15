package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeDemoLoginCheck {
	WebDriver driver;

	@Given("User should be on orange hrm login page")
	public void user_should_be_on_orange_hrm_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User enters the username as {string} and passsword as {string}")
	public void user_enters_the_username_as_and_passsword_as(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user clicks the login button for orange hrm page")
	public void user_clicks_the_login_button_for_orange_hrm_page() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should see the dashboard text in the homepage")
	public void user_should_see_the_dashboard_text_in_the_homepage() {
		WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		String text = dashboard.getText();
		if (text.equals("Dashboard")) {
			System.out.println("User is succesffuly ondasboard page");
			Assert.assertTrue(true);
		} else {
			System.out.println("User is not on homepage");
			Assert.assertTrue(false);
		}
	}

}

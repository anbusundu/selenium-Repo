package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableDemoFile {

	@Given("User should enters the username as")
	public void user_should_enters_the_username_as(DataTable data) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pas"));
		
		List<String> list = data.asList();
		int size = list.size();
		
		System.out.println(size);
		
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
			username.sendKeys(list.get(i));
			Thread.sleep(3000);
			username.clear();
		}
		
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

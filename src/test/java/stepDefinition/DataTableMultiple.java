package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableMultiple {
	@Given("User should enters the username as")
	public void user_should_enters_the_username_as(DataTable data) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pas"));
		
		List<List<String>> lists = data.asLists();
		List<String> list = lists.get(1);
		
		int count=1;
		for(String l:list)
		{
			if(count==1)
			{
				
			username.sendKeys(l);
			}
		if(count==2)
		{
			pwd.sendKeys(l);
		}
		count++;
		}
		
		
}
}
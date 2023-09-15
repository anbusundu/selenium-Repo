package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\D E L L\\eclipse-workspace\\Cucumber1\\src\\test\\resources\\Features\\OrangeDemoLogin.feature",
		glue="stepDefinition",
		publish=true,
		plugin= {"pretty", "html:target/output.html",
				"junit:target/output.xml",
				"json:target/output.json"},
		monochrome=true
		)
public class TestRunner {

}

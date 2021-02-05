package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vijitha\\eclipse-workspace\\com.vogella.maven.eclipse\\src\\test\\resource\\AppFeatures\\Uber.feature",
						
		glue = {"stepdefinitions"} , 
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml" },
		publish = true
					
)

public class UberTest {

}

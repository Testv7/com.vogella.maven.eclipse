package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vijitha\\eclipse-workspace\\com.vogella.maven.eclipse\\src\\test\\java\\AppFeatures\\SearchDemo.feature",
		glue = {"stepdefinitions"}
		
			
)
public class AmazonTestRunner {

}

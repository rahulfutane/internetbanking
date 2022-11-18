package runner_file;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Test_runner_file {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"C:\\Users\\Lenovo\\eclipse-workspace\\cucumber_last_ride\\src\\test\\resources\\feature\\home.feature"},
	glue = {"Step_last"},
	plugin = {"pretty","html:target/cucumber-html-report","html:target/cucumber-usage.json"},
	tags = "@Smoke",
	dryRun = false,
	monochrome = true)
	
	
	public class TestRunnerFile {

	}
}

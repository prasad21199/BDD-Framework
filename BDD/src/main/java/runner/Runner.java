package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "featurefiles",
		glue={"stepdefinitions","hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"html:target/report.html","json:target/report.json"},
		tags="@myntra"
		)
public class Runner extends AbstractTestNGCucumberTests{

}
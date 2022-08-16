package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		         features = "src/main/java/feature/Myntra.feature",
                 glue = "stepDefinition",
                 monochrome = true,
                 publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}

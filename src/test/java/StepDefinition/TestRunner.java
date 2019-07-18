package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/org/samplecucumber/AddTarrifPlan.feature",strict=true,dryRun=false,glue="StepDefinition",monochrome=true,plugin="html:target")
public class TestRunner {

}




package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E://Guru99CucumberProlect//Features//Login.feature"},
glue= {"stepDefination"},
tags= {"@smoke"},
monochrome=true,
dryRun=true,
plugin= {"pretty","html:test-output"})
public class TestRunner {
	

}

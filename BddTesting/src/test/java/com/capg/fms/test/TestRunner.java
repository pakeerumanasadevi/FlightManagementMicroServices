package com.capg.fms.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = { "classpath:features" }, plugin = { "pretty", "json:target/cucumber/cucumber.json" })
@CucumberOptions(features = "features", glue = "com.capg.fms.stepDefinition", plugin = { "pretty",
		"json:target/cucumber/cucumber.json" })
/*
  @CucumberOptions( features = "src/test/resources/functionalTests", glue=
 * {"stepDefinitions"} )
 */

public class TestRunner {
}

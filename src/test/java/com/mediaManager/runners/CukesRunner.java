package com.mediaManager.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
        glue = "com/mediaManager/step_definitions",
        features = "src/test/resources/features",
        publish = true,
        tags = "@Home",
        dryRun =false


)
public class CukesRunner {

}
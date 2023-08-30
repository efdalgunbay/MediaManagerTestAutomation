package com.mediaManager.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/CucumberTestReport.json",
                "html:target/CucumberTestReport.html"},
        glue = "com/mediaManager/step_definitions",
        features = "src/test/resources/features",
        publish = true,
        tags = "@Home",
        dryRun =false


)
public class CukesRunner {

}
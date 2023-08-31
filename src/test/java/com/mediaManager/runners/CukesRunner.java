package com.mediaManager.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = "com/mediaManager/step_definitions",
        features = "src/test/resources/Features",
        publish = true,
        tags = "@Reg",
        dryRun =false


)
public class CukesRunner {

}
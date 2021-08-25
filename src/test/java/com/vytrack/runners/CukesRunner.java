package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports",
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags ="@wip"
       // tags ={"@driver","@VYT-123"} old syntax and syntax
       // tags = "@driver or @store_manager"
        // tags = {"@driver,@store_manager"} old syntax2 for or syntax
       // tags = "login and not @wip and not @sales_manager" exclued (skip) the this test scenerio
        //tags = {"@login","~wip"} old syntax sometimes doesnt work




)
public class CukesRunner {



}

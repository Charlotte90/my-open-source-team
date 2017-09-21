package com.gold.app;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Danny on 29/04/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false 		//Does not run any code content in the step definition when it is true
        ,monochrome = true 	//Make text on the console readable
        ,plugin = {"pretty",
        "html:target/test-report/report-html",
        "json:target/test-report/report-json.json",
        "junit:target/test-report/report-xml.xml"}      //Report Template
        ,strict = false		 										//Skip execution of pending and undefined pages if true
        ,features = {"src/test/resources"}		//Packages where the feature files are located
        ,snippets = SnippetType.CAMELCASE		//Used to determine what the method of the Step Def would be
//        ,glue = {"com.asos.portal.steps"}  			//Package with Step Definitions and hooks
        ,tags = {"@wip"}
)
public class RunnerCukesTest {

}

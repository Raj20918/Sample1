package com.runnerclass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\new\\Sample_Cucumber\\src\\test\\java\\com\\features\\Sample.feature",glue = "com.stepdefinition",dryRun = false)
public class Runnerclass {
}

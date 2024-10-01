package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resource/com/Features", glue = { "com.stepsDefinitions" })
public class RunnerTestNG extends AbstractTestNGCucumberTests {
  
}

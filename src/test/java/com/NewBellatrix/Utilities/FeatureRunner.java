package com.NewBellatrix.Utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/", glue = "com.NewBellatrix.StepDefinations")
public class FeatureRunner extends AbstractTestNGCucumberTests {

}

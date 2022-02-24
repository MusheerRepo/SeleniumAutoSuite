package RunnerFiles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Framework.Setup;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		  features="src/test/resources/FeatureFiles",
		  glue={"StepDefinitions"},
		  plugin={"pretty", "html:target/Reportd.html"},
		  monochrome=true)
public class RunnerFile extends AbstractTestNGCucumberTests
{                                   

}

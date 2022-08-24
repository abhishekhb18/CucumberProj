package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

/*@CucumberOptions(features="src/test/java/feature/login1.feature",
        glue={"stepDefinitions"}
        ) This is for login1 feature*/

/*@CucumberOptions(features="src/test/java/feature/loginWithParamInFeatFile.feature",
glue={"stepDefinitions"}
)this is for login by passing parameters from feature file */

/*@CucumberOptions(features="src/test/java/feature/loginNlogoutScenarios.feature",
glue={"stepDefinitions"}
)*//*this is for login and logout*/
/*@CucumberOptions(features="src/test/java/feature/loginwWithParamFromDataTable.feature",
glue={"stepDefinitions"}
)this is for ParamFromDataTable*/
/*@CucumberOptions(features="src/test/java/feature/loginWithDiffScenarios.feature",
glue={"stepDefinitions"}
)*/
/*@CucumberOptions(features="src/test/java/feature/TagsExample.feature",
glue={"stepDefinitions"}, tags= "@WomenPage or @DressesPage"
)*/
/*@CucumberOptions(features="src/test/java/feature/TagsExample.feature",
glue={"stepDefinitions"}, tags= "@WomenPage and @RegressionSuite"
)*/

/*@CucumberOptions(features="src/test/java/feature/TagsExample.feature",
glue={"stepDefinitions"}, tags= "not @DressesPage"
)*/
/*@CucumberOptions(features="src/test/java/feature/ConditionalHooks.feature",
glue={"stepDefinitions"}, tags= ""
)*/
/*@CucumberOptions(features="src/test/java/feature/BackgroundExample.feature",
glue={"stepDefinitions"},
plugin={"pretty","html:target/cucumber-report/cucumber.html", 
		"json:target/cucumber-report/cucumber.json",
		"junit:target/cucumber-report/cucumber.xml",
         "junit:target/cucumber-report/cucumber.xml"},
monochrome=true,tags= "@search"
//this is to save demonstrate  cucumber report save locally /disabled this to generate extent report
)*/
/*@CucumberOptions(features="src/test/java/feature/BackgroundExample.feature",
glue={"stepDefinitions"},
plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,tags= "@search"
//this to generate extent report
)*/

@CucumberOptions(features="src/test/java/feature/SwiggyProject.feature",
glue={"stepDefinitions"},
plugin={"pretty","html:target/cucumber-report/swigggyop.html", 
		"json:target/cucumber-report/swigggyop.json",
		"junit:target/cucumber-report/swigggyop.xml",
         },
monochrome=true,tags= ""
//this is to save demonstrate  cucumber report save locally /disabled this to generate extent report
)

public class TestRunner  {

}

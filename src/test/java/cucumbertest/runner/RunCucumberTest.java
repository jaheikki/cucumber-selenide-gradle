package cucumbertest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(dryRun=true)

@CucumberOptions(
        features = {"src/test/resources/acceptancetests/"},
        glue = {"teststepdefinitions"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
        //tags = {"simple_test"}

        )
public class RunCucumberTest {

}

package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Artem Peregut on 06.07.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"src/main/java/steps"}, features = "src/main/resources/tests")
public class Test {
}
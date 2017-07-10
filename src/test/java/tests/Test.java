package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Artem Peregut on 06.07.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = "steps", features = "src/test/resources/tests")
public class Test {
}
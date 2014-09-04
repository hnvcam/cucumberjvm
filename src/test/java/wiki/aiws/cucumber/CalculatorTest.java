package wiki.aiws.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by camhoang on 9/4/14.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:calculator.feature")
public class CalculatorTest {
}

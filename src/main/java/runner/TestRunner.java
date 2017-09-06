package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Класс для запуска тестов
 * Created by artem on 05.09.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/features"},
        glue = "steps")
public class TestRunner {

}

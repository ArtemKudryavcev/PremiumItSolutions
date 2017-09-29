package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverFactory;
import utils.AllureRuntime;

import java.io.IOException;

/**
 * Класс для настроек до/после запуска теста
 * Created by artem on 04.09.2017.
 */
public class Hook {
    @Before
    public void initializeTest() throws Exception {
        AllureRuntime.clearScreenshotList();
        DriverFactory.getObject();
    }

    @After
    public void teardownTest(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            Exception e = new Exception();
            AllureRuntime.error(e);
        }
        DriverFactory.quit();
    }
}
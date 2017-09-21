package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverFactory;

/**
 * Класс для настроек до/после запуска теста
 * Created by artem on 04.09.2017.
 */
public class Hook {
    @Before
    public void initializeTest() throws Exception {
        DriverFactory.getObject();
    }

    @After
    public void teardownTest() {
        DriverFactory.quit();
       // AllureRuntime.attachLog();
    }
}
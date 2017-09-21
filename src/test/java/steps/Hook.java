package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverFactory;

import java.io.IOException;

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
    public void teardownTest() throws IOException {
        DriverFactory.quit();
    }
}
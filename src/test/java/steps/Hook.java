package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Util;

/**
 * Класс для настроек до/после запуска теста
 * Created by artem on 04.09.2017.
 */
public class Hook extends Util {

    private Util util;

    public Hook(Util util) {
        this.util = util;
    }

    @Before
    public void initializeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Autotests\\PremiumItSolutions\\driver\\chromedriver.exe");
        util.webDriver = new ChromeDriver();
    }

    @After
    public void teardownTest(Scenario scenario) {
        if (!scenario.isFailed()) {
            util.webDriver.close();
            System.out.println("GOD!!!");
        }
    }
}

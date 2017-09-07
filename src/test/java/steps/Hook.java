package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import driver.DriverFactory;
/**
 * Класс для настроек до/после запуска теста
 * Created by artem on 04.09.2017.
 */
public class Hook extends DriverFactory {

    @Before
    public void initializeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Autotests\\PremiumItSolutions\\driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        WebDriverRunner.setWebDriver(webDriver);
    }

    @After
    public void teardownTest(Scenario scenario) {
        if (!scenario.isFailed()) {
            Selenide.close();
        }
    }
}
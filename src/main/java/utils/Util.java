package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

/**
 * Created by atriu on 04.09.2017.
 */
public class Util {
    protected static WebDriver webDriver;

    private void selenideSetup(WebDriver webDriver) {
        WebDriverRunner.setWebDriver(webDriver); // установка драйвера для селенида
        Configuration.timeout = 45000;        // установка тайм-аута для селенида
    }
}

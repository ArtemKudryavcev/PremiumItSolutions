package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.remote.BrowserType.*;

/**
 * Класс-фабрика для WebDriver
 * Created by artem on 04.09.2017.
 */
public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getObject() throws Exception {
        if (webDriver == null) {
            webDriver = DriverHelper.getBrowserCapabilities(CHROME);
            WebDriverRunner.setWebDriver(webDriver); // установка драйвера для селенида
            Configuration.timeout = 45000;           // установка тайм-аута для селенида
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    public static void quit() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}

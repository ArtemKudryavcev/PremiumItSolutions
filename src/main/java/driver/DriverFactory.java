package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

/**
 * Класс-фабрика для WebDriver
 * Created by artem on 04.09.2017.
 */
public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getObject() throws Exception {
        if (webDriver == null) {
            webDriver = DriverHelper.getBrowserCapabilities(DriverHelper.Drivers.WINDOWS_CHROME);
            WebDriverRunner.setWebDriver(webDriver); // установка драйвера для селенида
            Configuration.timeout = 20000;           // установка тайм-аута для селенида
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

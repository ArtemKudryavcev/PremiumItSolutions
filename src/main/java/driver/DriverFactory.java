package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by atriu on 04.09.2017.
 */
public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getObject() throws Exception {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
            webDriver = new ChromeDriver();
            WebDriverRunner.setWebDriver(webDriver); // установка драйвера для селенида
            Configuration.timeout = 45000;           // установка тайм-аута для селенида
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    public boolean isSingleton() {
        return true;
    }

    public static void quit() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}

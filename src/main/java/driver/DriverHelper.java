package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Util;

import static org.openqa.selenium.remote.BrowserType.*;

/**
 * Класс для работы с проеднастройками Webdriver-а
 * Created by artem on 04.10.2017.
 */
public class DriverHelper {

    public static WebDriver getBrowserCapabilities(String driverParameter) {
        DesiredCapabilities capabilities = null;
        if (driverParameter.equalsIgnoreCase(FIREFOX)) {
            capabilities = DesiredCapabilities.firefox();
            System.setProperty(Util.getRunConfigProperty("browser_firefox"), Util.getRunConfigProperty("browser_firefox_path"));
            return new FirefoxDriver();
        }
        if (driverParameter.equalsIgnoreCase(IE)) {
            capabilities = DesiredCapabilities.internetExplorer();
            System.setProperty(Util.getRunConfigProperty("browser_ie"), Util.getRunConfigProperty("browser_ie_path"));
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            return new InternetExplorerDriver();
        }
        if (driverParameter.equalsIgnoreCase(CHROME)) {
            capabilities = DesiredCapabilities.chrome();
            System.setProperty(Util.getRunConfigProperty("browser_chrome"), Util.getRunConfigProperty("browser_chrome_path"));
            return new ChromeDriver();
        }
        return null;
    }
}

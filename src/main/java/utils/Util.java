package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by artem on 11.09.2017.
 */
public class Util {

    private static By pageLoadingIndicatorElement = new By.ByXPath("//h1[@data-init='ajax-header']");

    //Метод для парсинга properties
    public static String getProperty(String key, String resourceFileName) {
        InputStream inputStream = Util.class.getClassLoader().getResourceAsStream(resourceFileName);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static String getRunConfigProperty(String key) {
        return getProperty(key, "config.properties");
    }

    public static void sendKeys(String keys, WebElement inputField) {
        $(inputField).val(keys);
    }

    public static void clickOnElement(WebElement element) {
        $(element).click();
    }

    public static void clickOnElement(By locator) { $(locator).click(); }

    public static void waitForPageToLoad() {
            Selenide.$(pageLoadingIndicatorElement).waitUntil(Condition.visible, 500);
    }

    public static void getWhenVisible() throws Exception {
        (new WebDriverWait(DriverFactory.getObject(), 10))
                .until(ExpectedConditions.visibilityOfElementLocated(pageLoadingIndicatorElement));
    }
}

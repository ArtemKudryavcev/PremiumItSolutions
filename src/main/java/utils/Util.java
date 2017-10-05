package utils;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by artem on 11.09.2017.
 */
public class Util {

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
        Selenide.$(inputField).val(keys);
    }

    public static void clickOnElement(WebElement element) {
        Selenide.$(element).click();
    }

}

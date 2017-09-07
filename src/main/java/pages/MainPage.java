package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
/**
 * Класс для главной страницы
 * Created by artem on 05.09.2017.
 */
public class MainPage extends DriverFactory {
    private WebDriver webDriver;

    public static final String MAINPAGE_URL = "http://www.mvideo.ru/";
    public static final String DEPARTAMENT_BEGIN_OF_XPATH = "(//nav[@class='header-nav']//*[text()='";

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}

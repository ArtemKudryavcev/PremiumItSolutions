package pages;

import org.openqa.selenium.WebDriver;

/**
 * Класс со страницей департамента
 * Created by artem on 07.09.2017.
 */
public class DepartmentPage extends AbstractPage {
    private WebDriver webDriver;

    public DepartmentPage(WebDriver webDriver) {
        super(webDriver);
    }
}

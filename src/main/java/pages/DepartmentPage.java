package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс со страницей департамента
 * Created by artem on 07.09.2017.
 */
public class DepartmentPage extends AbstractPage {

    public DepartmentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}

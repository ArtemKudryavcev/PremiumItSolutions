package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Страница сравнения товаров
 * Created by artem on 26.09.2017.
 */
public class ComparisonPage extends AbstractPage {

    public ComparisonPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}

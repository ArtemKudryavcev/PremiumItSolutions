package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Страница субкатегории
 * Created by artem on 11.10.2017.
 */
public class SubcategoryPage extends AbstractPage {

    public SubcategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}

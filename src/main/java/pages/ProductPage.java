package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Util;

/**
 * Страница товара
 * Created by artem on 26.09.2017.
 */
public class ProductPage extends AbstractPage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "c-pdp-compare")
    private WebElement checkboxCompare;

    public void addElementToComparison() throws Exception {
        Util.clickOnElement(checkboxCompare);
    }
}

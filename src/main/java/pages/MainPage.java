package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Util;
import java.util.List;

/**
 * Класс для главной страницы
 * Created by artem on 05.09.2017.
 */

public class MainPage extends AbstractPage {

    @FindBy(className = "header-nav-item-link")
    private List<WebElement> departments;

    @FindBy(xpath = "(//a[@class='comparelist-link'])[last()]")
    private WebElement iconCompareList;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public DepartmentPage clickOnDepartment(String department) {
        Selenide.$$(departments).filter(Condition.text(department)).first().click();
        return new DepartmentPage(webDriver);
    }

    public ComparisonPage navigateToComparisonPage() throws Exception {
        Util.clickOnElement(iconCompareList);
        return new ComparisonPage(DriverFactory.getObject());
    }
}

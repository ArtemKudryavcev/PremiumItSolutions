package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import driver.DriverFactory;
import org.openqa.selenium.By;
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

    private final String SUBCATEGORY_XPATH = "//ul[contains(@class,'sel-navigation')]/li[contains(@class,'active')]//li[contains(@class,'header-nav-drop-down-column')][.//*[contains(text(),'%s')]]//li[@class='header-nav-drop-down-list-item']//a[contains(text(),'%s')]";

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

    public SubcategoryPage navigateToSubcategory(String department, String category, String subcategory) throws Exception {
        Selenide.$$(departments).filter(Condition.text(department)).first().hover();
        By subCategoryByXPath = new By.ByXPath(String.format(SUBCATEGORY_XPATH, category, subcategory));
        Util.clickOnElement(subCategoryByXPath);
        return new SubcategoryPage(DriverFactory.getObject());
    }
}

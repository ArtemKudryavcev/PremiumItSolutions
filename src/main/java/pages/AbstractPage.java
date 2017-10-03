package pages;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.И;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Util;

/**
 * Created by artem on 08.09.2017.
 */
public abstract class AbstractPage {
    protected WebDriver webDriver;

    //Поле поиска
    @FindBy(css = "input.sel-field-search,.header-search-input")
    private WebElement fieldSearch;

    //Значек лупы для поля поиска
    @FindBy(css = ".header-search-btn")
    private WebElement buttonSearch;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @Step
    public AbstractPage navigateToMainPage() {
        Selenide.open(Util.getRunConfigProperty("main_url"));
        Selenide.refresh();
        return this;
    }

    @Step
    public AbstractPage search(String searchText) {
        Selenide.switchTo().parentFrame();
        Util.sendKeys(searchText, fieldSearch);
        Util.clickOnElement(buttonSearch);
        return this;
    }

    @И("^подождать (\\d+) секунд[ы]?$")
    public AbstractPage waitFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
        return this;
    }
}

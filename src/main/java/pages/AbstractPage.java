package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Util;

/**
 * Created by artem on 08.09.2017.
 */
public abstract class AbstractPage {
    protected WebDriver webDriver;

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
}

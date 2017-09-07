package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;

/**
 * Created by atriu on 08.09.2017.
 */
public abstract class AbstractPage {
    protected WebDriver webDriver;
    private MainPage mainPage;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage navigateToMainPage() {
        Selenide.open(mainPage.MAINPAGE_URL);
        webDriver.manage().window().maximize();
        webDriver.navigate().refresh();
        return new MainPage(webDriver);
    }
}

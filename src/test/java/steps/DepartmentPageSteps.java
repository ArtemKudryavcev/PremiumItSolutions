package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.То;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import utils.AllureRuntime;

/**
 * Класс с описанием шагов страницы DepartmentPage
 * Created by artem on 18.09.2017.
 */
public class DepartmentPageSteps {

    @FindBy(className = "header-nav-item-link2")
    private WebElement department;

    //метод, который точно упадет
    @Step
    @То("^страница департамента отображается$")
    public void shouldSeeTheUserformPage() throws Throwable {

        try{
            Selenide.$(department).click();
        } catch (Exception e) {
            AllureRuntime.error(e);
        }
    }
}

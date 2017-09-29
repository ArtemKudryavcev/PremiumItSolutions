package steps;

import cucumber.api.java.ru.То;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Класс с описанием шагов страницы DepartmentPage
 * Created by artem on 18.09.2017.
 */
public class DepartmentPageSteps {

    @Step
    @То("^страница департамента отображается$")
    public void shouldSeeTheUserformPage() throws Throwable {
        System.out.println("Страница департамента");
    }
}

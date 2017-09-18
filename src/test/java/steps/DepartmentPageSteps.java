package steps;

import cucumber.api.java.en.Then;
import pages.DepartmentPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Класс с описанием шагов страницы DepartmentPage
 * Created by artem on 18.09.2017.
 */
public class DepartmentPageSteps {

    private DepartmentPage departmentPage;

    @Step
    @Then("^department page is displayed$")
    public void shouldSeeTheUserformPage() throws Throwable {
        //System.out.println("GOOD!!!");
        int divisionByZero = 2 / 0;
        System.out.println(divisionByZero);
    }

}

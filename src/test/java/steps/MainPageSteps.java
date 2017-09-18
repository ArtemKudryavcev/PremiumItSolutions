package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import driver.DriverFactory;
import pages.MainPage;
/**
 * Класс с описанием шагов страницы MainPage
 * Created by artem on 04.09.2017.
 */
public class MainPageSteps {

    private MainPage mainPage;

    @Given("^navigate to main page$")
    public void navigateToMainPage() throws Throwable {
        mainPage = new MainPage(DriverFactory.getObject());
        mainPage.navigateToMainPage();
    }

    @And("^click on department (.*)$")
    public void clickOnDepartment(String department) throws Throwable {
        mainPage.clickOnDepartment(department);
    }
}

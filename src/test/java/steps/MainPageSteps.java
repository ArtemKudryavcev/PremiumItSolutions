package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.*;
import driver.DriverFactory;
import pages.MainPage;
/**
 * Класс с описанием шагов
 * Created by artem on 04.09.2017.
 */
public class MainPageSteps extends DriverFactory {

    private MainPage mainPage;

    @Given("^navigate to the main page$")
    public void navigateToTheLoginPage() throws Throwable {
        Selenide.open(mainPage.MAINPAGE_URL);
        webDriver.manage().window().maximize();
        webDriver.navigate().refresh();
    }

    @And("^click on department (.*)$")
    public void clickOnDepartment(String department) throws Throwable {
        Selenide.$x(mainPage.DEPARTAMENT_BEGIN_OF_XPATH + department + "'])[last()]").click();
    }

    @Then("^should see the department page$")
    public void shouldSeeTheUserformPage() throws Throwable {
        System.out.println("GOOD!!!");
    }
}

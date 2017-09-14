package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
/**
 * Класс с описанием шагов
 * Created by artem on 04.09.2017.
 */
//todo не надо наследоваться. подумай, где хранить инстанс драйвера, как можно передавать драйвер в степдеф классы.
public class MainPageSteps {

    private MainPage mainPage;
    private WebDriver webDriver;

    @Given("^navigate to main page$")
    public void navigateToMainPage() throws Throwable {
        mainPage = new MainPage(webDriver);
        mainPage.navigateToMainPage();
    }

    @And("^click on department (.*)$")
    public void clickOnDepartment(String department) throws Throwable {
        mainPage.clickOnDepartment(department);
    }

    @Then("^should see the department page$")
    public void shouldSeeTheUserformPage() throws Throwable {
        System.out.println("GOOD!!!");
    }
}

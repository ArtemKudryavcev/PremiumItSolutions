package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import utils.Util;

/**
 * Created by artem on 04.09.2017.
 */
public class MainPageSteps extends Util{

    private Util util;

    public MainPageSteps(Util util) {
        this.util = util;
    }

    @Given("^navigate to the main page$")
    public void navigateToTheLoginPage() throws Throwable {
        webDriver.navigate().to("http://www.mvideo.ru/");
        //Selenide.open("http://www.mvideo.ru/");
        webDriver.manage().window().maximize();
        webDriver.navigate().refresh();
    }

    @And("^click on department (.*)$")
    public void clickOnDepartmentDepartment(String department) throws Throwable {
        webDriver.findElement(new By.ByXPath("(//nav[@class='header-nav']//*[text()='" + department + "'])[last()]")).click();
    }

    @Then("^should see the department page$")
    public void shouldSeeTheUserformPage() throws Throwable {
    }
}

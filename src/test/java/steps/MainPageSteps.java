package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import driver.DriverFactory;
import pages.MainPage;

/**
 * Класс с описанием шагов страницы MainPage
 * Created by artem on 04.09.2017.
 */
public class MainPageSteps {

    private MainPage mainPage;

    @Дано("^перейти на главную страницу$")
    public void navigateToMainPage() throws Throwable {
        mainPage = new MainPage(DriverFactory.getObject());
        mainPage.navigateToMainPage();
    }

    @И("^нажать на департамент (.*)$")
    public void clickOnDepartment(String department) throws Throwable {
        mainPage.clickOnDepartment(department);
    }

    @И("^выполнить поиск в хедере с запросом (.*)$")
    public void searchBySku(String sku) throws Exception {
        mainPage.search(sku);
    }

    @И("^перейти на страницу Сравнения товаров$")
    public void navigateToComparisonPage() throws Exception {
        mainPage.navigateToComparisonPage();
    }
}

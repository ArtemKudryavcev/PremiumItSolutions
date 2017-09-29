package steps;

import cucumber.api.java.ru.И;
import driver.DriverFactory;
import pages.ProductPage;

/**
 * Класс с описанием шагов страницы ProductPage
 * Created by artem on 26.09.2017.
 */
public class ProductPageSteps {

    private ProductPage productPage;

    @И("^добавить элемент в сравнение$")
    public void addElementToComparison() throws Exception {
        productPage = new ProductPage(DriverFactory.getObject());
        productPage.addElementToComparison();
    }
}

package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.И;
import pages.SubcategoryPage;
import utils.Util;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Класс с описанием шагов страницы SubcategoryPage
 * Created by artem on 11.10.2017.
 */
public class SubcategoryPageSteps {

    private final String CHECKBOX_UNCHECKED = ".input-checkbox:not(:checked)~.label-checkbox";

    private SubcategoryPage subcategoryPage;

    @И("^выбрать фасет (.*)$")
    public void selectFacetByName(String facetName) throws Exception {
        SelenideElement deselectedCheckbox = getCheckboxByXPathWithName(facetName);
        Util.clickOnElement(deselectedCheckbox);
        Util.getWhenVisible();
        deselectedCheckbox.shouldBe(Condition.present);
    }

    private SelenideElement getCheckboxByXPathWithName(String name) {
        Util.waitForPageToLoad();
        SelenideElement checkBox = $$(CHECKBOX_UNCHECKED).filter(Condition.visible)
                    .find(text(name));
        return checkBox;
    }
}

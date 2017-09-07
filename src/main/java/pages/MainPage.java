package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
/**
 * Класс для главной страницы
 * Created by artem on 05.09.2017.
 */
public class MainPage extends AbstractPage {

    public static final String MAINPAGE_URL = "http://www.mvideo.ru/";
    public static final String DEPARTAMENT_BEGIN_OF_XPATH = "(//nav[@class='header-nav']//*[text()='";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    //клик на департамент
    public DepartmentPage clickOnDepartment(String department)
    {
        Selenide.$x(DEPARTAMENT_BEGIN_OF_XPATH + department + "'])[last()]").click();
        return new DepartmentPage(webDriver);
    }
}

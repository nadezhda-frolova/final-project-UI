package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;

public class FooterExistsOnVacanciesPageTest extends TestBase {
    @Epic("Main Page")
    @Owner(value = "Frolova Nadezhda")
    @Severity(SeverityLevel.CRITICAL)
    @ValueSource(
            strings = {"Аналитик", "QA"}
    )
    @ParameterizedTest(name = "при переходе на страницу поиска вакансии {0} отображается футер")
    void footerIsVisible(String vacancies) {
        step("На главной странице в поле поиска написать вакансию " + vacancies + ", нажать Enter", () ->
                mainPage.searchVacancy(vacancies));
        step("На странице с вакансиями отображен футер", () ->
                resultsPage.checkFooterIsVisible());
    }
}


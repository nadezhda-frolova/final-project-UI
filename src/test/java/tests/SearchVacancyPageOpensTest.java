package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static io.qameta.allure.Allure.step;

public class SearchVacancyPageOpensTest extends TestBase {
    @Epic("Main Page")
    @Owner(value = "Frolova Nadezhda")
    @Severity(SeverityLevel.CRITICAL)
    @ValueSource(
            strings = {"Аналитик", "Разработчик", "QA"}
    )

    @ParameterizedTest(name = "При переходе на страницу поиска вакансии {0} в поле поиска отображается вакансия {0}")
    void searchVacancy(String vacancies) {
        step("На главной странице в поле поиска написать вакансию" + ", нажать Enter", () ->
                mainPage.searchVacancy(vacancies));
        step("Переход на страницу с вакансией, указанной в поисковой строке", () ->
                resultsPage.verifySearchFieldResult(vacancies));
    }
}

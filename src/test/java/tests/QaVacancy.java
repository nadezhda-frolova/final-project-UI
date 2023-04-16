package tests;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class QaVacancy extends TestBase {
    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void VacancySearch() {
        step("На главной странице в поле поиска написать 'QA', нажать Enter", () ->
                mainPage.setValueQA());
        step("Переход на страницу с вакансиями QA", () ->
                resultsPage.qaVacanciesFound());
    }
}


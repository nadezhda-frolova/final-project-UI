package tests;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class MainPageClickSearchButton extends TestBase {
    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void mainPageClickSearchButton() {
        step("Нажать на кнопку 'Найти работу'", () ->
                mainPage.clickSearchButton());
        step("Переход на страницу с вакансиями", () ->
                resultsPage.resultsFound());

    }
}

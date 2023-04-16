package tests;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class FooterExists extends TestBase {

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();
    @Test
    void footerIsVisible() {
        step("На главной странице кликнуть на кнопку 'Готовое резюме'", () ->
                mainPage.footerIsVisible());
        step("Переход на страницу консультации экспертов", () ->
                resultsPage.footerIsVisible());
    }
}


package tests;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class FooterExists extends TestBase {

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    //@Test
    //void footerIsVisible() {
    //step("На главной странице Нажать на кнопку 'Найти работу'", () ->
    // mainPage.footerIsVisible());
    //step("На странице с вакансиями отображен футер", () ->
    //resultsPage.footerIsVisible());
    //}
    @ValueSource(
            strings = {"Аналитик","QA" }
    )
    @ParameterizedTest (name="при переходе на страницу поиска вакансии {0} отображается футер")
    void footerIsVisible(String vacancies) {
        step("На главной странице в поле поиска написать вакансию " + vacancies +", нажать Enter", () ->
                mainPage.footerIsVisible(vacancies));
        step("На странице с вакансиями отображен футер", () ->
                resultsPage.footerIsVisible());
    }
}


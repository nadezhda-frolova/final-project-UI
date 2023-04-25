package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ResultsPage {
    public ResultsPage checkResultsFound() {
        $("[data-qa=bloko-header-3]").shouldHave(text("Найдено"));
        return this;
    }

    public ResultsPage verifySearchFieldResult(String vacancies) {
        $(".bloko-input-text-wrapper_icon-right").$("[value=vacancies]");
        return this;
    }

    public ResultsPage checkLoginButton() {
        $("[data-qa=login]").shouldHave(text("Войти"));
        return this;
    }

    public ResultsPage checkRegistrationPageOpens() {
        $("[data-qa=signup]").shouldHave(text("Создать резюме"));
        return this;
        //data-qa="signup"
        //Создать резюме
    }

    public ResultsPage checkExpertResumePageOpened() {
        $(".Hk5ajsi___promo-button-container").shouldHave(text("Какие задачи поможет решить эксперт?"));
        return this;
    }

    public ResultsPage checkFooterIsVisible() {
        $("[data-qa=footer]").shouldBe(visible);
        return this;
    }
}

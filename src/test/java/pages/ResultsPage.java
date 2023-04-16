package pages;

import com.codeborne.selenide.conditions.Visible;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ResultsPage {
    public ResultsPage resultsFound() {
        $("[data-qa=bloko-header-3]").shouldHave(text("Найдено"));
        return this;
    }

    public ResultsPage qaVacanciesFound() {
        $("[data-qa=wizard-search-name]").shouldHave(text("QA"));
        return this;
    }

    public ResultsPage loginButtonExists() {
        $("[data-qa=login]").shouldHave(text("Войти"));
        return this;
    }

    public ResultsPage registrationPageOpened() {
        $("[data-qa=bloko-header-1]").shouldHave(text("Регистрация соискателя"));
        return this;
    }

    public ResultsPage helpOfExpertsPageOpened() {
        $(".Hk5ajsi___promo-button-container").shouldHave(text("Какие задачи поможет решить эксперт?"));
        return this;
    }
    public ResultsPage footerIsVisible() {
        $("[data-qa=footer]").shouldBe(visible);
        return this;
    }
}

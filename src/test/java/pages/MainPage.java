package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public MainPage clickSearchButton() {
        $("[data-qa=search-button]").click();
        return this;
    }

    public MainPage searchVacancy(String vacancies) {
        $("#a11y-search-input").setValue(vacancies).pressEnter();
        return this;
    }

    public MainPage createResume() {
        $("[data-qa=signup]").shouldHave(text("Создать резюме")).click();
        return this;
    }

    public MainPage clickExpertResumeButton() {

        $("[data-qa=mainmenu_expertresume]").click();
        return this;
    }
}



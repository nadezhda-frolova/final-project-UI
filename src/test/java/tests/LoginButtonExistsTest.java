package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class LoginButtonExistsTest extends TestBase {

    @Epic("Main Page")
    @Owner(value = "Frolova Nadezhda")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка наличия кнопки 'Войти' на главной странице")
    @Test
    void loginButtonExists() {
        step("На главной странице есть кнопка 'Войти'", () ->
                resultsPage.checkLoginButton());
    }
}


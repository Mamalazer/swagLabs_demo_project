package swaglabs.test;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.BLOCKER;

@Feature("SwagLabs")
@Story("Login")
public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Успешный логин")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test01() {
        Selenide.open("/");
    }
}

package swaglabs.test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static swaglabs.data.Users.locked_user;
import static swaglabs.data.Users.standart_user;
import static swaglabs.pages.LoginPage.openLoginPage;

@Feature("SwagLabs")
@Story("Авторизация")
public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Успешный логин и Logout")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test01() {
        openLoginPage()
                .successAuth(standart_user)
                .openSidebarMenu()
                .logOut();
    }

    @Test
    @DisplayName("Неуспешный логин")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test02() {
        openLoginPage()
                .failedAuth(locked_user);
    }
}

package swaglabs.test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import swaglabs.pages.MainPage;

import java.util.Collections;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static swaglabs.data.Items.fleece_jacket;
import static swaglabs.data.Users.standart_user;
import static swaglabs.pages.LoginPage.openLoginPage;

@Feature("SwagLabs")
@Story("Оплата заказа")
public class PaymentTest extends BaseTest {

    @BeforeEach
    public void auth() {
        openLoginPage()
                .successAuth(standart_user);
    }

    @Test
    @DisplayName("Оплата заказа")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test01() {
        new MainPage()
                .addItemToBasket(fleece_jacket)
                .openBasket()
                .checkItemsAtBasket(Collections.singletonList(fleece_jacket))
                .goToCheckout()
                .fillUserinfo(standart_user)
                .submitUserInfo()
                .checkItemsAtCheckout(Collections.singletonList(fleece_jacket))
                .checkTotalSum("53.99")
                .submitPurchase();
    }
}

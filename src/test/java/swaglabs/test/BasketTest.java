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
import static swaglabs.data.Items.backpack;
import static swaglabs.data.Items.bike_light;
import static swaglabs.data.Users.standart_user;
import static swaglabs.pages.LoginPage.openLoginPage;

@Feature("SwagLabs")
@Story("Корзина")
public class BasketTest extends BaseTest {

    @BeforeEach
    public void auth() {
        openLoginPage()
                .successAuth(standart_user);
    }

    @Test
    @DisplayName("Добавление товара в корзину из карточки товара и удаление из корзины")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test01() {
        new MainPage()
                .openItemPage(backpack)
                .checkItemName(backpack)
                .addItemToBasket()
                .openBasket()
                .checkItemsAtBasket(Collections.singletonList(backpack))
                .removeItemFromBasket(backpack)
                .checkThatItemIsAbsent(backpack);
    }

    @Test
    @DisplayName("Добавление товара в корзину с главной страницы и удаление")
    @Owner("d.kuznetsov")
    @Severity(BLOCKER)
    public void test02() {
        new MainPage()
                .addItemToBasket(bike_light)
                .openBasket()
                .checkItemsAtBasket(Collections.singletonList(bike_light))
                .openSidebarMenu()
                .openMainPage()
                .removeItemFromBasket(bike_light)
                .openBasket()
                .checkThatItemIsAbsent(bike_light);
    }
}

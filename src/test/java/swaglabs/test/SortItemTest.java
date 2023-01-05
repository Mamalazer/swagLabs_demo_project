package swaglabs.test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import swaglabs.pages.MainPage;
import swaglabs.pages.MainPage.SortOption;

import static io.qameta.allure.SeverityLevel.NORMAL;
import static swaglabs.data.Users.standart_user;
import static swaglabs.pages.LoginPage.openLoginPage;

@Feature("SwagLabs")
@Story("Сортировка товаров")
public class SortItemTest extends BaseTest{

    @BeforeEach
    public void auth() {
        openLoginPage()
                .successAuth(standart_user);
    }

    @Test
    @DisplayName("Сортировка товаров в алфавитном порядке")
    @Owner("d.kuznetsov")
    @Severity(NORMAL)
    public void test01() {
        new MainPage()
                .setSortOption(SortOption.ALPHABETICAL)
                .checkAlphabeticalSort();
    }

    @Test
    @DisplayName("Сортировка товаров в обратном алфавитном порядке")
    @Owner("d.kuznetsov")
    @Severity(NORMAL)
    public void test02() {
        new MainPage()
                .setSortOption(SortOption.REVERSE_ALPHABETICAL)
                .checkReverseAlphabeticalSort();
    }

    @Test
    @DisplayName("Сортировка товаров по цене(от меньшего к большему)")
    @Owner("d.kuznetsov")
    @Severity(NORMAL)
    public void test03() {
        new MainPage()
                .setSortOption(SortOption.LOW_TO_HIGH_PRICE)
                .checkPriceSort();
    }

    @Test
    @DisplayName("Сортировка товаров по цене(от большему к меньшему)")
    @Owner("d.kuznetsov")
    @Severity(NORMAL)
    public void test04() {
        new MainPage()
                .setSortOption(SortOption.HIGH_TO_LOW_PRICE)
                .checkReversePriceSort();
    }
}

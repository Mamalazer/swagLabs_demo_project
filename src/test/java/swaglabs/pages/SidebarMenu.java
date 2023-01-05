package swaglabs.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SidebarMenu {

    private final String allItemsLink = "#inventory_sidebar_link";
    private final String aboutLink = "#about_sidebar_link";
    private final String logOutLink = "#logout_sidebar_link";
    private final String resetAppStateLink = "#reset_sidebar_link";

    public SidebarMenu() {
        $(allItemsLink).shouldBe(visible);
        $(aboutLink).shouldBe(visible);
        $(logOutLink).shouldBe(visible);
        $(resetAppStateLink).shouldBe(visible);
    }

    public LoginPage logOut() {
        $(logOutLink).click();
        return new LoginPage();
    }
}

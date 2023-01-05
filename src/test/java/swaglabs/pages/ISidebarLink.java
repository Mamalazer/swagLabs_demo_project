package swaglabs.pages;

import static com.codeborne.selenide.Selenide.$;

public interface ISidebarLink {

    default SidebarMenu openSidebarMenu() {
        $("#react-burger-menu-btn").click();
        return new SidebarMenu();
    }
}

package com.wicketproject.pages.tests;

import com.wicketproject.BasePage;
import com.wicketproject.MenuItemEnum;

public class TestsPage extends BasePage {

    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.TESTS;
    }
}

package com.wicketproject.pages;

import com.wicketproject.BasePage;
import com.wicketproject.MenuItemEnum;

public class HomePage extends BasePage {

    public HomePage() {

    }

    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.NONE;
    }
}

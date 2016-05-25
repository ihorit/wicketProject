package com.wicketproject;

import org.apache.wicket.markup.html.WebPage;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.aboutus.OurSkillsPage;
import com.wicketproject.pages.aboutus.TeamPage;
import com.wicketproject.pages.clients.ClientsPage;
import com.wicketproject.pages.login.LoginPage;
import com.wicketproject.pages.products.ProductOnePage;
import com.wicketproject.pages.products.ProductTwoPage;

public abstract class BasePage extends WebPage {

    public BasePage() {
    add(new TwitterBootstrapNavBarPanel.Builder("navBar", HomePage.class, "Tests app", getActiveMenu())
            .withMenuItem(MenuItemEnum.CLIENTS, ClientsPage.class)
            .withMenuItemAsDropdown(MenuItemEnum.PRODUCTS, ProductOnePage.class, "Product One")
            .withMenuItemAsDropdown(MenuItemEnum.PRODUCTS, ProductTwoPage.class, "Product Two")
            .withMenuItemAsDropdown(MenuItemEnum.PRODUCTS, ProductTwoPage.class, "Product Three")
            .withMenuItemAsDropdown(MenuItemEnum.ABOUT_US, TeamPage.class, "Team")
            .withMenuItemAsDropdown(MenuItemEnum.ABOUT_US, OurSkillsPage.class, "Our Skills")
            .withMenuItem(MenuItemEnum.LOGIN, LoginPage.class)
            .build());
    }

    public abstract MenuItemEnum getActiveMenu();
    
}

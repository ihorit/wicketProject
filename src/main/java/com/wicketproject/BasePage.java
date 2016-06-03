package com.wicketproject;

import com.wicketproject.pages.admin.CreateUserPage;
import org.apache.wicket.markup.html.WebPage;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.aboutus.OurSkillsPage;
import com.wicketproject.pages.aboutus.TeamPage;
import com.wicketproject.pages.admin.CreateTestPage;
import com.wicketproject.pages.admin.LoginCheck;
//import com.wicketproject.pages.admin.LoginPage;
import com.wicketproject.pages.products.ProductOnePage;
import com.wicketproject.pages.products.ProductTwoPage;

public abstract class BasePage extends WebPage {

    public BasePage() {
    add(new TwitterBootstrapNavBarPanel.Builder("navBar", HomePage.class, "Tests app", getActiveMenu())
            .withMenuItem(MenuItemEnum.HOME, HomePage.class)
            .withMenuItem(MenuItemEnum.CREATETEST, CreateTestPage.class)
            .withMenuItem(MenuItemEnum.CREATEUSER, CreateUserPage.class)
            .withMenuItemAsDropdown(MenuItemEnum.ABOUT_US, TeamPage.class, "Team")
            .withMenuItemAsDropdown(MenuItemEnum.ABOUT_US, OurSkillsPage.class, "Our Skills")
            .withMenuItem(MenuItemEnum.LOGIN, LoginCheck.class)
            .build());
    }

    public abstract MenuItemEnum getActiveMenu();
    
}

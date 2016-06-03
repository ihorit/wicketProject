package com.wicketproject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.aboutus.OurSkillsPage;
import com.wicketproject.pages.aboutus.TeamPage;
import com.wicketproject.pages.tests.TestsPage;
import com.wicketproject.pages.login.AdminTab;
import com.wicketproject.pages.login.LoginCheck;
//import com.wicketproject.pages.login.LoginPage;
import com.wicketproject.pages.products.ProductOnePage;
import com.wicketproject.pages.products.ProductThreePage;
import com.wicketproject.pages.products.ProductTwoPage;
import de.agilecoders.wicket.Bootstrap;
import de.agilecoders.wicket.settings.BootstrapSettings;

public class WicketApplication extends WebApplication {

    @Override
    public Class<? extends WebPage> getHomePage() {
        return AuthorizationPage.class;
    }

    @Override
    public void init() {
        mountPage("Test", TestsPage.class);
        mountPage("product-one", ProductOnePage.class);
        mountPage("product-two", ProductTwoPage.class);
        mountPage("product-three", ProductThreePage.class);
        mountPage("team", TeamPage.class);
        mountPage("skills", OurSkillsPage.class);
        mountPage("login", LoginCheck.class);
        mountPage("admintab", AdminTab.class);

        getMarkupSettings().setStripWicketTags(true);
        setExternalHtmlDirIfSystemPropertyIsPresent();
        
//        BootstrapSettings settings = new BootstrapSettings();
//        settings.minify(true); // use minimized version of all bootstrap references
//
//        Bootstrap.install(this, settings);
    }

    private void setExternalHtmlDirIfSystemPropertyIsPresent() {
        String externalDir = System.getProperty("wicket.html.dir");
        if (externalDir != null) {
            getResourceSettings().addResourceFolder(externalDir);
        }
    }
}

package com.wicketproject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import com.wicketproject.pages.aboutus.OurSkillsPage;
import com.wicketproject.pages.aboutus.TeamPage;
import com.wicketproject.pages.admin.CreateTestPage;
import com.wicketproject.pages.admin.AdminTab;
import com.wicketproject.pages.admin.LoginCheck;
//import com.wicketproject.pages.admin.LoginPage;
import com.wicketproject.pages.products.ProductOnePage;
import com.wicketproject.pages.products.ProductThreePage;
import com.wicketproject.pages.products.ProductTwoPage;

public class WicketApplication extends WebApplication {

    @Override
    public Class<? extends WebPage> getHomePage() {
        return AuthorizationPage.class;
    }

    @Override
    public void init() {
        mountPage("Test", CreateTestPage.class);
        mountPage("product-one", ProductOnePage.class);
        mountPage("product-two", ProductTwoPage.class);
        mountPage("product-three", ProductThreePage.class);
        mountPage("team", TeamPage.class);
        mountPage("skills", OurSkillsPage.class);
        mountPage("admin", LoginCheck.class);
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

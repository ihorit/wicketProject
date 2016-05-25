package com.wicketproject;

import org.apache.wicket.protocol.http.WebApplication;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.aboutus.OurSkillsPage;
import com.wicketproject.pages.aboutus.TeamPage;
import com.wicketproject.pages.clients.ClientsPage;
import com.wicketproject.pages.login.LoginPage;
import com.wicketproject.pages.products.ProductOnePage;
import com.wicketproject.pages.products.ProductThreePage;
import com.wicketproject.pages.products.ProductTwoPage;

public class WicketApplication extends WebApplication {

    @Override
    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    @Override
    public void init() {
        mountPage("clients", ClientsPage.class);
        mountPage("product-one", ProductOnePage.class);
        mountPage("product-two", ProductTwoPage.class);
        mountPage("product-three", ProductThreePage.class);
        mountPage("team", TeamPage.class);
        mountPage("skills", OurSkillsPage.class);
        mountPage("contact", LoginPage.class);

        getMarkupSettings().setStripWicketTags(true);
        setExternalHtmlDirIfSystemPropertyIsPresent();
    }

    private void setExternalHtmlDirIfSystemPropertyIsPresent() {
        String externalDir = System.getProperty("wicket.html.dir");
        if (externalDir != null) {
            getResourceSettings().addResourceFolder(externalDir);
        }
    }
}

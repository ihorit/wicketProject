package com.wicketproject.pages.admin;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by ihor on 6/2/2016.
 */
public class AdminMenu extends Panel {
    NestedLinkPanel panel1;
    NestedStaticTextPanel panel2 = new NestedStaticTextPanel("panel");

    public AdminMenu(String id) {
        super(id);
        final NestedStaticTextPanel panel;
        this.add(panel = new NestedStaticTextPanel("panel"));
        this.add(panel2 = new NestedStaticTextPanel("panel2"));

        Link homePageLink = new Link("home") {
            @Override
            public void onClick() {
                panel.setVisible(true);
                panel2.setVisible(false);
            }
        };
        this.add(homePageLink);
        Link reportPageLink = new Link("report") {
            @Override
            public void onClick() {
                panel.setVisible(false);
                panel2.setVisible(true);
            }
        };
        this.add(reportPageLink);


    }
}
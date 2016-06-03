package com.wicketproject.pages.admin;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by ihor on 6/2/2016.
 */
public class AdminMenu extends Panel {

    public AdminMenu(String id) {
        super(id);

        Link homePageLink = new Link("home") {
            @Override
            public void onClick() {

            }
        };
        this.add(homePageLink);
        Link reportPageLink = new Link("report") {
            @Override
            public void onClick() {

            }
        };
        this.add(reportPageLink);


    }
}
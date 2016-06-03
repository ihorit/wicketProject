package com.wicketproject.pages.admin;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by ihor on 5/31/2016.
 */
public class NestedLinkPanel extends Panel {

    public NestedLinkPanel(String name) {
        super(name);
        add(new ExternalLink("myLink", "http://google.com").add(new Label("label", "bar")));
        add(new Label("foo", "Hello, World!"));
    }
}


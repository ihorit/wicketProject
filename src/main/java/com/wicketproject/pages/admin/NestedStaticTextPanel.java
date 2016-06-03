package com.wicketproject.pages.admin;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by ihor on 6/2/2016.
 */
public class NestedStaticTextPanel extends Panel {
    public NestedStaticTextPanel(String name) {
        super(name);
        add(new Label("label", "bar"));
        add(new Label("foo", "Hello, World!"));
    }
}
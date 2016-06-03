package com.wicketproject;

public enum MenuItemEnum {
    
    TESTS("Tests"),
    PRODUCTS("Products"),
    ABOUT_US("About us"),
    LOGIN("Login"),
    ADMIN("Admin"),
    HOMESTUDENT("Homestudent"),
    NONE("");

    private String label;

    private MenuItemEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}

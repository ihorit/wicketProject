package com.wicketproject;

public enum MenuItemEnum {
    
    CREATETEST("Create Test"),
    CREATEUSER("Create User"),
    PRODUCTS("Products"),
    ABOUT_US("About us"),
    LOGIN("Login"),
    ADMIN("Admin"),
    HOMESTUDENT("Homestudent"),
    HOME("Home"),
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

package com.example.offerkhuji_v20;

public class MenuCategoryModel {

    private String menu_category_name;
    private String menu_category_motto;
    private int menu_category_image;

    // Constructor
    public MenuCategoryModel(String menu_category_name, String menu_category_motto, int menu_category_image) {
        this.menu_category_name = menu_category_name;
        this.menu_category_motto = menu_category_motto;
        this.menu_category_image = menu_category_image;
    }

    // Getter and Setter
    public String getMenu_category_name() {
        return menu_category_name;
    }

    public void setMenu_category_name(String menu_category_name) {
        this.menu_category_name = menu_category_name;
    }

    public String getMenu_category_motto() {
        return menu_category_motto;
    }

    public void setMenu_category_motto(String menu_category_motto) {
        this.menu_category_motto = menu_category_motto;
    }

    public int getMenu_category_image() {
        return menu_category_image;
    }

    public void setMenu_category_image(int menu_category_image) {
        this.menu_category_image = menu_category_image;
    }
}

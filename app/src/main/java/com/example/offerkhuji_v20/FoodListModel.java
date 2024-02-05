package com.example.offerkhuji_v20;

public class FoodListModel {

    private String food_name;
    private String food_type;
    private String food_rating;
    private String food_count;
    private String food_offer;
    private int food_image;

    // Constructor
    public FoodListModel(String food_name, String food_type,String food_rating,String food_count,String food_offer, int food_image) {
        this.food_name = food_name;
        this.food_type = food_type;
        this.food_rating = food_rating;
        this.food_count = food_count;
        this.food_offer = food_offer;
        this.food_image = food_image;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public String getFood_rating() {
        return food_rating;
    }

    public void setFood_rating(String food_rating) {
        this.food_rating = food_rating;
    }

    public String getFood_count() {
        return food_count;
    }

    public void setFood_count(String food_count) {
        this.food_count = food_count;
    }

    public String getFood_offer() {
        return food_offer;
    }

    public void setFood_offer(String food_offer) {
        this.food_offer = food_offer;
    }

    public int getFood_image() {
        return food_image;
    }

    public void setFood_image(int food_image) {
        this.food_image = food_image;
    }
}

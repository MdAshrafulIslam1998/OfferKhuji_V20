package com.example.offerkhuji_v20;

public class The_Slide_Items_Model_Class {

    private int slider_image_model;
    private String slider_name_model;
    private String slider_type_model;
    private String slider_rating_model;
    private String slider_count_model;
    private String slider_offer_model;


    public The_Slide_Items_Model_Class(int sliderimage, String slidername,String slidertype,String sliderrating,String slidercount,String slideroffer) {
        this.slider_image_model = sliderimage;
        this.slider_name_model = slidername;
        this.slider_type_model = slidertype;
        this.slider_rating_model= sliderrating;
        this.slider_count_model = slidercount;
        this.slider_offer_model = slideroffer;

    }

    public int getSlider_image_model() {
        return slider_image_model;
    }

    public void setSlider_image_model(int slider_image_model) {
        this.slider_image_model = slider_image_model;
    }

    public String getSlider_name_model() {
        return slider_name_model;
    }

    public void setSlider_name_model(String slider_name_model) {
        this.slider_name_model = slider_name_model;
    }

    public String getSlider_type_model() {
        return slider_type_model;
    }

    public void setSlider_type_model(String slider_type_model) {
        this.slider_type_model = slider_type_model;
    }

    public String getSlider_rating_model() {
        return slider_rating_model;
    }

    public void setSlider_rating_model(String slider_rating_model) {
        this.slider_rating_model = slider_rating_model;
    }

    public String getSlider_count_model() {
        return slider_count_model;
    }

    public void setSlider_count_model(String slider_count_model) {
        this.slider_count_model = slider_count_model;
    }

    public String getSlider_offer_model() {
        return slider_offer_model;
    }

    public void setSlider_offer_model(String slider_offer_model) {
        this.slider_offer_model = slider_offer_model;
    }
}

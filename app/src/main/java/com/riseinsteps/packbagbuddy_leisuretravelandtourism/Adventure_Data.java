package com.riseinsteps.packbagbuddy_leisuretravelandtourism;

import java.io.Serializable;
import java.util.List;

public class Adventure_Data implements Serializable {

    private String discount;
    private int image_id;
    private String title;
    private String time;
    private String amount;
    private String description;
    private List<Integer> photos;

    public Adventure_Data(String discount, int image_id, String title, String time, String amount,String description,List<Integer> photos) {
        this.discount = discount;
        this.image_id = image_id;
        this.title = title;
        this.time = time;
        this.amount = amount;
        this.description=description;
        this.photos=photos;
    }

    public String getDiscount() {
        return discount;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getPhotos() {
        return photos;
    }
}

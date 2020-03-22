package com.example.tourguide;

import android.util.Log;

public class Place {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String timings;
    private String price;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String description, String address, String phone, String timings,
                    String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.timings = timings;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getTimings() {
        return timings;
    }

    public String getCost() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice(){
        return getCost() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasTimings(){
        return getTimings() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getCost() + "\n" +
                getTimings()+ "\n" +
                getImageResourceId()
                ;

        return output;
    }
}

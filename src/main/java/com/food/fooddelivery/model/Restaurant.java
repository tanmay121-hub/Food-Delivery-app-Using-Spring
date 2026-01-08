package com.food.fooddelivery.model;

public class Restaurant {
    private long resId;
    private String name;
    private String location;
    private String address;
    private double ratings;

    public Restaurant() {}

    public Restaurant(long resId, String name, String location, String address, double ratings) {
        this.resId = resId;
        this.name = name;
        this.location = location;
        this.address = address;
        this.ratings = ratings;
    }

    public long getResId() { return resId; }
    public void setResId(long resId) { this.resId = resId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getRatings() { return ratings; }
    public void setRatings(double ratings) { this.ratings = ratings; }
}
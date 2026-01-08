package com.food.fooddelivery.model;

public class Inventory {
    private long itemId;
    private String itemName;
    private int stock;
    private String desc;
    private String image;

    public Inventory() {}

    public Inventory(long itemId, String itemName, int stock, String desc, String image) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stock = stock;
        this.desc = desc;
        this.image = image;
    }

    public long getItemId() { return itemId; }
    public void setItemId(long itemId) { this.itemId = itemId; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
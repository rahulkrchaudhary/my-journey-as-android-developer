package com.example.marketapp;

public class Item {
    int itemImg;
    String itemTitle;
    String itemDesc;

    public Item(int itemImg, String itemTitle, String itemDesc) {
        this.itemImg = itemImg;
        this.itemTitle = itemTitle;
        this.itemDesc = itemDesc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}

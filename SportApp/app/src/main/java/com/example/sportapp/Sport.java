package com.example.sportapp;

public class Sport {
    int sportImg;
    String sportName;

    public Sport(String sportName,int sportImg) {
        this.sportName = sportName;
        this.sportImg = sportImg;
    }

    public int getSportImg() {
        return sportImg;
    }

    public void setSportImg(int sportImg) {
        this.sportImg = sportImg;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
}

package com.example.quizapp;

public class CountryItem
{

    String name;
    int image;
    public CountryItem(String name,int image){
        this.image=image;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}

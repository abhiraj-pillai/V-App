package com.example.app;

public class menuItem {
    int Image;
    String Name;
    int Price;


    public menuItem(int image, String name, int price) {
        Image = image;
        Name = name;
        Price = price;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}

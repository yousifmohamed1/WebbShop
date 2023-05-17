package com.example.demo.Models;

public class Sweaters extends Product{
    private String color;

    public Sweaters() {
    }

    public Sweaters(String name, double price, String image, String color) {
        super(name, price, image);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

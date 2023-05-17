package com.example.demo.Models;

public class Trousers extends Product{
    private String size;
    private String color;

    public Trousers() {
    }

    public Trousers(String name, double price, String image, String size) {
        super(name, price, image);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

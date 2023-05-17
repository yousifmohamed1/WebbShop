package com.example.demo.Models;

public class Dresses extends Product{
    private String type;

    public Dresses() {
    }

    public Dresses(String name, double price, String image, String type) {
        super(name, price, image);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

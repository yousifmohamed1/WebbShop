package com.example.demo.Models;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private String image;
    private String imageUrl;

    private String description;

    public Product() {
    }
    public Product(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;

}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
}

}


package com.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "shoppingCarts")
public class ShoppingCart {
    private String userId;
   // private List<Product> products;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    private String id;
    private User user;
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void addProduct(Product product) {
        if (product != null) {
            if (products == null) {
                products = new ArrayList<>();
            }
            products.add(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

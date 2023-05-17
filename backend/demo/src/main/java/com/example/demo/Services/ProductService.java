package com.example.demo.Services;

import com.example.demo.Models.Product;

import java.util.List;

    public interface ProductService {

        List<Product> getAllProducts();
        Product getProductById(String id);
        Product addProduct(Product product);
        Product updateProduct(String id, Product product);
        void deleteProduct(String id);
    }



package com.example.demo.Controllers;

import com.example.demo.Models.Product;
import com.example.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")

public class AdminController {
        @Autowired
        private ProductService productService;

    // Add a new product
        @PostMapping("/products")
        @PreAuthorize("hasRole('ADMIN')")
        public ResponseEntity<Product> addProduct(@RequestBody Product product) {
            Product newProduct = productService.addProduct(product);
            return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
        }

    // Update an existing product
        @PutMapping("/products/{productId}")
        @PreAuthorize("hasRole('ADMIN')")
        public ResponseEntity<Product> updateProduct(@PathVariable String productId, @RequestBody Product product) {
            Product updatedProduct = productService.updateProduct(productId, product);
            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
        }

    // Delete a product
        @DeleteMapping("/products/{productId}")
        @PreAuthorize("hasRole('ADMIN')")
        public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
            productService.deleteProduct(productId);
            return ResponseEntity.noContent().build();
        }
    }



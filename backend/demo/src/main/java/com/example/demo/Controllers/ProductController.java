package com.example.demo.Controllers;

import com.example.demo.Models.Product;
import com.example.demo.Models.Trousers;
import com.example.demo.Repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Trousers> getAllProduct(){
        return productRepository.findAll();
}
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        Optional<Trousers> product = productRepository.findById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create a new product
    @PostMapping

    public ResponseEntity<Product> createProduct(@RequestBody Trousers product) {
        Trousers savedProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);

    }

    // Update a product
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Trousers trousers) {
        Optional<Trousers> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Trousers existingTrousers = existingProduct.get();
            existingTrousers.setName(trousers.getName());
            existingTrousers.setPrice(trousers.getPrice());
            existingTrousers.setSize(trousers.getSize());
            existingTrousers.setColor(trousers.getColor());
            Trousers updatedTrousers = productRepository.save(existingTrousers);
            return ResponseEntity.ok(updatedTrousers);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    // Delete a product
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id) {
        Optional<Trousers> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            productRepository.deleteById(id);
            return ResponseEntity.ok("Product deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


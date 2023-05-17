package com.example.demo.Repositorys;

import com.example.demo.Models.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart,String> {
    //ShoppingCart findByUser(User user);
    Optional<ShoppingCart> findByUserId(String userId);
}

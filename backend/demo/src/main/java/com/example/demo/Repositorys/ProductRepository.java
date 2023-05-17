package com.example.demo.Repositorys;

import com.example.demo.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


//public interface ProductRepository extends MongoRepository<Trousers, String> {



@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

    //public interface ProductRepository<S extends Product> extends MongoRepository<S, String> {
}


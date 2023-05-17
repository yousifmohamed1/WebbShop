package com.example.demo.Repositorys;

import com.example.demo.Models.Trousers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrousersRepository extends MongoRepository<Trousers, String> {
}

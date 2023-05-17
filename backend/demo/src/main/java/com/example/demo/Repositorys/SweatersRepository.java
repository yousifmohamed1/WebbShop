package com.example.demo.Repositorys;

import com.example.demo.Models.Sweaters;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SweatersRepository extends MongoRepository<Sweaters, String> {

}

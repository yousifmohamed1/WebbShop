package com.example.demo.Repositorys;

import com.example.demo.Models.Dresses;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DressesRepository extends MongoRepository<Dresses, String> {

}

package com.example.demo.Repositorys;

import com.example.demo.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends MongoRepository<Users,String> {
    Users findByUsername(String username);

}

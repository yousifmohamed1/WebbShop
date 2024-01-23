package com.example.healthAppStarter.repository;


import com.example.healthAppStarter.models.Availability;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepository extends MongoRepository<Availability, String> {

}

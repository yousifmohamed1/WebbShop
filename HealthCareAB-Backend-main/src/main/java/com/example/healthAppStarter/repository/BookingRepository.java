package com.example.healthAppStarter.repository;

import com.example.healthAppStarter.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String>  {

}

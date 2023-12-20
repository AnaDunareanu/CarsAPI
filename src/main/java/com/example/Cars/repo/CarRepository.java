package com.example.Cars.repo;

import com.example.Cars.model.Car;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {
    Optional<Car> findCarByMake(String make);
}

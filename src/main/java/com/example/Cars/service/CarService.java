package com.example.Cars.service;

import org.springframework.stereotype.Service;

import com.example.Cars.model.Car;
import com.example.Cars.repo.CarRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    public List<Car> allCars()
    {
        return carRepository.findAll();
    }

    public Optional<Car> getCarByMake(String make)
    {
        return carRepository.findCarByMake(make);
    }

}

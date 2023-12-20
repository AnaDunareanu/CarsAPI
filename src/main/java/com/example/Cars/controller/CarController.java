package com.example.Cars.controller;

import com.example.Cars.model.Car;
import com.example.Cars.service.CarService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/all")
    public ResponseEntity<List<Car>> allCars()
    {
        return new ResponseEntity<List<Car>>(carService.allCars(), HttpStatus.OK);
    }

    @GetMapping("/{make}")
    public ResponseEntity<Optional<Car>> searchByManufacturer(@PathVariable String make)
    {
        return new ResponseEntity<Optional<Car>>(carService.getCarByMake(make), HttpStatus.OK);
    }

}

package com.example.Cars.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @GetMapping("/all")
    public ResponseEntity<String> allMovies()
    {
        return new ResponseEntity<String>("All movies!", HttpStatus.OK);
    }

}

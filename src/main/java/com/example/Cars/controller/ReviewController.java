package com.example.Cars.controller;

import com.example.Cars.model.Review;
import com.example.Cars.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Map<String, String> payload)
    {
        return new ResponseEntity<Review>(reviewService.addReview(payload.get("reviewBody"), payload.get("carId")), HttpStatus.CREATED);
    }

}

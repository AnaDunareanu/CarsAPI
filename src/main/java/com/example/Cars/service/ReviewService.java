package com.example.Cars.service;

import com.example.Cars.model.Car;
import com.example.Cars.model.Review;
import com.example.Cars.repo.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Review addReview(String reviewBody, String carId)
    {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Car.class)
                .matching(Criteria.where("carId").is(carId))
                .apply(new Update().push("reviews").value(review))
                .first();

        return review;
    }
}

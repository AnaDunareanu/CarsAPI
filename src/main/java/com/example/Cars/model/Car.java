package com.example.Cars.model;

import com.example.Cars.model.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    private ObjectId id;
    private Integer carID;
    private String make;
    private String model;
    private Integer year;
    //private String color;
    private Integer price;
    private String fuelType;
    private String transmission;
    private List<String> features;
    private String poster;
    private List<String> images;

    @DocumentReference
    private List<Review> reviewId;
}

package com.example.numberclassifierapiapplication.repository;

import com.example.numberclassifierapiapplication.model.NumberClassification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NumberRepository extends MongoRepository<NumberClassification, Integer> {
}

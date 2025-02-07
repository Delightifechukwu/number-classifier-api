package com.example.numberclassifierapiapplication.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "numbers")
public class NumberClassification {
    private int number;
    private boolean isPrime;
    private boolean isPerfect;
    private List<String> properties;
    private int digitSum;
    private String funFact;
}

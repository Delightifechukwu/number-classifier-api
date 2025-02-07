package com.example.numberclassifierapiapplication.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NumberClassificationService {
    public Map<String, Object> classifyNumber(int number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("is_prime", isPrime(number));
        response.put("is_perfect", isPerfect(number));
        response.put("properties", getProperties(number));
        response.put("digit_sum", digitSum(number));
        response.put("fun_fact", "Fun fact about " + number);
        return response;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private boolean isPerfect(int number) {
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) sum += number / i;
            }
        }
        return sum == number && number != 1;
    }

    private List<String> getProperties(int number) {
        List<String> properties = new ArrayList<>();
        if (number % 2 == 0) properties.add("even");
        else properties.add("odd");
        return properties;
    }

    private int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

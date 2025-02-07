package com.example.numberclassifierapiapplication.controller;

import com.example.numberclassifierapiapplication.service.NumberClassificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NumberClassificationController {
    private final NumberClassificationService service;

    @GetMapping("/classify-number")
    public ResponseEntity<?> classifyNumber(@RequestParam String number) {
        try {
            int num = Integer.parseInt(number);
            return ResponseEntity.ok(service.classifyNumber(num));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(Collections.singletonMap("error", "Invalid number format"));
        }
    }

}

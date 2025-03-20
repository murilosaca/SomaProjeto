package com.example.soma2.controller;

import io.micrometer.common.util.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SomaController {

    @GetMapping("/soma/{num1}/{num2}")
    public ResponseEntity<String> sum(@PathVariable String num1, @PathVariable String num2) {
        try {
            double number1 = Double.parseDouble(num1.replace(",","."));
            double number2 = Double.parseDouble(num2.replace(",","."));
            String message = "O resultado da soma de ".concat(num1).concat(" + ").concat(num2).concat(" é ").concat(String.valueOf(Double.sum(number1, number2)));
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insira números válidos");
        }
    }
}

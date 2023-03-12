package com.example.circleciw23.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleApi
{
    @GetMapping("example")
    public ResponseEntity<List<String>> getWords()
    {
        return new ResponseEntity<>(List.of(
            "and", "sand", "land", "fan", "plan"
        ), HttpStatus.OK);
    }
}

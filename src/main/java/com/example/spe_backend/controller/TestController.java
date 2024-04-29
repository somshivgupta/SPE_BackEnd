package com.example.spe_backend.controller;

import com.example.spe_backend._aux.AuxTestDTO;
import com.example.spe_backend._aux.AuxTestQuestion;
import com.example.spe_backend._aux.AuxTestScoreDTO;
import com.example.spe_backend.entities.TestQuestions;
import com.example.spe_backend.entities.Tests;
import com.example.spe_backend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService service;

    @GetMapping(path = "/getQuestions/{testId}")
    public List<TestQuestions> getQuestionsByTestId(@PathVariable Integer testId){
        System.out.println(service.getQuestionsByTestId(testId));
        return service.getQuestionsByTestId(testId);
    }

    @PostMapping(path = "/getEmail")
    public String getEmail(@RequestBody AuxTestScoreDTO auxTestScoreDTO){
        return service.getEmail(auxTestScoreDTO);
    }
}


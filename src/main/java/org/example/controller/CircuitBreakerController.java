package org.example.controller;

import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @Autowired
    private TestService testService;

    @GetMapping("/getRecords")
    public String getDetails() {
        return testService.getDetails();
    }

}

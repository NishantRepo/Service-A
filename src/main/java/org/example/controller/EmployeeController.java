package org.example.controller;

import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    @Qualifier("v1")
    private EmployeeService employeeService;

    @GetMapping("/getEmployee")
    public String getResult() {
        employeeService.testEmployee();
        return "hi";
    }
}

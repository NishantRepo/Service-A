package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/client-a")
public class TestController {

    @GetMapping("/get")
    public String getResult() {
        return "service-a response";
    }

    @GetMapping("/getAll")
    public String getAll() {
        return "getAll records";
    }

    @GetMapping("/get/{id}")
    public String getAll(@PathVariable("id") String id) {
        return "get records for id: " + id;
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") String id) {
        return "update records for id: " + id;
    }

    @PostMapping("/create")
    public String createRecords() {
        return "getAll records";
    }
}

package org.example.controller;


import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimiterController {

    @GetMapping("/rateLimiter")
        @RateLimiter(name = "myRateLimiter", fallbackMethod = "rateLimiterFallback")
    public String getAllRecords() {

       return "response: success";
    }

    public String rateLimiterFallback(Throwable t) {
        return "response: to many requests";
    }
}

package org.example.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = "serviceBCall", fallbackMethod = "getFallbackMessage")
    public String getDetails() {
        try {
            return restTemplate.getForObject("http://localhost:8080/abc", String.class);
        } catch (Exception ex) {
            throw new RuntimeException("Service-B call failed");
        }
    }

    public String getFallbackMessage(Throwable t) {
        return "fallback method response";
    }
}

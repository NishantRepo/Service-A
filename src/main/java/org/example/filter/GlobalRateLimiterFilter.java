package org.example.filter;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class GlobalRateLimiterFilter extends OncePerRequestFilter {

    private final RateLimiter rateLimiter;

    // Constructor: Inject the RateLimiter registry and configure a global RateLimiter
    public GlobalRateLimiterFilter(RateLimiterRegistry rateLimiterRegistry) {
        // Configure global rate limiter
        this.rateLimiter = rateLimiterRegistry.rateLimiter("globalRateLimiter");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Try to acquire a permission from the rate limiter
        if (rateLimiter.acquirePermission()) {
            // If permission is granted, allow the request to proceed
            filterChain.doFilter(request, response);
        } else {
            // If permission is denied (rate limit exceeded), return a rate limit exceeded response
            response.setStatus(HttpStatus.SC_TOO_MANY_REQUESTS);  // HTTP 429 Too Many Requests
            response.getWriter().write("Rate limit exceeded. Please try again later.");
        }
    }

    @Override
    public void destroy() {
        // Cleanup logic if needed
    }
}

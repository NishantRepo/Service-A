package org.example.filter;

import io.github.resilience4j.ratelimiter.RateLimiter;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class RateLimiterInterceptor implements ClientHttpRequestInterceptor {

    private final RateLimiter rateLimiter;

    public RateLimiterInterceptor(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        try {
            return RateLimiter.decorateCheckedSupplier(rateLimiter, () -> execution.execute(request, body))
                .get(); // Executes the request or throws RateLimitExceededException
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

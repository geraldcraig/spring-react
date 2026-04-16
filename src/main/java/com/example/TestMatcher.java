package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.util.matcher.RequestMatcher;

public class TestMatcher {
    public static void main(String[] args) {
        RequestMatcher matcher = new RequestMatcher("/test") {
            @Override
            public MatchResult matcher(HttpServletRequest request) {
                return RequestMatcher.super.matcher(request);
            }
        };
        System.out.println(matcher);
    }
}

//package com.example;
//
//import java.io.IOException;
//import java.util.Collections;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.RequestMatcher;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.example.domain.AccountCredentials;
//
//public class LoginFilter extends UsernamePasswordAuthenticationFilter {
//
//    public LoginFilter(AuthenticationManager authManager) {
//        setAuthenticationManager(authManager);
//        setFilterProcessesUrl("/login"); // Set the login endpoint
//    }
//
//    @Override
//    public Authentication attemptAuthentication(
//            HttpServletRequest req, HttpServletResponse res)
//            throws AuthenticationException {
//        try {
//            AccountCredentials creds = new ObjectMapper()
//                    .readValue(req.getInputStream(), AccountCredentials.class);
//            UsernamePasswordAuthenticationToken authRequest =
//                    new UsernamePasswordAuthenticationToken(
//                            creds.getUsername(),
//                            creds.getPassword(),
//                            Collections.emptyList()
//                    );
//            setDetails(req, authRequest);
//            return this.getAuthenticationManager().authenticate(authRequest);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    protected void successfulAuthentication(
//            HttpServletRequest req,
//            HttpServletResponse res, FilterChain chain,
//            Authentication auth) throws IOException, ServletException {
//        com.example.service.AuthenticationService.addToken(res, auth.getName());
//    }
//}
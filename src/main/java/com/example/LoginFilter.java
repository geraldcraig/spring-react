//package com.example;
//
//import com.example.domain.AccountCredentials;
//import com.example.service.AuthenticationService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import java.io.IOException;
//import java.util.Collections;
//
//public class LoginFilter extends AbstractAuthenticationProcessingFilter {
//
//    public LoginFilter(String url, AuthenticationManager authenticationManager) {
//        super(new AntPathRequestMatcher(url));
//        setAuthenticationManager(authenticationManager);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//            throws AuthenticationException, IOException, ServletException {
//        AccountCredentials creds = new ObjectMapper()
//                .readValue(request.getInputStream(), AccountCredentials.class);
//
//        UsernamePasswordAuthenticationToken authToken =
//                new UsernamePasswordAuthenticationToken(
//                        creds.getUsername(),
//                        creds.getPassword(),
//                        Collections.emptyList()
//                );
//        return getAuthenticationManager().authenticate(authToken);
//    }
//
//    @Override
//    protected void successfulAuthentication(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            FilterChain chain,
//            Authentication authResult) throws IOException, ServletException {
//        AuthenticationService.addToken(response, authResult.getName());
//    }
//}

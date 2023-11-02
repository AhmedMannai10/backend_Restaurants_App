package com.eduapp.v1.user.config;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.NotNull;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doFilterInternal'");
    }

    // private final JwtService jwtService;

    // public JwtAuthenticationFilter(JwtService jwtService) {
    // this.jwtService = jwtService;
    // }

    // @Override
    // protected void doFilterInternal(
    // @NotNull HttpServletRequest request,
    // @NotNull HttpServletResponse response,
    // @NotNull FilterChain filterChain
    // )throws ServletException, IOException {
    // final String authHeader = request.getHeader("Authorization");
    // final String jwtToken;
    // final String userEmail;

    // if(authHeader == null || !authHeader.startsWith("Bearer ")){
    // filterChain.doFilter(request, response);
    // return;
    // }

    // // starte getting the token after "bearer "
    // // ^7
    // jwtToken = authHeader.substring(7);
    // userEmail = jwtService.(jwtToken);// extract userEmail from jwt token;
    // }

}

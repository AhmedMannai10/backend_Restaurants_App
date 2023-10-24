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

    public JwtAuthenticationFilter() {

    }

	@Override
	protected void doFilterInternal(
                @NotNull HttpServletRequest request, 
                @NotNull HttpServletResponse response, 
                @NotNull FilterChain filterChain
    )throws ServletException, IOException {

	}


}


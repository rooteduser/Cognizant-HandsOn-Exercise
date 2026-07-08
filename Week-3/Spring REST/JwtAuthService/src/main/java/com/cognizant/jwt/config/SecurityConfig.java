package com.cognizant.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Spring Security configuration.
 * Disables CSRF and form-login so that the stateless JWT REST API works correctly.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF — not needed for stateless REST APIs
            .csrf(csrf -> csrf.disable())
            // Use stateless session (JWT is self-contained)
            .sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                // Allow unauthenticated access to the login endpoint
                .requestMatchers("/api/auth/login").permitAll()
                // All other requests are publicly accessible for this demo
                // In production, you would secure /api/resource here
                .anyRequest().permitAll()
            );

        return http.build();
    }
}

package com.dupin.erwin.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/*
*  Config class to enable cross origin requests from client
*
* */
public class WebMvcConfig implements WebMvcConfigurer {

    private final int MAX_AGE_SECS = 1800;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("NEAD",
                        "OPTIONS",
                        "GET",
                        "POST",
                        "PUT",
                        "PATCH",
                        "DELETE")
                .maxAge(MAX_AGE_SECS);
    }
}

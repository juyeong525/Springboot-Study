package com.example.demo.global.config;

import com.example.demo.global.error.GlobalExceptionFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@RequiredArgsConstructor
public class FilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    @Override
    public void configure(HttpSecurity builder) {
        GlobalExceptionFilter globalExceptionFilter = new GlobalExceptionFilter();
        builder.addFilterBefore(globalExceptionFilter, null);
    }
}

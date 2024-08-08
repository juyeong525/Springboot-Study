package com.example.demo.global.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Getter
@AllArgsConstructor
@ConfigurationPropertiesScan("jwt")
public class JwtProperties {
    private final String secretKey;
    private final Long accessExp;
    private final Long refreshExp;
    private final String header;
    private final String prefix;
}

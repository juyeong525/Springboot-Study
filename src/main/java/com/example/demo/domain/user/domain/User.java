package com.example.demo.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(length = 15, nullable = false)
    private String accoundId;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(length = 5, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Builder
    private User(String accoundId, String password, String name, String email) {
        this.accoundId = accoundId;
        this.password = password;
        this.name = name;
        this.email = email;
    }
}

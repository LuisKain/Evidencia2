package com.example.Evidencia2.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private int age;
    private String gender;
    private double height;
    private String username;
    private String password;

    public User(String fullName, int age, String gender, double height, String username, String password) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.username = username;
        this.password = password;
    }

}

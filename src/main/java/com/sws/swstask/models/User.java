package com.sws.swstask.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lastName;

    private String firstName;

    private String patronymic;

    private String email;

    private String phoneNumber;

    public User(String lastName, String firstName, String patronymic, String email, String phoneNumber) {
    }
}

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

    private String last_name;

    private String first_name;

    private String patronymic;

    private String email;

    private String phone_number;

    public User(String last_name, String first_name, String patronymic, String email, String phone_number) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.email = email;
        this.phone_number = phone_number;
    }
}

package com.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
//@Entity
//@Table(name="users")
@Getter @Setter
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {

    }

}

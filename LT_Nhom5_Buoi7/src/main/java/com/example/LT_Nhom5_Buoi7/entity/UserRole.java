package com.example.LT_Nhom5_Buoi7.entity;

import jakarta.persistence.Column;

import java.io.Serializable;

public class UserRole implements Serializable {
    @Column(name = "user_id")
    private Integer user;

    @Column(name = "role_id")
    private Integer role;
}

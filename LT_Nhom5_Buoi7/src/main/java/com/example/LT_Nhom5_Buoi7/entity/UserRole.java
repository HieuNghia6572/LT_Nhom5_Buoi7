package com.example.LT_Nhom5_Buoi7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class UserRole implements Serializable {
    @Column(name = "user_id")
    private Integer user;

    @Column(name = "role_id")
    private Integer role;
}

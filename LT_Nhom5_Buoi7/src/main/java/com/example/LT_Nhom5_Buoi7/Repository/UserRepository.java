package com.example.LT_Nhom5_Buoi7.Repository;

import com.example.LT_Nhom5_Buoi7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    User getUserByUsername(String username);
}


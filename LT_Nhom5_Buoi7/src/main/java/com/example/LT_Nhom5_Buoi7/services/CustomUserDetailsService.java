package com.example.LT_Nhom5_Buoi7.services;
import com.example.LT_Nhom5_Buoi7.Repository.UserRepository;
import com.example.LT_Nhom5_Buoi7.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        String pass;
        Set<GrantedAuthority> authorities = new HashSet<>();
        if(username == "admin") {
            pass = "admin";
            authorities.add(new SimpleGrantedAuthority("ADMIN"));
        }
        else if(username == "sales") {
            pass = "sales";
            authorities.add(new SimpleGrantedAuthority("SALES"));
        }
        else {
            pass ="user";
            authorities.add(new SimpleGrantedAuthority("USER"));
        }
        return new org.springframework.security.core.userdetails.User(
                username,
                new BCryptPasswordEncoder().encode(pass),
                authorities
        );
    }
}
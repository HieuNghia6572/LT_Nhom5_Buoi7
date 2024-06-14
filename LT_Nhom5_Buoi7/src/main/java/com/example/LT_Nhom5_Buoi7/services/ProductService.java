package com.example.LT_Nhom5_Buoi7.services;

import com.example.LT_Nhom5_Buoi7.Repository.ProductRepository;
import com.example.LT_Nhom5_Buoi7.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> GetAll() {
        return productRepository.findAll();
    }
}


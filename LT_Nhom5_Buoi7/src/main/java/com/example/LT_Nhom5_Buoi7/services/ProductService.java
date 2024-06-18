package com.example.LT_Nhom5_Buoi7.services;

import com.example.LT_Nhom5_Buoi7.Repository.ProductRepository;
import com.example.LT_Nhom5_Buoi7.entity.Product;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> GetAll() {
        return productRepository.findAll();
    }
    public Optional<Product> get(int id) {
        return productRepository.findById(id);
    }
    // Add a new product to the database
    public Product add(Product product) {
        return productRepository.save(product);
    }
    public Product edit(@NotNull Product product) {
        Product existingProduct = productRepository.findById(product.getId())
                .orElseThrow(() -> new IllegalStateException("Product with ID " +
                        product.getId() + " does not exist."));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        existingProduct.setImage(product.getImage());
        existingProduct.setCategory(product.getCategory());
        return productRepository.save(existingProduct);
    }
}

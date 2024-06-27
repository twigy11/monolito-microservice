package com.example.product.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.infraestructure.jpa.ProductJpaEntity;
import com.example.product.infraestructure.jpa.ProductJpaRepository;

@Service
public class ProductService {
    @Autowired
    private ProductJpaRepository productRepository;

    public ProductJpaEntity createProduct(ProductJpaEntity product) {
        return productRepository.save(product);
    }

    public ProductJpaEntity getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}

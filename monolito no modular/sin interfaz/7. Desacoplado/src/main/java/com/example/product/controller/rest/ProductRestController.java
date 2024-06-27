package com.example.product.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.product.application.ProductService;
import com.example.product.infraestructure.jpa.ProductJpaEntity;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductJpaEntity createProduct(@RequestBody ProductJpaEntity product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ProductJpaEntity getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }
}

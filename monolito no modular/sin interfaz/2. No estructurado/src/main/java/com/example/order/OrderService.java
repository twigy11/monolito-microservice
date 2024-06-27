package com.example.order;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.Product;
import com.example.product.ProductRepository;
import com.example.user.User;
import com.example.user.UserRepository;

@Service
public class OrderService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order newOrder) {
        // Verificar si el usuario existe
        User user = userRepository.findById(newOrder.getUser().getId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Verificar si el producto existe
        Product product = productRepository.findById(newOrder.getProductOrdered().getId())
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        // Crear y guardar el nuevo pedido
        newOrder.setUser(user);
        newOrder.setProductOrdered(product);
        return orderRepository.save(newOrder);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    public List<Order> getAllOrderes() {
        return orderRepository.findAll();
    }
}

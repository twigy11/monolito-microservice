package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public ExampleOrder createOrder(ExampleOrder order) {
        return orderRepository.save(order);
    }

    public ExampleOrder getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}

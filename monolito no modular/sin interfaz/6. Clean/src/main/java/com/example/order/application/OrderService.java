package com.example.order.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.infraestruture.jpa.OrderJpaEntity;
import com.example.order.infraestruture.jpa.OrderJpaRepository;

@Service
public class OrderService {
    @Autowired
    private OrderJpaRepository orderRepository;

    public OrderJpaEntity createOrder(OrderJpaEntity order) {
        return orderRepository.save(order);
    }

    public OrderJpaEntity getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}

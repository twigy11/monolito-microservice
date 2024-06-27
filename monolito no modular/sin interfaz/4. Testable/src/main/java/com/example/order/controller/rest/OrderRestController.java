package com.example.order.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.order.application.OrderService;
import com.example.order.infraestruture.jpa.OrderJpaEntity;

@RestController
@RequestMapping("/orders")
public class OrderRestController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderJpaEntity createOrder(@RequestBody OrderJpaEntity order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public OrderJpaEntity getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }
}

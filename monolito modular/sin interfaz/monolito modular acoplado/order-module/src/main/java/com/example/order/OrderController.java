package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ExampleOrder createOrder(@RequestBody ExampleOrder order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public ExampleOrder getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }
}

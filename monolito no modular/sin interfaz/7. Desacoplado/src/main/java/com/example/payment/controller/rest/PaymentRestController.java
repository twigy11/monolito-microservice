package com.example.payment.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.payment.application.PaymentService;
import com.example.payment.infraestructure.jpa.PaymentJpaEntity;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentJpaEntity createPayment(@RequestBody PaymentJpaEntity payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/{id}")
    public PaymentJpaEntity getPayment(@PathVariable Long id) {
        return paymentService.getPayment(id);
    }
}

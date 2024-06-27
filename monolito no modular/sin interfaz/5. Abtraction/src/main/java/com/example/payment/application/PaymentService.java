package com.example.payment.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment.infraestructure.jpa.PaymentJpaEntity;
import com.example.payment.infraestructure.jpa.PaymentJpaRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentJpaRepository paymentRepository;

    public PaymentJpaEntity createPayment(PaymentJpaEntity payment) {
        return paymentRepository.save(payment);
    }

    public PaymentJpaEntity getPayment(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
}

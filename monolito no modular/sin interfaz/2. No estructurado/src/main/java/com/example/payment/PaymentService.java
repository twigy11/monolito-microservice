package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.OrderRepository;
import com.example.order.Order;
import java.util.List;


@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Payment createPayment(Payment newPayment) {
        Order orderPaymented = this.orderRepository.findById(newPayment.getOrderPaymented().getId()).orElseThrow(() -> new RuntimeException("Pedidno no encontrado"));
        newPayment.setOrderPaymented(orderPaymented);
        return paymentRepository.save(newPayment);
    }

    public Payment getPayment(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}

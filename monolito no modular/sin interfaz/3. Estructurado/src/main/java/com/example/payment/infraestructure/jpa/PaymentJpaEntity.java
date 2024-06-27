package com.example.payment.infraestructure.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Payments")
public class PaymentJpaEntity {
    @Id
    private Long id;
    private Long orderId;
    private Double amount;

    // getters
    public Long getId() {
        return id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Double getAmount() {
        return amount;
    }

    // setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

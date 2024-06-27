package com.example.payment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.order.Order;

@Entity(name = "Payments")
public class Payment {
    @Id
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Order orderPaymented;
    private Double amount;

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Order getOrderPaymented() {
        return orderPaymented;
    }
    public void setOrderPaymented(Order orderPaymented) {
        this.orderPaymented = orderPaymented;
    }
}

package com.example.order.infraestruture.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Orders")
public class OrderJpaEntity {
    @Id
    private Long id;
   
    private Long userId;
    private Long productId;
    // Getter and Setter methods for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter methods for userId
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // Getter and Setter methods for productId
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}

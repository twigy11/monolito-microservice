package com.example.order;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.product.Product;
import com.example.user.User;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Orders")
public class Order {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productOrdered;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    // Getter and Setter methods for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter methods for productOrdered
    public Product getProductOrdered() {
        return productOrdered;
    }

    public void setProductOrdered(Product productOrdered) {
        this.productOrdered = productOrdered;
    }
}

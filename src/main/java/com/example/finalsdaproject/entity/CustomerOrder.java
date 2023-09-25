package com.example.finalsdaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "CustomerOrder")
@Getter
@Setter
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_price")
    private Integer totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Product country;
}

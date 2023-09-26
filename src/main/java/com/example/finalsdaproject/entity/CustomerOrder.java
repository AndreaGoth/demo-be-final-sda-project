package com.example.finalsdaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "customer_order") // Use lowercase table name for better convention
@Getter
@Setter
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_price")
    private Double totalPrice; // Changed to Double for storing decimal values

    @ManyToOne
    @JoinColumn(name = "product_id") // Corrected column name to match the relationship
    private Product product; // Changed country to product for the ManyToOne relationship
}

//com.example.finalsdaproject.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.text.DecimalFormat;
//import java.util.Date;
//
//@Entity
//@Table(name = "CustomerOrder")
//@Getter
//@Setter
//public class CustomerOrder {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "order_date")
//    private Date orderDate;
//
//    @Column(name = "product_id")
//    private Long productId;
//
//    @Column(name = "quantity")
//    private Integer quantity;
//
//    @Column(name = "total_price")
//    private Integer totalPrice;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Product country;
//}
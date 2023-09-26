package com.example.finalsdaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer") // Use lowercase table name for better convention
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false) // Use nullable attribute for NOT NULL constraint
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true) // Added unique constraint
    private String email;

    @Column(name = "phone") // Store phone numbers as strings to preserve their format
    private String phone;

    @Column(name = "address") // Corrected column name typo
    private String address;

    @ManyToOne
    @JoinColumn(name = "country_id") // Corrected column name to match the relationship
    private Country country; // Changed Product to Country for the ManyToOne relationship
}

//package com.example.finalsdaproject.entity;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "Customer")
//@Getter
//@Setter
//public class Customer {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "phone") // Format Preservation: Phone numbers can have various formats,
//    private String phone;   // including special characters like dashes, parentheses, or plus signs for international numbers.
//    // By storing them as strings, you can preserve their original format without losing any information.
//
//
//    @Column(name = "adress")
//    private String adress;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Product country;
//}
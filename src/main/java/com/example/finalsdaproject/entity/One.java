package com.example.finalsdaproject.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "one")
@Getter
@Setter
public class One {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // id
    private Long id;

    @Column(name = "category_name") // category_name
    private String category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Four> products;  // nu se vede in my sql, se realizeaza in spate ---
    // --- mapare ajuta la debugging, ajuta la operatii, etc
}

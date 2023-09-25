package com.example.finalsdaproject.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "five")
@Getter
@Setter
public class Five {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "five1")
    private Long id;

    @Column(name = "five2")
    private String name;

    @ManyToOne
    @JoinColumn(name = "five_id")
    private Four country;
}

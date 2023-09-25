package com.example.finalsdaproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "two")
@Getter
@Setter
public class Two {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //id
    private Long id;

    @Column(name = "code") // code
    private String code;

    @Column(name = "name") // name
    private String name;

    @OneToMany(mappedBy = "country") // country
    @JsonIgnore
    private List<Three> states;
}


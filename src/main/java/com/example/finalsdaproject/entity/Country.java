package com.example.finalsdaproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Country")
@Getter
@Setter
public class Country {

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
    private List<State> states;
}


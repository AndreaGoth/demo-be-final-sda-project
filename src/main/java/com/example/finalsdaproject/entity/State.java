package com.example.finalsdaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "State")
@Getter
@Setter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;  // Link this state to a country
}

//package com.example.finalsdaproject.entity;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "State")
//@Getter
//@Setter
//public class State {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id") // id
//    private Long id;
//
//    @Column(name = "name") // name
//    private String name;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Country country;
//
//}
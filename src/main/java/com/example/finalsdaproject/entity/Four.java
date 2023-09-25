package com.example.finalsdaproject.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "four")
@Getter
@Setter
public class Four {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // id
    private Long id;

    @Column(name = "sku") // sku
    private String sku;

    @Column(name = "name") // name
    private String name;

    @Column(name = "description") // description
    private String description;

    @Column(name = "unit_price") // unit_price
    private BigDecimal unitPrice;

    @Column(name = "image_url") // image_url
    private String imageUrl;

    @Column(name = "active") // active
    private Boolean active;

    @Column(name = "units_in_stock") // units_in_stock
    private Integer unitsInStock;

    @Column(name = "date_created") // date_created
    private Date dateCreated;

    @Column(name = "last_updated") // last_updated
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)  // category_id
    private One category;
}

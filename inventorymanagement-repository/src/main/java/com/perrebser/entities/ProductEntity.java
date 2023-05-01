package com.perrebser.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name ="Product" )
public class ProductRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryRepository category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierRepository supplier;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    @Column(name = "price")
    private BigDecimal price;
}

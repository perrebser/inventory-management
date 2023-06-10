package com.perrebser.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name ="Product" )
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long productId;

    @Column(name = "code",unique = true)
    private String code;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierEntity supplier;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    @Column(name = "price")
    private BigDecimal price;

    @OneToOne(mappedBy = "product")
    private StockEntity stock;
}

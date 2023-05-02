
package com.perrebser.entities;

import lombok.Data;

import javax.naming.InterruptedNamingException;
import javax.persistence.*;

@Entity
@Data
@Table(name = "Stock")
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}



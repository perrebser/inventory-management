package com.perrebser.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long supplierId;

    @Column(name = "supplier_name", nullable = false)
    private String supplierName;

    @OneToMany(mappedBy = "supplier")
    private List<ProductEntity> products;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;
}

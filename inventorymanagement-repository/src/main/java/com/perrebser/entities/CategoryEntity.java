package com.perrebser.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "category")
@Data
@Entity
public class CategoryRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="category_id" )
    private Long categoryId;

    @OneToMany(mappedBy = "category")
    private List<ProductRepository> products;

    @Column(name = "category_name",nullable = false)
    private String categoryName;
}

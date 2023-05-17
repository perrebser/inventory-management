package com.perrebser.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductObject {
    private String code;
    private String name;
    private BigDecimal price;
}

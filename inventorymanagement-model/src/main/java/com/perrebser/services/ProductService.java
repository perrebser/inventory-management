package com.perrebser.services;

import com.perrebser.model.ProductObject;

import javax.transaction.Transactional;


public interface ProductService {
    @Transactional
    ProductObject findByCode(String code);

}

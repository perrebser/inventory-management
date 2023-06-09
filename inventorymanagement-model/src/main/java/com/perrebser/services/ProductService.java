package com.perrebser.services;

import com.perrebser.entities.ProductEntity;
import com.perrebser.model.ProductObject;

import javax.transaction.Transactional;
import java.util.List;


public interface ProductService {
    @Transactional
    ProductObject findByCode(String code);

    @Transactional
    List<ProductObject> findAllProducts();

    @Transactional
    ProductObject createProduct(ProductObject productObject);

    @Transactional
    void deleteProductByCode(String code);
}

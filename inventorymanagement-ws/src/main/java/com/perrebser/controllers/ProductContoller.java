package com.perrebser.controllers;

import com.perrebser.api.ProductsApi;
import com.perrebser.model.ProductDTO;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "products")
@RestController
public class ProductContoller implements ProductsApi {
    @Override
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return ProductsApi.super.getAllProducts();
    }

    @Override
    public ResponseEntity<List<ProductDTO>> getProductById(Integer productId) {
        return ProductsApi.super.getProductById(productId);
    }
}

package com.perrebser.controllers;

import com.perrebser.api.ProductsApi;
import com.perrebser.mapper.ProductWSMapper;
import com.perrebser.model.ProductDTO;
import com.perrebser.model.ProductObject;
import com.perrebser.model.ProductResponseDTO;
import com.perrebser.services.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "products")
@RestController
public class ProductContoller implements ProductsApi {
    @Autowired
    ProductService productService;

    @Autowired
    ProductWSMapper productWSMapper;

    @Override
    public ResponseEntity<ProductResponseDTO> getProductByCode(String productCode) {
        ProductObject productObject=productService.findByCode(productCode);
        ProductResponseDTO productResponseDTO= productWSMapper.asProductResponseDto(productObject);

        return ResponseEntity.ok(productResponseDTO);
    }
}

package com.perrebser.services;

import com.perrebser.entities.ProductEntity;
import com.perrebser.mapper.ProductMapper;
import com.perrebser.model.ProductObject;
import com.perrebser.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductObject findByCode(String code) {
       Optional<ProductEntity> productEntityOptional= productRepository.findByCodeIgnoreCase(code);
       if(productEntityOptional.isPresent())
           return productMapper.asProductObject(productEntityOptional.get());
       else
           throw new EntityNotFoundException();
    }
}

package com.perrebser.services;

import com.perrebser.entities.ProductEntity;
import com.perrebser.mapper.ProductMapper;
import com.perrebser.model.ProductObject;
import com.perrebser.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
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

    @Override
    public List<ProductObject> findAllProducts() {
        List<ProductEntity> productEntities= productRepository.findAll();
        return productMapper.asProductObjectList(productEntities);
    }

    @Override
    public ProductObject createProduct(ProductObject productObject) {
          return productMapper.asProductObject(productRepository.save(productMapper.asProductEntity(productObject))) ;
    }

    @Override
    public void deleteProductByCode(String code) {
        Optional<ProductEntity> product=productRepository.findByCodeIgnoreCase(code);
        if(!product.isPresent()){
            throw new EntityNotFoundException();
        }
        productRepository.delete(product.get());

    }
}

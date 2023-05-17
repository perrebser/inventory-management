package com.perrebser.mapper;

import com.perrebser.entities.ProductEntity;
import com.perrebser.model.ProductObject;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    ProductObject asProductObject(ProductEntity productEntity);

    ProductEntity asProductEntity(ProductObject productObject);
}

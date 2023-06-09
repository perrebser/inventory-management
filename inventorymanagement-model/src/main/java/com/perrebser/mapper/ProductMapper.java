package com.perrebser.mapper;

import com.perrebser.entities.ProductEntity;
import com.perrebser.model.ProductObject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductObject asProductObject(ProductEntity productEntity);

    ProductEntity asProductEntity(ProductObject productObject);

    List<ProductObject> asProductObjectList(List<ProductEntity> productEntityList);
}

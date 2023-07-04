package com.perrebser.mapper;

import com.perrebser.entities.CategoryEntity;
import com.perrebser.model.CategoryObject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryObject asCategoryObject (CategoryEntity categoryEntity);

    CategoryEntity asCategoryEntity(CategoryObject categoryObject);

    List<CategoryEntity> asCategoryEntityList (List<CategoryObject> categoryObjectList);

    List<CategoryObject> asCategoryObjectList (List<CategoryEntity> categoryEntityList);
}

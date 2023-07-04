package com.perrebser.services;

import com.perrebser.model.CategoryObject;

import  org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface CategoryService {

    @Transactional
    List<CategoryObject> addCategories(List<CategoryObject> categoryObjectList);

     @Transactional
    CategoryObject updateCategory(CategoryObject categoryObject);

    @Transactional(readOnly= true)
    List<CategoryObject> getCategories();

    @Transactional
    Void deleteCategory(String categoryCode);

}

package com.perrebser.services;

import com.perrebser.entities.CategoryEntity;
import com.perrebser.mapper.CategoryMapper;
import com.perrebser.model.CategoryObject;
import com.perrebser.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<CategoryObject> addCategories(List<CategoryObject> categoryObjectList) {
        List<CategoryEntity> categoryEntities=categoryMapper.asCategoryEntityList(categoryObjectList);
        return categoryMapper.asCategoryObjectList(categoryRepository.saveAll(categoryEntities));
    }

    @Override
    public CategoryObject updateCategory(CategoryObject categoryObject) {
        return null;
    }

    @Override
    public List<CategoryObject> getCategories() {
        return null;
    }

    @Override
    public Void deleteCategory(String categoryCode) {
        return null;
    }
}
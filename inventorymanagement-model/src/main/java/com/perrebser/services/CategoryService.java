package com.perrebser.services;

import com.perrebser.model.CategoryObject;

import javax.transaction.Transactional;
import java.util.List;

public interface CategoryService {
    @Transactional
    List<CategoryObject> addCategories(List<CategoryObject> categoryObjectList);
}

package com.perrebser.controllers;

import com.perrebser.api.CategoryApi;
import com.perrebser.model.CategoryDTO;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Category")
@RestController
public class CategoryController implements CategoryApi {

     @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryWSMapper categoryWSMapper;

    @Override
    public ResponseEntity<List<CategoryDTO>> addCategories(List<CategoryDTO> categoryDTO) {
        List<CategoryObject> categoryObjects =categoryService.addCategories(categoryWSMapper.asCategoryObjectList(categoryDTO));
        return ResponseEntity.ok(categoryWSMapper.asCategoryDtoList(categoryObjects));
    }

    @Override
    public ResponseEntity<Void> deleteCategory(String categoryCode) {
        return CategoryApi.super.deleteCategory(categoryCode);
    }

    @Override
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return CategoryApi.super.getCategories();
    }

    @Override
    public ResponseEntity<CategoryDTO> updateCategory(String categoryCode, CategoryDTO categoryDTO) {
        return CategoryApi.super.updateCategory(categoryCode, categoryDTO);
    }
}

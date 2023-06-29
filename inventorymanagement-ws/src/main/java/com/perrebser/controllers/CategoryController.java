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

    @Override
    public ResponseEntity<List<CategoryDTO>> addCategories(List<CategoryDTO> categoryDTO) {
        return CategoryApi.super.addCategories(categoryDTO);
    }

    @Override
    public ResponseEntity<Void> deleteCategory(String categoryCode) {
        return CategoryApi.super.deleteCategory(categoryCode);
    }

    @Override
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return CategoryApi.super.getCategories();
    }
}

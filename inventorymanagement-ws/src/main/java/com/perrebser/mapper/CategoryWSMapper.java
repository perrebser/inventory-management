package com.perrebser.mapper;

import com.perrebser.model.CategoryDTO;
import com.perrebser.model.CategoryObject;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryWSMapper {

    CategoryDTO asCategoryDTO(CategoryObject categoryObject);

}

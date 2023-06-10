package com.perrebser.mapper;

import com.perrebser.model.ProductDTO;
import com.perrebser.model.ProductObject;
import com.perrebser.model.ProductResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductWSMapper {
    ProductDTO asProductDTO(ProductObject productObject);
    ProductResponseDTO asProductResponseDto(ProductObject productObject);
    ProductObject asProductObject(ProductDTO productDTO);

    List<ProductDTO> asProductDtoList(List<ProductObject> productObjectList);

}

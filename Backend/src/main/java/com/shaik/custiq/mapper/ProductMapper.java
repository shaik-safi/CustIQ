package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.ProductDTO;
import com.shaik.custiq.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}

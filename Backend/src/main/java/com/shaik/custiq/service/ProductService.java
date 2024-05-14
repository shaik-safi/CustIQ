package com.shaik.custiq.service;

import com.shaik.custiq.dto.ProductDTO;

public interface ProductService {
    ProductDTO getProductById(Long id);

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);
}
